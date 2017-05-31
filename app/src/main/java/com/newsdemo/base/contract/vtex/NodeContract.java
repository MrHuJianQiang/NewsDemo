package com.newsdemo.base.contract.vtex;

import com.newsdemo.base.BasePresenter;
import com.newsdemo.base.BaseView;
import com.newsdemo.model.bean.NodeBean;
import com.newsdemo.model.bean.NodeListBean;

import java.util.List;

/**
 * Created by jianqiang.hu on 2017/5/28.
 */

public interface   NodeContract {


    interface View extends BaseView {
        void showContent(List<NodeListBean> mList) ;

        void showTopInfo(NodeBean mTopInfo);
    }

    interface Presenter extends BasePresenter<NodeContract.View>{
        void getContent(String node_name);

        void getTopInfo(String node_name);
    }

}
