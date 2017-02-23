package com.example.joker.govip.ui.login.signin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.joker.govip.R;
import com.example.joker.govip.ui.login.signup.SignUpActivity;

public class SignInActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText emailEditText, passwordEditText;
    Button signInButton;
    TextView signUpTextView, forgotPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initializeScreen ();

    }

    private void initializeScreen() {

        toolbar = (Toolbar) findViewById(R.id.toolbar_activity_sign_in);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("");
        }

        emailEditText = (EditText) findViewById(R.id.edit_text_email_activity_sign_in);
        passwordEditText = (EditText) findViewById(R.id.edit_text_password_activity_sign_in);

        signInButton = (Button) findViewById(R.id.button_sign_in_activity_sign_in);
        signInButton.setOnClickListener(onClicks(signInButton.getId()));

        signUpTextView = (TextView) findViewById(R.id.text_view_sign_up_activity_sign_in);
        signUpTextView.setOnClickListener(onClicks(signUpTextView.getId()));
        forgotPasswordTextView = (TextView) findViewById(R.id.text_view_forgot_password_activity_sign_in);
        forgotPasswordTextView.setOnClickListener(onClicks(forgotPasswordTextView.getId()));
    }

    private View.OnClickListener onClicks(int id) {

        switch (id) {
            case R.id.button_sign_in_activity_sign_in:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /**

                        Verificar se o usuário existe, e autenticar ele


                         */

                    }
                };
            case R.id.text_view_sign_up_activity_sign_in:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                        startActivity(intent);
                        finish();
                    }
                };
            case R.id.text_view_forgot_password_activity_sign_in:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /**

                         Redefinir a senha do usuário


                         */

                    }
                };
            default:
                return null;
        }
    }
}
