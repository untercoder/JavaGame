package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Hero {
    Texture hero;
    Vector2 pos_hero;
    float sp_hero;
    int speed;

    public Hero() {
        hero = new Texture("Serega.png");
        pos_hero = new Vector2(0, 90);
        speed = 10;
    }

    public void render(SpriteBatch batch) {
        batch.draw(hero, pos_hero.x, pos_hero.y);
    }

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
        {
            if(pos_hero.x != 656)
            {pos_hero.x += speed;sp_hero = pos_hero.x + 150;}
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
        {
            if(pos_hero.x != 0)
            {pos_hero.x -= speed;sp_hero = pos_hero.x + 150;}
        }
    }

    public Vector2 getPos_hero() {
        return pos_hero;
    }
}