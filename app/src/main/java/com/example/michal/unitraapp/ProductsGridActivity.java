package com.example.michal.unitraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProductsGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_grid);

        new UIConfigurator(this, "Jakas kategoria", 1) {
            @Override
            public void onDrawerItemClick(Integer position) {

            }
        }.setUi();

    }
}
