package com.education.user.taj;

/**
 * Created by user on 5/11/2018.


import android.content.Context;
import android.content.SharedPreferences;

/**

public class PrefManager {

    Context context;

    PrefManager(Context context) {
        this.context = context;
    }


    public boolean saveLoginDetails(String username, String college, String emailid) {

        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Username", username);
        editor.putString("College", college);
        editor.putString("Email", emailid);
        editor.apply();
        getUsername();
        getCollege();
        getEmailid();
        isUserLogedOut();
        return true;

    }

    public String getUsername() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        return sharedPreferences.getString("Username", "");
    }

    public String getCollege() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        return sharedPreferences.getString("College", "");
    }

    public String getEmailid() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        return sharedPreferences.getString("Email", "");
    }

    public boolean isUserLogedOut() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        boolean isUsernameEmpty = sharedPreferences.getString("Username", "").isEmpty();
        boolean isCollegeEmpty = sharedPreferences.getString("College", "").isEmpty();
        boolean isEmailEmpty = sharedPreferences.getString("Email", "").isEmpty();
        return isEmailEmpty || isCollegeEmpty || isUsernameEmpty;
    }

}*/