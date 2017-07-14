package com.basefragment.demo.fragment;

import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.basefragment.demo.R;

import java.util.Random;

import butterknife.BindView;

/**
 * Created by Yk on 2017/6/19.
 */

public class SecondFragment extends BaseFragment {


    @BindView(R.id.tv_onefragment)
    TextView tv;
    @BindView(R.id.toolbar_title)
    TextView toolbar_title;
    @BindView(R.id.fake_status_bar)
    View mTvTitle;
    @BindView(R.id.toobar_view)
    RelativeLayout toobar_view;

    @Override
    protected int setContentView() {
        return R.layout.fragment_test;
    }
    //第二个页面
    @Override
    protected void initView(View view) {
        tv.setText("第2页面");
        toolbar_title.setText("第2页");
        Log.e("Second", "在这里进行初始化界面操作");
        setTvTitleBackgroundColor();
    }


    @Override
    protected void onUserVisible() {
        Log.e("Second", "第2个页面可见时操作");
    }

    @Override
    protected void onUserInvisible() {
        Log.e("Second", "第2个页面不可见了");
    }

    @Override
    protected void onBaseDestroyView() {
        Log.e("Second", "第2个页面销毁操作");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        ButterKnife.reset(this);
    }

    public void setTvTitleBackgroundColor() {
        Random random = new Random();
        int color = 0xff000000 | random.nextInt(0xffffff);
        mTvTitle.setBackgroundColor(color);
        toobar_view.setBackgroundColor(color);
    }
}
