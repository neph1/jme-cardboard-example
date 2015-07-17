package com.mindemia.jme_cardboard_examples;
 
import android.os.Bundle;
import com.google.vrtoolkit.cardboard.CardboardActivity;
 
public class MainActivity extends CardboardActivity{
 
    public MainActivity(){
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    
 
}
