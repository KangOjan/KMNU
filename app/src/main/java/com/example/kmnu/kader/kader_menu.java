package com.example.kmnu.kader;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.example.kmnu.R;

public class kader_menu extends AppCompatActivity {

    Intent kader_menu;
    private AlertDialog.Builder builder;
    Button keloladiri, pesanjaket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kader_menu);

        keloladiri = findViewById(R.id.tombol_kelolaDiri);
        pesanjaket = findViewById(R.id.tombol_pesanJaket);

        keloladiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kader_keloladatadiri = new Intent(kader_menu.this, com.example.kmnu.kader.kader_keloladatadiri.class);
                startActivity(kader_keloladatadiri);
                finish();
            }
        });
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            if (builder == null){
                builder = new AlertDialog.Builder(this);
            }
            builder.setTitle("Ingin keluar?");
            builder.setIcon(R.drawable.exit_50);
            builder.setMessage("Pilih Ya untuk keluar")
                    .setCancelable(false)
                    .setPositiveButton("Ya",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            })
                    .setNegativeButton("Tidak",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            }).create().show();
        }
        return false;
    }
}
