package com.meowu.nonotfound.client.commons.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

public class DeviceUtils{

    public static PackageInfo packageInfo(){
        try{
            Context        context     = ContextUtils.getContext();
            String         packageName = context.getPackageName();
            PackageManager manager     = context.getPackageManager();

            return manager.getPackageInfo(packageName, 0);
        }catch(PackageManager.NameNotFoundException e){
            return null;
        }
    }

    public static int versionCode(){
        PackageInfo packageInfo = packageInfo();

        return packageInfo.versionCode;
    }

    public static String versionName(){
        PackageInfo packageInfo = packageInfo();

        return packageInfo.versionName;
    }

    public static int sdkVersion(){
        return Build.VERSION.SDK_INT;
    }
}
