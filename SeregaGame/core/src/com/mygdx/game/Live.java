package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Live {
    Texture live_bar;
    int live;

    public Live() {
        live_bar = new Texture("Heart.png");
        live = 3;
    }

    public void render(SpriteBatch batch) {
        switch (live) {
            case (3):
                batch.draw(live_bar, 610, 10);
                batch.draw(live_bar, 670, 10);
                batch.draw(live_bar, 730, 10);
                break;
            case (2):
                batch.draw(live_bar, 670, 10);
                batch.draw(live_bar, 730, 10);
                break;
            case (1):
                batch.draw(live_bar, 730, 10);
                break;
            case (0):
                break;
        }
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public void update(){live--;}
}
