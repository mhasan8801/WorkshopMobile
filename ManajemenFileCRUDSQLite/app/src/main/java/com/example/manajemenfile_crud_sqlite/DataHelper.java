package com.example.manajemenfile_crud_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "biodata_diri.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "CREATE TABLE biodata(no integer PRIMARY KEY, nama text NULL, tgl text NULL, jk text NULL, alamat text NULL);";
        Log.d("Data", "onCreate: " +sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // TODO Auto-generated method stub
    }
}
