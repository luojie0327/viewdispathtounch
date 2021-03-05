package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        show("dispatchTouchEvent", ev);
        //switch
        return super.dispatchTouchEvent(ev);
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
