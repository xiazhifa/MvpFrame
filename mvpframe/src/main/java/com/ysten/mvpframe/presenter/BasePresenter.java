package com.ysten.mvpframe.presenter;

import com.ysten.mvpframe.model.BaseModel;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2019/5/7/007.
 * 构造方法中实例化Model对象，持有其引用
 */

public abstract class BasePresenter<M extends BaseModel>{
    protected M model;
    public abstract M createModel();

    public BasePresenter() {
        this.model = createModel();
    }

    /**
     * 在Activity或Fragment卸载时调用View结束的方法
     */
    public void destroy() {
        model.onDestroy();
    }
}
