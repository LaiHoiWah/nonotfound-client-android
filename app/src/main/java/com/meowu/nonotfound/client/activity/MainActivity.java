package com.meowu.nonotfound.client.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.meowu.nonotfound.client.R;
import com.meowu.nonotfound.client.commons.constants.RouterMap;
import com.meowu.nonotfound.client.commons.utils.DeviceUtils;
import com.meowu.nonotfound.client.view.NTextView;

import org.apache.commons.lang3.StringUtils;

@Route(path = RouterMap.MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity{

    private NTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init
        init();
    }

    private void init(){
        textView = this.findViewById(R.id.main_activity_textView);
        textView.setText("Welcome to Nonotfound");
        textView.atNewLine("");

        // setting checking
        versionCheck();
        loginCheck();

        // data init
        dataInit();

        // redirect
        redirect();
    }

    private void versionCheck(){
        textView.atNewLine("task > version checking...");

        // get version
        String version = DeviceUtils.versionName();

        // verify
        if(StringUtils.isNotBlank(version)){
            textView.atNewLine("task > version: " + version);

            if(true){
                textView.append(" [available]");
            }
        }
    }

    private void loginCheck(){
        textView.atNewLine("task > login checking...");

        if(true){
            textView.atNewLine("task > user XXX [unavailable]");
        }
    }

    private void dataInit(){
        textView.atNewLine("task > data init...");

        if(true){
            textView.atNewLine("task > user information init...");
            textView.atNewLine("task > user cookies init...");
        }
    }

    private void redirect(){
        textView.atNewLine("task > everything is OK !!");
        textView.atNewLine("task > redirecting...");

        ARouter.getInstance().build(RouterMap.HOME_ACTIVITY).navigation();
    }
}