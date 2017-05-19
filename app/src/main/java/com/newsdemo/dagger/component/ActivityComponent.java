package com.newsdemo.dagger.component;

import android.app.Activity;

import com.newsdemo.dagger.module.ActivityModule;
import com.newsdemo.dagger.scope.ActivityScope;
import com.newsdemo.ui.main.activity.MainActivity;
import com.newsdemo.ui.main.activity.WelcomeActivity;
import com.newsdemo.ui.zhihu.activity.ZhihuDetailActivity;

import dagger.Component;

/**
 * Created by jianqiang.hu on 2017/5/11.
 */
@ActivityScope
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
    void inject(WelcomeActivity welcomeActivity);
    void inject(MainActivity mainActivity);
    void inject(ZhihuDetailActivity zhihuDetailActivity);
}
