package com.ysten.mvpframe.view.concrete;

import android.app.Fragment;
import android.content.Context;

import com.ysten.mvpframe.presenter.BasePresenter;
import com.ysten.mvpframe.view.BaseView;

/**
 * Created by Administrator on 2019/5/7/007.
 */

public abstract class BaseMvpFragment<P extends BasePresenter> extends Fragment implements BaseView<P> {
    protected P presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        presenter = createPresenter();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (presenter != null) {
            presenter.destroy();
        }
    }
}