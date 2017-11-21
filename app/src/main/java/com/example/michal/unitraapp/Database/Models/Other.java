package com.example.michal.unitraapp.Database.Models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by michal on 17.11.2017.
 */

@Table(name = "Others")
public class Other extends Model {

    @Column(name = "Id", notNull = true)
    public Integer id;

    @Column(name = "Name")
    public String name;

    @Column(name = "Manufacturer")
    public String manufacturer;

    @Column(name = "Type")
    public String type;

    @Column(name = "Lamp")
    public String lamp;

    @Column(name = "YearOfProduction")
    public Integer yearOfProduction;

    @Column(name = "Width")
    public Double width;

    @Column(name = "Height")
    public Double height;

    @Column(name = "Depth")
    public Double depth;

    @Column(name = "Weight")
    public Double weight;

    @Column(name = "Scheme")
    public String scheme;

    @Column(name = "AdditionalInfo")
    public String additionalInfo;

    @Column(name = "PictureURL1")
    public String pictureUrl1;

    @Column(name = "PictureURL2")
    public String pictureUrl2;

    @Column(name = "PictureURL3")
    public String pictureUrl3;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLamp(String lamp) {
        this.lamp = lamp;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public void setPictureUrl1(String pictureUrl1) {
        this.pictureUrl1 = pictureUrl1;
    }

    public void setPictureUrl2(String pictureUrl2) {
        this.pictureUrl2 = pictureUrl2;
    }

    public void setPictureUrl3(String pictureUrl3) {
        this.pictureUrl3 = pictureUrl3;
    }

}
