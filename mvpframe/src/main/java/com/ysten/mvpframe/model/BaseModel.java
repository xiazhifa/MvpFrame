package com.ysten.mvpframe.model;

/**
 * Created by Administrator on 2019/5/7/007.
 * MODEL层 顶层接口
 */

public abstract  class BaseModel {
    /**
     * 在Activity或Fragment卸载时停用model中占用的资源
     */
    public abstract void onDestroy();
}
