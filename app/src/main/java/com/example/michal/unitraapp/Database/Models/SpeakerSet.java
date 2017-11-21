package com.example.michal.unitraapp.Database.Models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by michal on 17.11.2017.
 */

@Table(name = "SpeakerSets")
public class SpeakerSet extends Model {

    @Column(name = "Id", notNull = true)
    public Integer id;

    @Column(name = "Name")
    public String name;

    @Column(name = "Model")
    public String model;

    @Column(name = "RatedPower")
    public Double ratedPower;

    @Column(name = "MaximumPower")
    public Double maximumPower;

    @Column(name = "Efficiency")
    public String efficiency;

    @Column(name = "Impedance")
    public Integer impedance;

    @Column(name = "FrequencyResponseFrom")
    public Integer frequencyResponceFrom;

    @Column(name = "FrequencyResponseTo")
    public Integer frequencyResponceTo;

    @Column(name = "ConstructionType")
    public String constructionType;

    @Column(name = "Width")
    public Double width;

    @Column(name = "Height")
    public Double height;

    @Column(name = "Depth")
    public Double depth;

    @Column(name = "Weight")
    public Double weight;

    @Column(name = "Woofer")
    public String woofer;

    @Column(name = "MidrangeDriver")
    public String midrangeDriver;

    @Column(name = "Tweeter")
    public String tweeter;

    @Column(name = "Scheme")
    public String scheme;

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

    public void setModel(String model) {
        this.model = model;
    }

    public void setRatedPower(Double ratedPower) {
        this.ratedPower = ratedPower;
    }

    public void setMaximumPower(Double maximumPower) {
        this.maximumPower = maximumPower;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public void setImpedance(Integer impedance) {
        this.impedance = impedance;
    }

    public void setFrequencyResponceFrom(Integer frequencyResponceFrom) {
        this.frequencyResponceFrom = frequencyResponceFrom;
    }

    public void setFrequencyResponceTo(Integer frequencyResponceTo) {
        this.frequencyResponceTo = frequencyResponceTo;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType;
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

    public void setWoofer(String woofer) {
        this.woofer = woofer;
    }

    public void setMidrangeDriver(String midrangeDriver) {
        this.midrangeDriver = midrangeDriver;
    }

    public void setTweeter(String tweeter) {
        this.tweeter = tweeter;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
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