package com.basefragment.demo.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/4/27.
 * function：
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private FragmentManager mFragmentManager;
    private List<Fragment> mList;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.mFragmentManager = fm;
        this.mList = list;
    }

    @Override
    public Fragment getItem(int position) {
        if (position < mList.size()) {
            return mList.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    //分类标题
    @Override
    public CharSequence getPageTitle(int position) {
//        return mList.get(position).getTitle();
        return "";
    }
}







