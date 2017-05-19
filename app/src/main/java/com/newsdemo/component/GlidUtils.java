package com.newsdemo.component;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.newsdemo.app.App;
import com.newsdemo.util.LogUtil;

/**
 * Created by jianqiang.hu on 2017/5/12.
 */

public class GlidUtils {
    public static void load(Context context, String url, ImageView iv){ //使用Glide加载圆形ImageView(如头像)时，不要使用占位图
        if (!App.getAppComponent().getPreferencesHelper().getNoImageState()){
            Glide.with(context).load(url).crossFade().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
        }
    }


    public static void load(Activity activity,String url,ImageView iv){
        if (!activity.isDestroyed()){
            Glide.with(activity).load(url).crossFade().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
        }
    }

    public static void loadAll(Context context, String url, ImageView iv){ //使用Glide加载圆形ImageView(如头像)时，不要使用占位图
        if (App.getAppComponent().getPreferencesHelper().getNoImageState()){
            Glide.with(context).load(url).crossFade().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(iv);
        }
    }


    public static void loadAll(Activity activity,String url,ImageView iv){
        if (!activity.isDestroyed()){
            Glide.with(activity).load(url).crossFade().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(iv);
        }
    }

}
