package com.example.joker.govip.ui.initialization_screen;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.joker.govip.R;
import com.example.joker.govip.ui.login.LoginActivity;


/**

 O Objetivo desta activity é mostar o logo da marca, e verificar se o usuário esta logado ou não
    -Caso usuario logado
        -carregar a lista de restaurantes na activity list restaurants, mostrar a tela do logo até carregar as imagens
    -Case usuario deslogado
        -Levar o usuario para a tela de login

 **/

public class InitializationActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialization);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(InitializationActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }

        }, SPLASH_TIME_OUT);

    }
}
