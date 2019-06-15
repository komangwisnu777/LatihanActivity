package com.dicoding.pindahactiity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    public LinearLayout kontenUtama;
    private Button btnInflateLayout1, btnInflateLayout2, btnInflateReset;
    private String layoutAktif = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        kontenUtama = findViewById(R.id.konten_utama);

        btnInflateLayout1 = findViewById(R.id.btn_inflate_layout1);
        btnInflateLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutAktif == "sub1") {
                    Toast.makeText(Main4Activity.this, "woaaaw...., sublayout1 sudah ada ....", Toast.LENGTH_SHORT).show();
                } else {
                    kontenUtama.removeAllViews();
                    View sub1 = getLayoutInflater().inflate(R.layout.sub_layout1, kontenUtama, false);
                    kontenUtama.addView(sub1);
                    layoutAktif = "sub1";
                }
            }
        });

        btnInflateLayout2 = findViewById(R.id.btn_inflate_layout2);
        btnInflateLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutAktif == "sub2") {
                    Toast.makeText(Main4Activity.this,"woooaaw...., sublayout2 sudah ada .....", Toast.LENGTH_SHORT).show();
                } else {
                    kontenUtama.removeAllViews();
                    View sub2 = getLayoutInflater().inflate(R.layout.sub_layout2, kontenUtama, false);
                    kontenUtama.addView(sub2);
                    layoutAktif = "sub2";
                }
            }
        });

        btnInflateReset = findViewById(R.id.btn_inflate_reset);
        btnInflateReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutAktif = "";
                kontenUtama.removeAllViews();
                Toast.makeText(Main4Activity.this, "lenyap sudah semua view nya ....", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
