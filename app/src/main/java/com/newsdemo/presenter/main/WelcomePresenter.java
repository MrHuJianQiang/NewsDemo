package com.newsdemo.presenter.main;

import com.newsdemo.base.RxPresent;
import com.newsdemo.base.contract.main.WelcomeContract;
import com.newsdemo.model.DataManager;

import javax.inject.Inject;

/**
 * Created by jianqiang.hu on 2017/5/11.
 */

public class WelcomePresenter extends RxPresent<WelcomeContract.View> implements WelcomeContract.Presenter {

    private static final String RES="1080*1776";
    private static final int Count_DOWN_TIME=2200;

    private DataManager mDataManager;

    @Inject
    public WelcomePresenter(DataManager mDataManager){
        this.mDataManager=mDataManager;
    }


    @Override
    public void getWelcomeData() {
    //    addSubscribe(mDataManager.fetchLongCommentInfo(RES));
    }
}
