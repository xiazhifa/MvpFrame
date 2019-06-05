package com.ysten.mvpframe.view.concrete;

import android.app.Activity;
import android.os.Bundle;

import com.ysten.mvpframe.presenter.BasePresenter;
import com.ysten.mvpframe.view.BaseView;

/**
 * Created by Administrator on 2019/5/7/007.
 */

public abstract class BaseMvpActivity<P extends BasePresenter> extends Activity implements BaseView<P> {
    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建Presenter
        presenter = createPresenter();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            //Activity销毁时的调用，让具体实现BasePresenter中onViewDestroy()方法做出决定
            presenter.destroy();
        }
    }
}
