package com.mindemia.jme_cardboard_examples;
 
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import com.google.vrtoolkit.cardboard.CardboardActivity;
import com.google.vrtoolkit.cardboard.CardboardDeviceParams;
import com.google.vrtoolkit.cardboard.CardboardView;
 
public class MainActivity extends CardboardActivity{
 
    public MainActivity(){
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//                public void run() {
//                        MainActivity.this
//                                        .onWindowFocusChanged(true);
//                        MainActivity.this.getCardboardView().setVRModeEnabled(true);
//                }
//        }, 2000L);
    }
    
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) 
    {
        CardboardView view = getCardboardView();
        return (view != null && view.dispatchTouchEvent(event)) || super.dispatchTouchEvent(event);
    }
 
}
