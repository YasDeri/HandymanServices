package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TDP extends AppCompatActivity {

    Button button, submitBtn;
    EditText time, date, address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdp);

        button=findViewById(R.id.back);
        submitBtn = findViewById(R.id.submitBtn);
        time = findViewById(R.id.time);
        date = findViewById(R.id.date);
        address = findViewById(R.id.address);
        submitBtn = findViewById(R.id.submitBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TDP.this,Drawer.class);
                startActivity(intent);
            }
        });
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(time.getText().toString().isEmpty()){
                    time.setError("This field can't be empty");
                }
                if(date.getText().toString().isEmpty()){
                    date.setError("This field can't be empty");
                }
                if(address.getText().toString().isEmpty()){
                    address.setError("This field can't be empty");
                }
            }
        });
    }
}
