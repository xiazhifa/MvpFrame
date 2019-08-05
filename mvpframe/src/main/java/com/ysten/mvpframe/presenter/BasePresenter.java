package com.ysten.mvpframe.presenter;

import com.ysten.mvpframe.model.BaseModel;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2019/5/7/007.
 * 构造方法中实例化Model对象，并持有其引用
 */
public abstract class BasePresenter<M extends BaseModel>{
    protected M model;
    public abstract M createModel();

    /**
    *@description:在默认的构造方法中创建model，createModel是子类必须实现的方法
    *@author:Administrator
    *@date:2019/8/5/005 16:37
    *@param:
    *@return  Presenter的基类
    *@throws:如果此方法抛异常，简单描述下
    */
    public BasePresenter() {
        this.model = createModel();
    }

    /**
     * 在Activity或Fragment卸载时调用View结束的方法
     */
    public void destroy() {
        if(model!=null)model.onDestroy();
    }
}
