package com.example.michal.unitraapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.michal.unitraapp.Adapters.CategoriesListAdapter;
import com.example.michal.unitraapp.Adapters.Models.CategoryModel;
import com.example.michal.unitraapp.Database.DB;

import java.util.ArrayList;


public class CategoriesListActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    public static View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        new UIConfigurator(this, "UnitraApp", 1) {
            @Override
            public void onDrawerItemClick(Integer position) {

            }
        }.setUi();

        onClickListener = new CategoriesOnClickListener(this);
        recyclerView = findViewById(R.id.categories_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new CategoriesListAdapter(CategoriesData.getDataSet(), this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {

    }



    private class CategoriesOnClickListener implements View.OnClickListener {

        private final Context context;

        private CategoriesOnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            int itemPosition = recyclerView.getChildPosition(v);

            final ProgressDialog dialog = new ProgressDialog(CategoriesListActivity.this);
            dialog.setMessage("Wczytywanie..");
            dialog.show();

            final Intent intent = new Intent(
                    CategoriesListActivity.this,
                    ProductsGridActivity.class
            );

            switch(itemPosition) {
                case 0:
                    //intent.putExtra("PassedCollection", DB.RadioReceivers.getAll());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                case 1:
                   // intent.putExtra("PassedCollection", DB.Amplifiers.getAll());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                case 2:
                    //intent.putExtra("PassedCollection", DB.Gramophones.getAll());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                case 3:
                    //intent.putExtra("PassedCollection", DB.SpeakerSets.getAll());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                case 4:
                    //intent.putExtra("PassedCollection", DB.CassettePlayers.getAll());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                case 5:
                    //intent.putExtra("PassedCollection", DB.RadioCassettePlayers.getAll());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                case 6:
                    //intent.putExtra("PassedCollection", DB.Radiolas.getAll());
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                case 7:
                    dialog.show();
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            //intent.putExtra("PassedCollection", DB.Others.getAll());
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    }).start();
                    break;
                default:
                    break;

            }
        }
    }


    static class CategoriesData{
        private static ArrayList<CategoryModel> dataSet =  new ArrayList<>();

        static {
            dataSet.add(new CategoryModel(
                    0,
                    "Radioodbiorniki",
                    R.drawable.icon_radio
            ));
            dataSet.add(new CategoryModel(
                    1,
                    "Wzmacniacze",
                    R.drawable.icon_amp
            ));
            dataSet.add(new CategoryModel(
                    2,
                    "Gramofony",
                    R.drawable.icon_gramophone
            ));
            dataSet.add(new CategoryModel(
                    3,
                    "Zestawy Głośnikowe",
                    R.drawable.icon_speakers
            ));
            dataSet.add(new CategoryModel(
                    4,
                    "Magnetofony",
                    R.drawable.icon_tape
            ));
            dataSet.add(new CategoryModel(
                    5,
                    "Radiomagnetofony",
                    R.drawable.icon_radio_casette
            ));
            dataSet.add(new CategoryModel(
                    6,
                    "Radiole",
                    R.drawable.przykladowe1
            ));
            dataSet.add(new CategoryModel(
                    7,
                    "Inne",
                    R.drawable.icon_others
            ));
        }

        public static ArrayList<CategoryModel>getDataSet(){
            return dataSet;
        }
    }


}
