package com.example.michal.unitraapp.Database.Models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by michal on 17.11.2017.
 */

@Table(name = "DBInfo")
public class DBInfo extends Model {

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public DBInfo(Long info){
        this.version = info;
    }
    public DBInfo(){
        super();
    }

    @Column(name = "Version")
    private Long version;
}
