package com.example.kmnu.awal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.example.kmnu.R;

public class KMNU_Present extends AppCompatActivity {

    private long ms = 0;
    private long splashDuration = 5000;
    private boolean splashActive = true;
    private boolean paused = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.kmnu_present);

        Thread th = new Thread(){
            @Override
            public void run() {
                try {
                    while (splashActive && ms < splashDuration) {
                        if (!paused)
                            ms = ms + (60);
                        sleep(60);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent i = new Intent(KMNU_Present.this, log_in.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        th.start();
    }
}
