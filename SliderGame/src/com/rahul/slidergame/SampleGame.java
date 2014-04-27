package com.rahul.slidergame;

import com.rahul.framework.Screen;
import com.rahul.framework.implementation.AndroidGame;

public class SampleGame extends AndroidGame {
    
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
    
}