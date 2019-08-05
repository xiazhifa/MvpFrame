package com.ysten.mvpframe.view.concrete;

import android.app.Fragment;
import android.content.Context;

import com.ysten.mvpframe.presenter.BasePresenter;
import com.ysten.mvpframe.view.BaseView;

/**
 * Created by Administrator on 2019/5/7/007.
 * Fragment作为MVP中V的封装
 */

public abstract class BaseMvpFragment<P extends BasePresenter> extends Fragment implements BaseView<P> {
    protected P presenter;

    /**
    *@description:在Fragment的onAttach方法中实例化Presenter
    *@author:Administrator
    *@date:2019/8/5/005 16:46
    *@param: 参数描述
    *@return  返回类型及作用
    *@throws:如果此方法抛异常，简单描述下
    */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        presenter = createPresenter();
    }

    /**
    *@description:Fragment销毁时的调用，让具体实现BasePresenter中onViewDestroy()方法做出决定
    *@author:Administrator
    *@date:2019/8/5/005 16:46
    *@param: 参数描述
    *@return  返回类型及作用
    *@throws:如果此方法抛异常，简单描述下
    */
    @Override
    public void onDetach() {
        super.onDetach();
        if (presenter != null) {
            presenter.destroy();
        }
    }
}