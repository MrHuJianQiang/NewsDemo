package com.newsdemo.ui.zhihu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.newsdemo.model.bean.CommentBean;

import java.util.List;

/**
 * Created by jianqiang.hu on 2017/5/21.
 */

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<CommentBean.CommentsBean> mList;
    private Context mContext;

    private static final int STATE_NULL=0;//未知
    private static final int STATE_NONE=1;//无需展开
    private static final int STATE_EXPAND=2;//已展开
    private static final int STATE_SHRINK=3;//已收缩


    private static final int MAX_LINE=2;//起始最多显示2行
    public CommentAdapter(Context mContext, List<CommentBean.CommentsBean> mList) {
        this.mList=mList;
        this.mContext=mContext;
        inflater=LayoutInflater.from(mContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
