package com.example.pianogrupo06;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PianoAnimales extends AppCompatActivity {

    private boolean sustainActivo = false;
    private Toast currentToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_piano_animales);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




    }

    private void mostrarToast(String mensaje) {
        // Si ya hay un Toast visible, cancelarlo
        if (currentToast != null) {
            currentToast.cancel();
        }

        // Crear el nuevo Toast
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.toast_message));

        // Cambiar el texto del Toast
        TextView text = layout.findViewById(R.id.toast_message);
        text.setText(mensaje);

        // Crear e mostrar el nuevo Toast
        currentToast = new Toast(getApplicationContext());
        currentToast.setDuration(Toast.LENGTH_SHORT);
        currentToast.setView(layout);
        currentToast.show();
    }

    public void tocarJaguar(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.do_sustain) :
                MediaPlayer.create(this, R.raw.jaguar);
        sonido.start();
        mostrarToast("Jaguar");
    }

    public void tocarElefante(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.re_sustain) :
                MediaPlayer.create(this, R.raw.elefante);
        sonido.start();
        mostrarToast("Elefante");
    }

    public void tocarLoro(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.mi_sustain) :
                MediaPlayer.create(this, R.raw.loro);
        sonido.start();
        mostrarToast("Guacamayo");
    }

    public void tocarSerpiente(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.fa_sustain) :
                MediaPlayer.create(this, R.raw.serpiente);
        sonido.start();
        mostrarToast("Serpiente");
    }

    public void tocarRana(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.sol_sustain) :
                MediaPlayer.create(this, R.raw.rana);
        sonido.start();
        mostrarToast("Rana");
    }

    public void tocarMono(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.la_sustain) :
                MediaPlayer.create(this, R.raw.mono);
        sonido.start();
        mostrarToast("Mono");
    }

    public void tocarTigre(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.si_sustain) :
                MediaPlayer.create(this, R.raw.tigre);
        sonido.start();
        mostrarToast("Tigre");
    }



}