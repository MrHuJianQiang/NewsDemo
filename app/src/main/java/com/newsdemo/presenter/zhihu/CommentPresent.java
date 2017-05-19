package com.newsdemo.presenter.zhihu;

import com.newsdemo.base.RxPresent;
import com.newsdemo.base.contract.zhihu.CommentConract;
import com.newsdemo.model.DataManager;

import javax.inject.Inject;

/**
 * Created by jianqiang.hu on 2017/5/19.
 */

public class CommentPresent extends RxPresent<CommentConract.View> implements CommentConract.Presenter {


    private DataManager mDataManager;

    @Inject
    public CommentPresent(DataManager mDataManager){
        this.mDataManager=mDataManager;
    }


    @Override
    public void getCommentData(int id, int commentKind) {

    }
}
