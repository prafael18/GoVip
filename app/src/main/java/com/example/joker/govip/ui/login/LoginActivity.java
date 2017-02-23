package com.example.joker.govip.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.joker.govip.R;
import com.example.joker.govip.ui.login.signin.SignInActivity;

public class LoginActivity extends AppCompatActivity {

    ImageButton signUpButton, signInButton, exploreButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initializeScreen ();

    }

    private void initializeScreen() {
        signUpButton = (ImageButton) findViewById(R.id.image_button_sign_up_activity_login);
        signUpButton.setOnClickListener(onClicks(signUpButton.getId()));
        signInButton = (ImageButton) findViewById(R.id.image_button_sign_in_activity_login);
        signInButton.setOnClickListener(onClicks(signInButton.getId()));
        exploreButton = (ImageButton) findViewById(R.id.image_button_explore_activity_login);
        exploreButton.setOnClickListener(onClicks(exploreButton.getId()));

    }

    private View.OnClickListener onClicks (int id) {

        switch (id) {
            case R.id.image_button_sign_up_activity_login:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                };
            case R.id.image_button_sign_in_activity_login:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(LoginActivity.this, SignInActivity.class);
                        startActivity(intent);
                    }
                };
            case R.id.image_button_explore_activity_login:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                };
            default:
                return null;
        }
    }
}
