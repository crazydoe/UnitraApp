package com.example.michal.unitraapp.Database.Models;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by michal on 17.11.2017.
 */

@Table(name = "DBInfo")
public class DBInfo {

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    @Column(name = "Version")
    private Double version;
}
