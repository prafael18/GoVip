package com.example.joker.govip.ui.login.signup;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;

import com.example.joker.govip.R;

public class SignUpActivity extends AppCompatActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initializeScreen ();
    }

    private void initializeScreen() {
        layout = (LinearLayout) findViewById(R.id.layout_activity_sign_in);
        layout.setOnClickListener(onClicks(layout.getId()));
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
            default:
                return null;
        }

    }


}
