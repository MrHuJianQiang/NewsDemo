package com.newsdemo.ui.zhihu.fragment;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.newsdemo.R;
import com.newsdemo.app.Constants;
import com.newsdemo.base.RootFragment;
import com.newsdemo.base.SimpleFragment;
import com.newsdemo.base.contract.zhihu.ThemeContract;
import com.newsdemo.model.bean.ThemeListBean;
import com.newsdemo.ui.zhihu.activity.ThemeActivity;
import com.newsdemo.ui.zhihu.adapter.ThemeAdpter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static android.os.Build.ID;

/**
 * Created by jianqiang.hu on 2017/5/15.
 */

public class Themefragment extends RootFragment<ThemeContract.Present> implements ThemeContract.View {

    @BindView(R.id.view_main)
    RecyclerView rvThemeList;
    @BindView(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    ThemeAdpter mAdapter;
    List<ThemeListBean.OthersBean> mList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.view_common_list;
    }

    @Override
    protected void initEventAndData() {
        super.initEventAndData();
        mAdapter=new ThemeAdpter(mContext,mList);
        rvThemeList.setLayoutManager(new GridLayoutManager(mContext,2));
        rvThemeList.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new ThemeAdpter.OnItemClickListener() {
            @Override
            public void onItemClick(int id) {
                Intent intent=new Intent();
                intent.setClass(mContext, ThemeActivity.class);
                intent.putExtra(Constants.IT_ZHIHU_THEME_ID,id);
                mContext.startActivity(intent);
            }
        });

        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPresentter.getThemeData();
            }
        });
        mPresentter.getThemeData();
        stateLoading();
    }

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @Override
    public void showContent(ThemeListBean themeListBean) {

    }
}
