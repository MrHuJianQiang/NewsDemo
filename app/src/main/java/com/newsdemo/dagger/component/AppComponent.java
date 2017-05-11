package com.newsdemo.dagger.component;

import com.newsdemo.app.App;
import com.newsdemo.dagger.module.AppModule;
import com.newsdemo.dagger.module.HttpModule;
import com.newsdemo.model.DataManager;
import com.newsdemo.model.db.RealmHelper;
import com.newsdemo.model.http.RetrofitHelper;
import com.newsdemo.model.prefs.ImplPreferencesHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jianqiang.hu on 2017/5/11.
 */
@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {
    App getContext();//提供App的Context

    DataManager getDateManager();//数据中心

    RetrofitHelper getRetrofitHelper();//提供http的帮助类

    RealmHelper getRealmHelper();//数据库帮助类

    ImplPreferencesHelper getPreferencesHelper();//提供sp帮助类
}
