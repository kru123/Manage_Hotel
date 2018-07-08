package com.education.user.taj;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 6/6/2018.
 */

public class SqlHandler extends SQLiteOpenHelper {

    public static  final  String Database_Name ="Students.db";
    public static  final  String Table_Name = "Students_table";
    public static  final  String Col1 ="CUSTOMER_ID";
    public static  final  String Col2 ="NAME";
 //   public static  final  String Col3 ="MOBILE";

    public SqlHandler(Context context) {
        super(context, Database_Name, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ Table_Name +"(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+Table_Name);
        onCreate(db);
    }

    public boolean onInsert(String name){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Col2,name);
      //  contentValues.put(Col3,mobile);
        long insert=db.insert(Table_Name,null,contentValues);
        if(insert == -1){
            return false;
        }
        return true;

    }
}
