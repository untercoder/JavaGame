package com.mygdx.game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Background {
   private Texture back;
   private Vector2 pos;

    public Background() {
        back = new Texture("back.jpg");
        pos = new Vector2(0,0);
    }

    public void render(SpriteBatch batch){
        batch.draw(back, pos.x, pos.y);
    }
}
