package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp2 extends AppCompatActivity {

    EditText houseAddress, street, phase, area, city, province;
    Button signUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);
        houseAddress = findViewById(R.id.houseAddress);
        street = findViewById(R.id.streetAddress);
        phase = findViewById(R.id.phase);
        area = findViewById(R.id.area);
        city = findViewById(R.id.city);
        province = findViewById(R.id.province);
        signUpBtn = findViewById(R.id.signUpBtn);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(houseAddress.getText().toString().isEmpty()){
                    houseAddress.setError("This field can't be empty");
                }
                if(street.getText().toString().isEmpty()){
                    street.setError("This field can't be empty");
                }
                if(phase.getText().toString().isEmpty()){
                    phase.setError("This field can't be empty");
                }
                if(area.getText().toString().isEmpty()){
                    area.setError("This field can't be empty");
                }
                if(city.getText().toString().isEmpty()){
                    city.setError("This field can't be empty");
                }
                if(province.getText().toString().isEmpty()){
                    province.setError("This field can't be empty");
                }
            }
        });
    }
}
