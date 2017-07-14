package fragment;

import android.support.annotation.ColorInt;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.shenni.basefragmentdemo.R;

import java.util.Random;

import butterknife.BindView;

/**
 * Created by Yk on 2017/6/19.
 */

public class FirstFragment extends BaseFragment {
    @BindView(R.id.tv_onefragment)
    TextView tv;
    @BindView(R.id.fake_status_bar)
    View mTvTitle;
    @BindView(R.id.toobar_view)
    RelativeLayout toobar_view;

    //第一个页面
    @Override
    protected int setContentView() {
        Log.e("one", "在这里设置Fragment要显示的布局");
        return R.layout.fragment_test;
    }

    @Override
    protected void initView(View view) {
        tv.setText("第一个页面");
        Log.e("one", "在这里进行初始化界面的操作");
        setTvTitleBackgroundColor();
    }


    @Override
    protected void onUserVisible() {
        Log.e("one", "第一个页面可见时操作");
    }

    @Override
    protected void onUserInvisible() {
        Log.e("one", "第一个页面不可见了");
    }

    @Override
    protected void onBaseDestroyView() {
        Log.e("one", "第一个页面销毁操作");
    }

    public void setTvTitleBackgroundColor(@ColorInt int color) {

        mTvTitle.setBackgroundColor(color);
    }

    public void setTvTitleBackgroundColor() {
        Random random = new Random();
        int color = 0xff000000 | random.nextInt(0xffffff);
        mTvTitle.setBackgroundColor(color);
        toobar_view.setBackgroundColor(color);
    }

}
