package com.example.pragnas.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by npambhala on 18/08/2019.
 */
public class DBHandler extends SQLiteOpenHelper {

    public static final String tablename = "places";  // tablename
    public static final String id = "ID";  // auto generated ID column
    public static final String USERID = "userid";  // column name
    public static final String place = "place";  // column name
    public static final String country = "country"; // column name
    public static final String databasename = "placesinfo"; // Dtabasename
    public static final int versioncode = 1; //versioncode of the database

    public DBHandler(Context context) {
        super(context, databasename, null, versioncode);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        String query;
        query = "CREATE TABLE IF NOT EXISTS " + tablename + "(" + id + " integer primary key, " + place + " text, " + country + " text)";
        database.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int version_old,
                          int current_version) {
        String query;
        query = "DROP TABLE IF EXISTS " + tablename;
        database.execSQL(query);
        onCreate(database);
    }

    public int getValue() {
        int i=1;
        return i;
    }

    public ArrayList<ListPojo> getPreparedArraylistFromDB() {

        ArrayList<ListPojo> al_places = new ArrayList<>();

        String selectQuery = "SELECT  * FROM " + tablename;

        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                ListPojo listPojo = new ListPojo();

                listPojo.setId(cursor.getString(0));
                listPojo.setCity(cursor.getString(1));
                listPojo.setCountry(cursor.getString(2));

                al_places.add(listPojo);
            } while (cursor.moveToNext());
        }
        database.close();

        // return contact list
        return al_places;
    }
}