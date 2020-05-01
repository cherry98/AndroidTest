package com.rose.homepage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * ViewPager+Fragment使用时，由于ViewPager的缓存机制，使得Fragment的生命周期失去意义
 * 该抽象类自定义一个新的回调方法，当Fragment可见状态改变时会触发的方法 取消
 */

public abstract class ViewPagerFragment extends Fragment {

    /**
     * rootView是否初始化的标志，防止回调函数在rootView为空的时候触发
     */
    private boolean hasCreateView;

    /**
     * 当前Fragment是否处于可见标志状态，防止因viewpager的缓存标志导致回调函数的触发
     */
    private boolean isFragmentVisible;

    /**
     * onCreateView()里返回的view，修饰为protected，所以子类在继承onCreateView时必须对该变量进行初始化
     */
    protected View rootView;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.w(getTag(), "setUserVisibleHint -> isVisibleToUser:" + isVisibleToUser);
        if (rootView == null) {
            return;
        }
        hasCreateView = true;
        if (isVisibleToUser) {
            onFragmentVisibleChange(true);
            isFragmentVisible = true;
            return;
        }
        if (isFragmentVisible) {
            onFragmentVisibleChange(false);
            isFragmentVisible = false;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariable();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!hasCreateView && getUserVisibleHint()) {
            onFragmentVisibleChange(true);
            isFragmentVisible = true;
        }
    }

    private void initVariable() {
        hasCreateView = false;
        isFragmentVisible = false;
    }

    /**************************************************************
     *  自定义的回调方法，子类可根据需求重写
     *************************************************************/

    /**
     * 当前Fragment可见状态发生改变时会回调此方法
     * 如果是当前Fragment第一次加载，等待onCreateView后才会回调此方法，
     * 其他情况跟#setUserVisibleHint方法，回调时机一致
     * 在回调方法里面 可以做一些加载数据操作，甚至是控件的操作，因为配合Fragment的view的复用机制不用再担心null异常
     *
     * @param isVisible true->可见
     *                  false->不可见
     */

    protected void onFragmentVisibleChange(boolean isVisible) {
        Log.w(getTag(), "onFragmentVisibleChange -> isVisible:" + isVisible);
    }

}
