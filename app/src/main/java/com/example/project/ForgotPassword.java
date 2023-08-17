package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {


    Button resetPasswordBtn;
    EditText emailEdtTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        resetPasswordBtn = findViewById(R.id.resetPasswordBtn);
        emailEdtTxt = findViewById(R.id.emailEdtTxt);
        resetPasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailStr = emailEdtTxt.getText().toString();
                if(emailStr.isEmpty()){
                    emailEdtTxt.setError("Email field can't be empty");
                }
            }
        });
    }
}
