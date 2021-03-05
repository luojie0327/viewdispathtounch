package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLayout extends LinearLayout {

    private String TAG = "MyLayout";

    public MyLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        show("onInterceptTouchEvent", ev);
        //switch

        return super.onInterceptTouchEvent(ev);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        show("dispatchTouchEvent", event);

        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        show("onTouchEvent", event);
        //switch
        return super.onTouchEvent(event);
    }

    private void show(String methodName, MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                Log.d(TAG, methodName + ": ACTION_DOWN");
            }
            break;
            case MotionEvent.ACTION_MOVE: {
                Log.d(TAG, methodName + ": ACTION_MOVE");
            }
            break;
            case MotionEvent.ACTION_UP: {
                Log.d(TAG, methodName + ": ACTION_UP");
            }
            break;
            case MotionEvent.ACTION_CANCEL: {
                Log.d(TAG, methodName + ": ACTION_CANCEL");
            }
            break;
        }
    }
}
