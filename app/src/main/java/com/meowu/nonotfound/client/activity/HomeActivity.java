package com.meowu.nonotfound.client.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.meowu.nonotfound.client.R;
import com.meowu.nonotfound.client.activity.fragment.HomeFragment;
import com.meowu.nonotfound.client.commons.constants.RouterMap;

@Route(path = RouterMap.HOME_ACTIVITY)
public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fragmentInit();
    }

    private void fragmentInit(){
        FragmentManager     manager     = super.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(new HomeFragment(), RouterMap.HOME_FRAGMENT_TAG);
    }
}
