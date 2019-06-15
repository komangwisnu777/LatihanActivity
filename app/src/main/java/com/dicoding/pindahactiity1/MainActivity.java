package com.dicoding.pindahactiity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnHalLogin, btnHalAlert, btnHalInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHalLogin = findViewById(R.id.btn_hal_login);
        btnHalLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

        btnHalAlert = findViewById(R.id.btn_hal_alert);
        btnHalAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main3Activity.class));
            }
        });

        btnHalInflater = findViewById(R.id.btn_hal_inflater);
        btnHalInflater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main4Activity.class));
            }
        });

    }
}
