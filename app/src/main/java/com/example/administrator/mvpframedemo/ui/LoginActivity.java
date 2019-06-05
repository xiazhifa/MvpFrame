package com.example.administrator.mvpframedemo.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.mvpframedemo.R;
import com.example.administrator.mvpframedemo.interfaces.CallBack;
import com.example.administrator.mvpframedemo.presenter.LoginPresenter;
import com.ysten.mvpframe.view.concrete.BaseMvpActivity;


public class LoginActivity extends BaseMvpActivity<LoginPresenter> implements CallBack,View.OnClickListener {
    private EditText edtAccount, edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void onClick(View v) {
        presenter.login(edtAccount.getText().toString(),edtPassword.getText().toString(),LoginActivity.this);
    }

    private void initViews() {
        edtAccount = (EditText) findViewById(R.id.edt_account);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void loginError(String msg) {
        ShowToast(msg);
    }

    @Override
    public void loginSuccess() {
        ShowToast(getResources().getString(R.string.login_success));
    }

    public void ShowToast(final String msg)
    {
        LoginActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(LoginActivity.this,msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
