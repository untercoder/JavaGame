package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Save {
    BitmapFont max_point;
    public static Preferences prefs;

    public Save() {
        max_point = new BitmapFont();
        prefs =  Gdx.app.getPreferences("Serega_save");
        prefs.putInteger("highScore", 0);
        prefs.flush();
    }

    public void setPoint(int pt) {
        if(pt > prefs.getInteger("highScore"))
            prefs.putInteger("highScore", pt);
            prefs.flush();
    }

    public static int getHighScore() {
        return prefs.getInteger("highScore");
    }

    //int point_max = (int)prefs.getInteger("highScore");

    public void render(SpriteBatch batch) {
            max_point.draw(batch, "LOH TI PROEBAL!!!!!!!!\n" + "Max Point: " + getHighScore() + "\nPress SPACE to RESTART\ngame created by LEXAMOK ",310, 600);
           // System.out.println(prefs.getInteger("highScore"));
    }
}
