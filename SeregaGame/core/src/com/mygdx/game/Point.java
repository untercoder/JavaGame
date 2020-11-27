package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;

import java.awt.*;

import static java.awt.Color.WHITE;

public class Point {
    public int point;
    public int count;
    BitmapFont text_point;



    public Point() {
        this.point = 0;
        this.count = 0;
        text_point = new BitmapFont();
        text_point.setColor(Color.WHITE);
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void render(SpriteBatch batch) {
        text_point.draw(batch, "Point: " + point,10, 40);
    }

    public void update() {
        point = point + 1; count++;
        if(count > 10)
        {count = 0;}
    }

}
