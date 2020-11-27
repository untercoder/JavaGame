package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class Beer {

    Texture beer;
    Vector2 pos_bear;
    Vector2 pos_hero;
    float vy;
    float gravity = 0.1f;
    int speed = 10;
    int pt_hero;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Beer(Hero psh) {
        beer = new Texture("BEER2.png");
        pos_bear = new Vector2(MathUtils.random(0,800),  1060);
        pos_hero = psh.pos_hero;

    }
    public void back() {
        pos_bear.x = MathUtils.random(0,730);
        pos_bear.y = 1060;
    }

    public void render(SpriteBatch batch, Point pt, Live lb) {
        if (pos_bear.y > 90) {batch.draw(beer, pos_bear.x, pos_bear.y);}
        else {lb.update(); back();}
        if(((pos_bear.x >= pos_hero.x) && (pos_bear.x <= pos_hero.x + 110)) && (pos_bear.y == 220) ) {
            back();
            if((pt.count == 10) && (pt.point < 31))
            {speed = speed + 5;}
            pt.update();
        }
    }

    public void update() {
        vy += gravity;
        pos_bear.y -= speed;

    }
}