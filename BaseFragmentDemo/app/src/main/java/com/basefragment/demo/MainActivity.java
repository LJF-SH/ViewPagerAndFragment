package com.basefragment.demo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.basefragment.demo.fragment.HomeFragment;
import com.basefragment.demo.fragment.ImgFragment;
import com.basefragment.demo.utils.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rb_one)
    RadioButton rbOne;
    @BindView(R.id.rb_two)
    RadioButton rbTwo;
    @BindView(R.id.rg)
    RadioGroup rg;
    @BindView(R.id.fl_body)
    FrameLayout flBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        com.basefragment.demo.utils.StatusBarUtil.setColor(com.basefragment.demo.MainActivity.this, getResources().getColor(R.color.colorAccent), 0);
        StatusBarUtil.setTransparentForImageViewInFragment(MainActivity.this, null);
        init();
    }

    private void init() {
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i) {
                    case R.id.rb_one:
                        switchFragment(new HomeFragment(), null);
                        break;
                    case R.id.rb_two:
                        switchFragment(new ImgFragment(), null);
                        break;
                }
            }
        });
        switchFragment(new HomeFragment(), null);
    }

    public void switchFragment(Fragment fragment, Bundle args) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.fl_body, fragment);
        ft.commit();
    }

}
