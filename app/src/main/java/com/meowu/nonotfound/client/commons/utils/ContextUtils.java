package com.meowu.nonotfound.client.commons.utils;

import android.content.Context;

import lombok.Getter;
import lombok.Setter;

public class ContextUtils{

    private static Context context;

    public static void setContext(Context source){
        context = source;
    }

    public static Context getContext(){
        return context;
    }
}
