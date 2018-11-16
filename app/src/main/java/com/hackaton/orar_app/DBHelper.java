package com.hackaton.orar_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "DBHelper.db";

    public static final String ORAR_TABLE_NAME = "orar";
    public static final String ORAR_COLUMN_ID = "id";
    public static final String ORAR_COLUMN_ID_DAY = "day";
    public static final String ORAR_COLUMN_HOUR = "hour";
    public static final String ORAR_COLUMN_ID_PROF = "prof";
    public static final String ORAR_COLUMN_ID_CLASS = "class";
    public static final String ORAR_COLUMN_ID_SUBJECT = "subject";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table orar " +
                        "(id integer primary key, day text, hour text, prof text, class text, subject text)"
        );
    }

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS orar");
        onCreate(db);

    }

    public boolean insertOrar (String day, String hour, String prof, String schoolclass,String subject) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("day", day);
        contentValues.put("hour", hour);
        contentValues.put("prof", prof);
        contentValues.put("class", schoolclass);
        contentValues.put("subject", subject);
        db.insert("orar", null, contentValues);
        return true;
    }

    public Cursor getData(int id_prof) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts where prof="+id_prof+"", null );
        return res;
    }

    public boolean updateContact (Integer id, String day, String hour, String prof, String schoolclass,String subject) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("day", day);
        contentValues.put("hour", hour);
        contentValues.put("prof", prof);
        contentValues.put("class", schoolclass);
        contentValues.put("subject", subject);
        db.update("contacts", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }



}
