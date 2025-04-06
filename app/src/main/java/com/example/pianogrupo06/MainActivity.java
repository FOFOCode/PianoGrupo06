package com.example.pianogrupo06;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sonidoDoNormal(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.do_normal);
        if (sonido.isPlaying()) {
            sonido.stop();
            sonido.release();
        } else {
            sonido.start();
        }
    }

    public void sonidoReNormal(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.re_normal);
        if (sonido.isPlaying()) {
            sonido.stop();
            sonido.release();
        } else {
            sonido.start();
        }
    }

    public void sonidoMiNormal(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.mi_normal);
        if (sonido.isPlaying()) {
            sonido.stop();
            sonido.release();
        } else {
            sonido.start();
        }
    }

    public void sonidoFaNormal(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.fa_normal);
        if (sonido.isPlaying()) {
            sonido.stop();
            sonido.release();
        } else {
            sonido.start();
        }
    }

    public void sonidoSolNormal(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.sol_normal);
        if (sonido.isPlaying()) {
            sonido.stop();
            sonido.release();
        } else {
            sonido.start();
        }
    }

    public void sonidoLaNormal(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.la_normal);
        if (sonido.isPlaying()) {
            sonido.stop();
            sonido.release();
        } else {
            sonido.start();
        }
    }

    public void sonidoSiNormal(View view) {
        MediaPlayer sonido = MediaPlayer.create(this, R.raw.si_normal);
        if (sonido.isPlaying()) {
            sonido.stop();
            sonido.release();
        } else {
            sonido.start();
        }
    }
}