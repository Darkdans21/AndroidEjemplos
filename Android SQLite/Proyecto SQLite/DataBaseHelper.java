package com.fsw_android.codigomaestro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Student.db";
    public static final String TABLE_NAME = "Student_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NOMBRE";
    public static final String COL_3 = "APELLIDO";
    public static final String COL_4 = "CONTRASEÑA";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NOMBRE TEXT,APELLIDO TEXT,CONTRASEÑA INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }

    public boolean insertData(String nombre, String apellido, String contraseña) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, nombre);
        contentValues.put(COL_3, apellido);
        contentValues.put(COL_4, contraseña);
        long result = db.insert(TABLE_NAME, null, contentValues);
        db.close(); //To Check Whether Data is Inserted in DataBase
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

        public Cursor getAllData() {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("Select * from " + TABLE_NAME, null);
            return res;
        }

    public boolean updateData(String id, String nombre, String apellido, String contraseña) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, nombre);
        contentValues.put(COL_3, apellido);
        contentValues.put(COL_4, contraseña);
        int result = db.update(TABLE_NAME, contentValues, "ID =?", new String[]{id});
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        int i = db.delete(TABLE_NAME, "ID=?", new String[]{id});
        return i;
    }


}