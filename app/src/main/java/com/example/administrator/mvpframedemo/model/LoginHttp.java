package com.example.administrator.mvpframedemo.model;


import com.example.administrator.mvpframedemo.interfaces.CallBack;
import com.ysten.mvpframe.model.BaseModel;

/**
 * Created by wulei
 * Data: 2016/3/30.
 */
public class LoginHttp extends BaseModel {
    private static final String TAG = "LoginHttp";

    private Thread mThread;

    /**
     * 模拟密码登陆的过程
     *
     * @param account
     * @param password
     */
    public void login(final String account, final String password, final CallBack callBack) {
        mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(account.equals("123") && password.equals("123"))
                {
                    callBack.loginSuccess();
                }else{
                    callBack.loginError("密码错误");
                }
            }
        });
        mThread.start();
    }

    /**
     * 释放必要的资源
     */
    @Override
    public void onDestroy() {

    }
}
