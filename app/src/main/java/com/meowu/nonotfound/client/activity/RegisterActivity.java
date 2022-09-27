package com.meowu.nonotfound.client.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.meowu.nonotfound.client.R;
import com.meowu.nonotfound.client.commons.constants.RouterMap;

@Route(path = RouterMap.REGISTER_ACTIVITY)
public class RegisterActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
