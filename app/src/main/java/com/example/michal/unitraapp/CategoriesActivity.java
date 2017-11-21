package com.example.michal.unitraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.example.michal.unitraapp.Adapters.CategoriesListAdapter;
import com.example.michal.unitraapp.Adapters.Models.CategoryModel;
import java.util.ArrayList;


public class CategoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        new UIConfigurator(this, "UnitraApp", 1) {
            @Override
            public void onDrawerItemClick(Integer position) {

                Log.d("DUPA", "onDrawerItemClick: KLIKNIĘTE!");

            }
        }.setUi();

        recyclerView = findViewById(R.id.categories_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new CategoriesListAdapter(CategoriesData.getDataSet(), this);
        recyclerView.setAdapter(adapter);
    }

    static class CategoriesData{
        private static ArrayList<CategoryModel> dataSet =  new ArrayList<>();

        static {
            dataSet.add(new CategoryModel(0, "Radioodbiorniki", R.drawable.przykladowe1));
            dataSet.add(new CategoryModel(1, "Wzmacniacze", R.drawable.przykladowe1));
            dataSet.add(new CategoryModel(2, "Gramofony", R.drawable.przykladowe1));
            dataSet.add(new CategoryModel(3, "Zestawy Głośnikowe", R.drawable.przykladowe1));
            dataSet.add(new CategoryModel(4, "Magnetofony", R.drawable.przykladowe1));
            dataSet.add(new CategoryModel(5, "Radiomagnetofony", R.drawable.przykladowe1));
            dataSet.add(new CategoryModel(6, "Radiole", R.drawable.przykladowe1));
            dataSet.add(new CategoryModel(7, "Inne", R.drawable.przykladowe1));
        }

        public static ArrayList<CategoryModel>getDataSet(){
            return dataSet;
        }
    }


}
