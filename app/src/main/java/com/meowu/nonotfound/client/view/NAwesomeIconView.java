package com.meowu.nonotfound.client.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class NAwesomeIconView extends TextView{

    private String ttf = "fontawesome-webfont.ttf";
    private Typeface typeface;

    public NAwesomeIconView(Context context){
        super(context);

        typefaceInit(context);
    }

    public NAwesomeIconView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);

        typefaceInit(context);
    }

    public NAwesomeIconView(Context context, @Nullable AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);

        typefaceInit(context);
    }

    public NAwesomeIconView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes){
        super(context, attrs, defStyleAttr, defStyleRes);

        typefaceInit(context);
    }

    private void typefaceInit(Context context){
        if(typeface == null){
            typeface = Typeface.createFromAsset(context.getAssets(), ttf);
        }

        super.setTypeface(typeface);
    }
}
