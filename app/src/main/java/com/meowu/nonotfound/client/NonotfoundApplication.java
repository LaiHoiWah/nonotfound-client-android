package com.meowu.nonotfound.client;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.meowu.nonotfound.client.commons.utils.ContextUtils;

public class NonotfoundApplication extends Application{

    @Override
    public void onCreate(){
        // super create
        super.onCreate();

        // init
        init();
    }

    // init
    private void init(){
        // context
        contextInit();

        // ARouter
        routerInit();
    }

    private void routerInit(){
        ARouter.init(this);
    }

    private void contextInit(){
        ContextUtils.setContext(this);
    }
}
