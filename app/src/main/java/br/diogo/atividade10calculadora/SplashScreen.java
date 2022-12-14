package br.diogo.atividade10calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                mostrarMainActivity();
            }
        }, 1500);
    }

    private void mostrarMainActivity()
    {
        Intent intent = new Intent(SplashScreen.this,MainActivity.class);
        startActivity(intent);

        finish();
    }
}