package com.ysten.mvpframe.view.concrete;

import android.app.Activity;
import android.os.Bundle;

import com.ysten.mvpframe.presenter.BasePresenter;
import com.ysten.mvpframe.view.BaseView;

/**
 * Created by Administrator on 2019/5/7/007.
 * Activity作为MVP中V的封装
 */

public abstract class BaseMvpActivity<P extends BasePresenter> extends Activity implements BaseView<P> {
    protected P presenter;

    /**
    *@description:在Activity的创建方法中实例化Presenter
    *@author:Administrator
    *@date:2019/8/5/005 16:45
    *@param: 参数描述
    *@return  返回类型及作用
    *@throws:如果此方法抛异常，简单描述下
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
    }

    /**
    *@description:Activity销毁时的调用，让具体实现BasePresenter中onViewDestroy()方法做出决定
    *@author:Administrator
    *@date:2019/8/5/005 16:45
    *@param: 参数描述
    *@return  返回类型及作用
    *@throws:如果此方法抛异常，简单描述下
    */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.destroy();
        }
    }
}
