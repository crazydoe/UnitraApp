package com.example.michal.unitraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, CategoriesListActivity.class);

        // TODO permissions check

        // TODO check database version. If up to date - run Categories activity, if not - update whole database

        startCategoriesActivity();
    }

    private void startCategoriesActivity() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 1400 );

    }
}
