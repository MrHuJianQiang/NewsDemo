package com.newsdemo.dagger.component;

import android.app.Activity;

import com.newsdemo.dagger.module.FragmentModule;
import com.newsdemo.dagger.scope.FragmentScope;
import com.newsdemo.ui.zhihu.fragment.CommentFragment;
import com.newsdemo.ui.zhihu.fragment.DailyFragment;
import com.newsdemo.ui.zhihu.fragment.HotFragment;
import com.newsdemo.ui.zhihu.fragment.SectionFragment;
import com.newsdemo.ui.zhihu.fragment.Themefragment;

import dagger.Component;

/**
 * Created by jianqiang.hu on 2017/5/15.
 */

@FragmentScope
@Component(dependencies = AppComponent.class,modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();

    void inject (DailyFragment dailyFragment);

    void inject(Themefragment themefragment);

    void inject(SectionFragment sectionFragment);

    void inject(HotFragment hotFragment);

    void inject(CommentFragment commentFragment);
}
