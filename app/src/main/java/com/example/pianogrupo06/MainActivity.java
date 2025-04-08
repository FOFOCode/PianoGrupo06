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
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer currentSostenido;
    private Button btnSustain;

    private boolean sustainActivo = false;
    private Toast currentToast;  // Variable para almacenar el Toast actual


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnSustain = findViewById(R.id.btnSustain);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnSustain.setOnClickListener(v -> {
            sustainActivo = !sustainActivo; // Cambia el estado

            if (sustainActivo) {
                btnSustain.setTextColor(ContextCompat.getColor(this, android.R.color.holo_green_light));  // Cambia el color del texto
            } else {
                btnSustain.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_light));  // Cambia el color del texto a blanco
            }
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

    public void tocarDo(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.do_sustain) :
                MediaPlayer.create(this, R.raw.do_normal);
        sonido.start();
        mostrarToast("Do");
    }

    public void tocarRe(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.re_sustain) :
                MediaPlayer.create(this, R.raw.re_normal);
        sonido.start();
        mostrarToast("Re");
    }

    public void tocarMi(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.mi_sustain) :
                MediaPlayer.create(this, R.raw.mi_normal);
        sonido.start();
        mostrarToast("Mi");
    }

    public void tocarFa(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.fa_sustain) :
                MediaPlayer.create(this, R.raw.fa_normal);
        sonido.start();
        mostrarToast("Fa");
    }

    public void tocarSol(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.sol_sustain) :
                MediaPlayer.create(this, R.raw.sol_normal);
        sonido.start();
        mostrarToast("Sol");
    }

    public void tocarLa(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.la_sustain) :
                MediaPlayer.create(this, R.raw.la_normal);
        sonido.start();
        mostrarToast("La");
    }

    public void tocarSi(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.si_sustain) :
                MediaPlayer.create(this, R.raw.si_normal);
        sonido.start();
        mostrarToast("Si");
    }

    public void tocarDoSostenido(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.do_sostenido_sustain) :
                MediaPlayer.create(this, R.raw.csostenido);
        sonido.start();
        mostrarToast("Do sostenido");
    }

    public void tocarReSostenido(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.re_sostenido_sustain) :
                MediaPlayer.create(this, R.raw.dsostenido);
        sonido.start();
        mostrarToast("Re sostenido");
    }

    public void tocarFaSostenido(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.fa_sostenido_sustain) :
                MediaPlayer.create(this, R.raw.fsostenido);
        sonido.start();
        mostrarToast("Fa sostenido");
    }

    public void tocarSolSostenido(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.sos_sostenido_sustain) :
                MediaPlayer.create(this, R.raw.gsostenido);
        sonido.start();
        mostrarToast("Sol sostenido");
    }

    public void tocarLaSostenido(View view) {
        MediaPlayer sonido = sustainActivo ?
                MediaPlayer.create(this, R.raw.la_sostenido_sustain) :
                MediaPlayer.create(this, R.raw.asostenido);
        sonido.start();
        mostrarToast("La sostenido");
    }
}
