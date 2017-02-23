package com.example.joker.govip.ui.login.signup;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.joker.govip.R;
import com.example.joker.govip.ui.login.signin.SignInActivity;

public class SignUpActivity extends AppCompatActivity {

    FrameLayout layout;
    Toolbar toolbar;
    EditText firstNameEditText, lastNameEditText, emailEditText, passwordEditText, dddEditText, phoneEditText;
    Button createAccountButton;
    TextView loginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initializeScreen ();
    }

    private void initializeScreen() {

        layout = (FrameLayout) findViewById(R.id.layout_activity_sign_in);
        layout.setOnClickListener(onClicks(layout.getId()));

        toolbar = (Toolbar) findViewById(R.id.toolbar_activity_sign_up);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("");
        }

        firstNameEditText = (EditText) findViewById(R.id.edit_text_first_name_activity_sign_up);
        lastNameEditText = (EditText) findViewById(R.id.edit_text_last_name_activity_sign_up);
        emailEditText = (EditText) findViewById(R.id.edit_text_email_activity_sign_up);
        passwordEditText = (EditText) findViewById(R.id.edit_text_password_activity_sign_up);
        dddEditText = (EditText) findViewById(R.id.edit_text_ddd_activity_sign_up);
        phoneEditText = (EditText) findViewById(R.id.edit_text_phone_activity_sign_up);

        createAccountButton = (Button) findViewById(R.id.button_create_account_activity_sign_up);
        createAccountButton.setOnClickListener(onClicks(createAccountButton.getId()));

        loginTextView = (TextView) findViewById(R.id.text_view_login_activity_sign_up);
        loginTextView.setOnClickListener(onClicks(loginTextView.getId()));
    }

    private View.OnClickListener onClicks(int id) {

        switch (id) {
            case R.id.layout_activity_sign_in:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        InputMethodManager inputMethodManager =
                                (InputMethodManager) SignUpActivity.this.getSystemService(
                                        Activity.INPUT_METHOD_SERVICE);
                        inputMethodManager.hideSoftInputFromWindow(
                                SignUpActivity.this.getCurrentFocus().getWindowToken(), 0);
                    }
                };
            case R.id.button_create_account_activity_sign_up:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /**


                           Subir os dados do usuário para o Firebase e Autenticar


                         */

                    }
                };
            case R.id.text_view_login_activity_sign_up:
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                        startActivity(intent);
                        finish();
                    }
                };
            default:
                return null;
        }

    }


}
