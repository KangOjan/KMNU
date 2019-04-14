package com.example.kmnu;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class kader_menu extends AppCompatActivity {

    Intent kader_menu;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kader_menu);
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
