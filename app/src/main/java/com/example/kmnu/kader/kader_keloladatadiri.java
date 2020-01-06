package com.example.kmnu.kader;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.kmnu.R;

public class kader_keloladatadiri extends AppCompatActivity {

    Intent kader_keloladatadiri;
    Button insertData, viewData, editData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kader_keloladatadiri);

        insertData = findViewById(R.id.tombol_inputDataDiri);
        viewData = findViewById(R.id.tombol_viewDataDiri);
        editData = findViewById(R.id.tombol_editDataDiri);

        insertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kader_keloladatadiri_insert = new Intent(kader_keloladatadiri.this, com.example.kmnu.kader.kader_keloladatadiri_insert.class);
                startActivity(kader_keloladatadiri_insert);
                finish();
            }
        });
    }
}
