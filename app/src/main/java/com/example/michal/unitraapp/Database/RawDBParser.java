package com.example.michal.unitraapp.Database;

import com.example.michal.unitraapp.Database.Models.DBInfo;

/**
 * Created by michal on 25.11.2017.
 */

public class RawDBParser {
    public static DBInfo dbInfoParser(String dbInfo){
        return new DBInfo(Long.parseLong("12"));
    }

}
