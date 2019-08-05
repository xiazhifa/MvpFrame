package com.ysten.mvpframe.view;
import com.ysten.mvpframe.presenter.BasePresenter;

/**
 * Created by Administrator on 2019/5/7/007.
 * VIew层的接口，持有创建Presenter的方法
 */

public interface BaseView<P extends BasePresenter>{
    /**
    *@description:实例化presenter
    *@author:Administrator
    *@date:2019/8/5/005 16:40
    *@param: 参数描述
    *@return  返回BasePresenter类型的Presenter
    *@throws:如果此方法抛异常，简单描述下
    */
    P createPresenter();
}
