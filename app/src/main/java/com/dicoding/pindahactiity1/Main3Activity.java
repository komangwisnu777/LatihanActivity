package com.dicoding.pindahactiity1;

import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private Button btnAlertDialog, btnToast, btnSnackbar, btnListDialog;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        context = getBaseContext();
        btnToast = findViewById(R.id.btn_toast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "hore saya bisa bikin Toast ....", Toast.LENGTH_SHORT).show();
            }
        });

        btnSnackbar = findViewById(R.id.btn_snackbar);
        btnSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "tampilkan pesan lewat snackbar", Snackbar.LENGTH_LONG).show();
            }
        });

        btnAlertDialog = findViewById(R.id.btn_alert_dialog);
        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main3Activity.this);
                builder.setTitle("Judul dialog");
                builder.setMessage("pesan yang mau disampaikan");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Main3Activity.this, "saya pasti pilih OK", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Saya pilih Cancel lho", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("Wait a sec", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "Tunggu saya mau pilih yang mana ya ...", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        btnListDialog = findViewById(R.id.btn_list_dialog);
        btnListDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final String[] pilihan = {"makanan", "uang", "mainan", "baju", "buku", "semuanya aja"};

                AlertDialog.Builder buider = new AlertDialog.Builder(Main3Activity.this)
                    .setTitle("Pilih aja mau yang mana")
                    .setItems(pilihan, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        switch (which) {
//                            case 0 : Snackbar.make(v,"saya pilih makanan", Snackbar.LENGTH_LONG).show();
//                                        break;
//
//                            case 1 : Snackbar.make(v, "saya pilih uang", Snackbar.LENGTH_LONG).show();
//                                        break;
//                        }
                        Snackbar.make(v,"saya pilih "+pilihan[which],Snackbar.LENGTH_LONG).show();
                    }
                });
                AlertDialog dialog = buider.create();
                dialog.show();

            }
        });

    }


}
