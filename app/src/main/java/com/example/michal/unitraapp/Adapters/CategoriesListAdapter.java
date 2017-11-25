package com.example.michal.unitraapp.Adapters;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.michal.unitraapp.Adapters.Models.CategoryModel;
import com.example.michal.unitraapp.CategoriesListActivity;
import com.example.michal.unitraapp.Database.DB;
import com.example.michal.unitraapp.ProductsGridActivity;
import com.example.michal.unitraapp.R;
import com.example.michal.unitraapp.Typefaces;

import java.util.ArrayList;

/**
 * Created by michal on 20.11.2017.
 */

public class CategoriesListAdapter extends RecyclerView.Adapter<CategoriesListAdapter.ViewHolder> {

    private ArrayList<CategoryModel> dataSet;
    private Context context;

    public CategoriesListAdapter(ArrayList<CategoryModel> dataSet, Context context){
        this.dataSet = dataSet;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_card_layout, parent, false);

        view.setOnClickListener(CategoriesListActivity.onClickListener);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextView textViewName = holder.textViewName;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(position).getName());
        textViewName.setTypeface(Typefaces.getSfIuDisplayRegular(context));

        imageView.setImageResource(dataSet.get(position).getPhotoId());
        //imageView.setImageResource(R.drawable.przykladowe1);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        ImageView imageViewIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    public class OnClickListener implements View.OnClickListener {

        private final Context context;

        private OnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {

        }


    }




}
