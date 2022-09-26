package com.meowu.nonotfound.client.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class NTextView extends TextView{

    public NTextView(Context context){
        super(context);
    }

    public NTextView(Context context, @Nullable AttributeSet attrs){
        super(context, attrs);
    }

    public NTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }

    public NTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes){
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void atNewLine(CharSequence text){
        super.append("\n\r");
        super.append(text);
    }
}
