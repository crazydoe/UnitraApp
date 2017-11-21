package com.example.michal.unitraapp.Adapters.Models;

/**
 * Created by michal on 20.11.2017.
 */

public class CategoryModel {
    private Integer id;
    private String name;
    private Integer photoId;

    public CategoryModel(Integer id, String name, Integer photoId){
        this.id = id;
        this.name = name;
        this.photoId = photoId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPhotoId() {
        return photoId;
    }
}
