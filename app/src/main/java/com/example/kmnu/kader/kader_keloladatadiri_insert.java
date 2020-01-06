package com.example.kmnu.kader;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kmnu.R;

public class kader_keloladatadiri_insert extends AppCompatActivity {

    Button insertdatadiri;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kader_keloladatadiri_insert);
        insertdatadiri = findViewById(R.id.simpan_datadiri);

        insertdatadiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
