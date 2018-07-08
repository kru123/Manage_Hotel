package com.education.user.taj;

/**
 * Created by user on 7/6/2018.
 */
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;

import com.education.user.taj.Foodtype.Breakfast;
import com.education.user.taj.Foodtype.Chinese;
import com.education.user.taj.Foodtype.Indian;

public class MyAdapter extends FragmentPagerAdapter  {

    private Context context;
    int totalTabs;


   public MyAdapter(Context con,FragmentManager fm, int numOfTabs) {
        super(fm);
        context=con;
        this.totalTabs = numOfTabs;
    }

    // this is for fragment tabs

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Chinese chinese = new Chinese();
                return chinese;
            case 1:
                Indian indian = new Indian();
                return indian;
            case 2:
                Breakfast breakfast = new Breakfast();
                return breakfast;
            default:
                return null;
        }


    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
