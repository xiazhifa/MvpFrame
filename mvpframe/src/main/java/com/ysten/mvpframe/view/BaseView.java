package com.ysten.mvpframe.view;
import com.ysten.mvpframe.presenter.BasePresenter;

/**
 * Created by Administrator on 2019/5/7/007.
 */

public interface BaseView<P extends BasePresenter>{
    P createPresenter(); //实例化presenter
}
