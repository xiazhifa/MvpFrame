package com.example.administrator.mvpframedemo.presenter;

import android.text.TextUtils;
import com.example.administrator.mvpframedemo.interfaces.CallBack;
import com.example.administrator.mvpframedemo.model.LoginHttp;
import com.ysten.mvpframe.presenter.BasePresenter;

/**
 * Created by wulei
 * Data: 2016/3/30.
 */
public class LoginPresenter extends BasePresenter<LoginHttp> {
    private static final String TAG = "LoginPresenter";

    @Override
    public LoginHttp createModel() {
        return new LoginHttp();
    }

    public void login(String account, String password, CallBack callBack) {
        if (TextUtils.isEmpty(account)) {
            callBack.loginError("账号为空");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            callBack.loginError("密码为空");
            return;
        }
        model.login(account, password,callBack);
    }
}
