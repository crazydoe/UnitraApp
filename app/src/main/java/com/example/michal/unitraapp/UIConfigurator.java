package com.example.michal.unitraapp;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

/**
 * Created by michal on 21.11.2017.
 */

public abstract class UIConfigurator {

    private String toolbarTittle;
    private Integer drawerActivePosition;
    private Toolbar toolbar;
    private Drawer drawer;
    private AppCompatActivity activity;


    public UIConfigurator(AppCompatActivity activity, String toolbarTittle, Integer drawerActivePosition){
        this.activity = activity;
        this.toolbarTittle = toolbarTittle;
        this.drawerActivePosition = drawerActivePosition;
    }


    void setUi(){
        toolbar = activity.findViewById(R.id.toolbar);
        toolbar.setTitle("");
        final TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText(toolbarTittle);
        mTitle.setTypeface(Typefaces.getSfIuDisplayRegular(activity));
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activity.getSupportActionBar().setHomeButtonEnabled(true);


        drawer = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(toolbar)
                .withSliderBackgroundColorRes(R.color.BackgroundGrayColor)
                .withCloseOnClick(true)
                .withHeader(R.layout.drawer_header)
                .withSelectedItem(drawerActivePosition)
                .addDrawerItems(
                        new PrimaryDrawerItem()
                                .withName("Kategorie")
                                .withTypeface(Typefaces.getSfIuDisplayLight(activity))
                                .withTextColorRes(R.color.textColor)
                                .withIdentifier(1)
                                .withSelectedTextColorRes(R.color.BackgroundLightGrayColor),
                        new PrimaryDrawerItem()
                                .withName("Moja Kolekcja")
                                .withIdentifier(2)
                                .withTypeface(Typefaces.getSfIuDisplayLight(activity))
                                .withTextColorRes(R.color.textColor)
                                .withSelectedTextColorRes(R.color.BackgroundLightGrayColor),
                        new PrimaryDrawerItem()
                                .withName("Katalogi Archiwalne")
                                .withIdentifier(3)
                                .withTypeface(Typefaces.getSfIuDisplayLight(activity))
                                .withTextColorRes(R.color.textColor)
                                .withSelectedTextColorRes(R.color.BackgroundLightGrayColor),
                        new PrimaryDrawerItem()
                                .withName("Fanklub Unitra & Tonsil Polska")
                                .withIdentifier(4)
                                .withTypeface(Typefaces.getSfIuDisplayLight(activity))
                                .withTextColorRes(R.color.textColor)
                                .withSelectedTextColorRes(R.color.BackgroundLightGrayColor),
                        new PrimaryDrawerItem()
                                .withName("O Autorach")
                                .withIdentifier(5)
                                .withTypeface(Typefaces.getSfIuDisplayLight(activity))
                                .withTextColorRes(R.color.textColor)
                                .withSelectedTextColorRes(R.color.BackgroundLightGrayColor))
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if(drawerItem != null){
                            onDrawerItemClick(position);
                            if(drawerItem.getIdentifier() == 1){
                                mTitle.setText("UnitraApp");
                                return true;
                            }else if(drawerItem.getIdentifier() == 2){
                                mTitle.setText("Moja Kolekcja");
                                return true;
                            }else if(drawerItem.getIdentifier() == 3){
                                mTitle.setText("Katalogi Archiwalne");
                                return true;
                            }else if(drawerItem.getIdentifier() == 5){
                                mTitle.setText("O Autorach");
                                return true;
                            }
                        }
                        return false;
                    }
                })
                .build();

    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public abstract void onDrawerItemClick(Integer position);
}
