package com.example.kmnu.depnas_2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.*;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.example.kmnu.R;

public class dep2_menu extends AppCompatActivity {
    Intent depnas2_menu;
    private AlertDialog.Builder builder;
    Button inputdatakader, viewdatakader;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depnas2_menu);

        inputdatakader = findViewById(R.id.inputDataKader);
        viewdatakader = findViewById(R.id.viewDataKader);


        inputdatakader.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Intent depnas2_inputdatakader = new Intent(depnas2_menu.this, input)
            }
        });
//        keloladiri.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent kader_keloladatadiri = new Intent(kader_menu.this, com.example.kmnu.kader.kader_keloladatadiri.class);
//                startActivity(kader_keloladatadiri);
//                finish();
//            }
//        });
    }
}
