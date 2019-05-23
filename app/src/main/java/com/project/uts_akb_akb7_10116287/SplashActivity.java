package com.project.uts_akb_akb7_10116287;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
        finish();
    }

    /* 20 Mei 2019
        10116287
        Vanadia Aviandi
        AKB 7
     */
}