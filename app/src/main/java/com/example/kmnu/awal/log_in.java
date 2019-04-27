package com.example.kmnu.awal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kmnu.R;

public class log_in extends AppCompatActivity {

    Intent log_in;
    Button login;
    EditText user, pass;
    private AlertDialog.Builder builder;
    String teks_user, teks_pass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        login = findViewById(R.id.tombol_login);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks_user = user.getText().toString();
                teks_pass = pass.getText().toString();
                if (teks_user.equalsIgnoreCase("kader") && teks_pass.equalsIgnoreCase("kader")) {
                    Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                    Intent kader_menu = new Intent(view.getContext(), com.example.kmnu.kader.kader_menu.class);
                    startActivity(kader_menu);
                    finish();
                }
            }
        });
    }

    //------------------------------  Untuk tombol back dari hp
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (builder == null) {
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
