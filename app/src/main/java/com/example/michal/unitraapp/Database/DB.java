package com.example.michal.unitraapp.Database;

import android.util.Log;

import com.activeandroid.Model;
import com.activeandroid.query.Select;
import com.example.michal.unitraapp.Database.Models.Amplifier;
import com.example.michal.unitraapp.Database.Models.CassettePlayer;
import com.example.michal.unitraapp.Database.Models.DBInfo;
import com.example.michal.unitraapp.Database.Models.Gramophone;
import com.example.michal.unitraapp.Database.Models.Other;
import com.example.michal.unitraapp.Database.Models.RadioCassettePlayer;
import com.example.michal.unitraapp.Database.Models.Radiola;
import com.example.michal.unitraapp.Database.Models.RadioReceiver;
import com.example.michal.unitraapp.Database.Models.SpeakerSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by michal on 17.11.2017.
 */

public class DB {

    public static void updateDatabase() throws IOException {
       String dbInfo = getHTTPContent(new URL("https://raw.githubusercontent.com/crazydoe/UnitraApp/master/db_files/db_info.txt"));
       if(dbInfo !=null){
           DBInfo dbVersion = RawDBParser.dbInfoParser(dbInfo);

           if(getDBInfo().isEmpty()){
               Log.d("dbVersion: ", dbInfo);



           }
       }
    }

    public static ArrayList<Model> getDBInfo(){
        return new Select().from(DBInfo.class).limit("1").execute();
    }


    public static class Amplifiers{

        public static ArrayList<Amplifier> getAll(){
            return new Select()
                    .from(Amplifier.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static Amplifier getById(Integer id){
            return new Select()
                    .from(Amplifier.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    public static class CassettePlayers{

        public static ArrayList<CassettePlayer> getAll(){
            return new Select()
                    .from(CassettePlayer.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static CassettePlayer getById(Integer id){
            return new Select()
                    .from(CassettePlayer.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    public static class Gramophones{

        public static ArrayList<Gramophone> getAll(){
            return new Select()
                    .from(Gramophone.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static Gramophone getById(Integer id){
            return new Select()
                    .from(Gramophone.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    public static class Others{

        public static ArrayList<Other> getAll(){
            return new Select()
                    .from(Other.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static Other getById(Integer id){
            return new Select()
                    .from(Other.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    public static class RadioCassettePlayers{

        public static ArrayList<RadioCassettePlayer> getAll(){
            return new Select()
                    .from(RadioCassettePlayer.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static RadioCassettePlayer getById(Integer id){
            return new Select()
                    .from(RadioCassettePlayer.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    public static class Radiolas{

        public static ArrayList<Radiola> getAll(){
            return new Select()
                    .from(Radiola.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static Radiola getById(Integer id){
            return new Select()
                    .from(Radiola.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    public static class RadioReceivers{

        public static ArrayList<RadioReceiver> getAll(){
            return new Select()
                    .from(RadioReceiver.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static RadioReceiver getById(Integer id){
            return new Select()
                    .from(RadioReceiver.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    public static class SpeakerSets{

        public static ArrayList<SpeakerSet> getAll(){
            return new Select()
                    .from(SpeakerSet.class)
                    .orderBy("Name ASC")
                    .execute();
        }

        public static SpeakerSet getById(Integer id){
            return new Select()
                    .from(SpeakerSet.class)
                    .where("Id = ?", id)
                    .executeSingle();
        }
    }


    private static String getHTTPContent(URL url) throws IOException {
        HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
        urlConnection.connect();
        StringBuilder sb = new StringBuilder();
        try {
            if(urlConnection.getResponseCode() >= 200 && urlConnection.getResponseCode() < 300) {

                String output;
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(urlConnection.getInputStream())
                );

                while ((output = br.readLine()) != null)
                    sb.append(output).append("\n");

            }else return null;
        } finally {
            urlConnection.disconnect();
        }
        return sb.toString();
    }

}
