package fragment;


import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.shenni.basefragmentdemo.R;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImgFragment extends BaseFragment {
    @BindView(R.id.tv_secondfragment)
    TextView tvSecondfragment;

    @Override
    protected int setContentView() {
        Log.e("ImgFragment", "在这里进行初始化界面操作");
        return R.layout.fragment_second;
    }


    @Override
    protected void initView(View view) {

//        StatusBarUtil.setTransparentForImageViewInFragment(getActivity(), null);
        tvSecondfragment.setText("哈哈");
    }

    @Override
    protected void onUserVisible() {
        Log.e("ImgFragment", "图片页面可见状态");
    }

    @Override
    protected void onUserInvisible() {
        Log.e("ImgFragment", "图片页面不可见了");

    }

    @Override
    protected void onBaseDestroyView() {
        Log.e("ImgFragment", "图片页面销毁操作");
    }


}
