package com.example.foodxpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Bundle savedInstanceState;

    @Override
    protected  void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextPhone);

        findViewById(R.id.buttonContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString().trim();

                if(number.isEmpty() || number.length() < 10){
                    editText.setError(" Valid Number is required");
                    editText.requestFocus();
                    return;
                }

                String phoneNumber = + number;

                Intent intent = new Intent(packagesContext:MainActivity.this, VerifyPhoneActivity.class);
                intent.putExtra(name:"phonenumber",phoneNumber);
                startActivity(intent);
            }
        });


    }
}
