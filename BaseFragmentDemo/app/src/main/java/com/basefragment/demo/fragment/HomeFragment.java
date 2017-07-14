package com.basefragment.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.basefragment.demo.R;
import com.basefragment.demo.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 直播列表页面
 */
public class HomeFragment extends Fragment {


    @BindView(R.id.vPager)
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    List<Fragment> mList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        onFirstUserVisible();

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
//                        Random random = new Random();
//                        int color = 0xff000000 | random.nextInt(0xffffff);
//                        ((FirstFragment) mList.get(position)).setTvTitleBackgroundColor(color);
                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        return view;
    }


    protected void onFirstUserVisible() {
        mList = new ArrayList<Fragment>();
        mList.add(new FirstFragment());
        mList.add(new SecondFragment());
        mList.add(new ThirdFragment());
        mList.add(new ImgFragment());
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), mList);
        viewPager.setAdapter(viewPagerAdapter);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        ButterKnife.reset(this);
    }

}
