package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Live lb;
	Hero hero;
	Background back;
	Beer beer;
	Point pt;
	Save save;
	public int count;
	
	@Override
	public void create () {
		lb = new Live();
		batch = new SpriteBatch();
		back = new Background();
		hero = new Hero();
		pt = new Point();
		save = new Save();
		beer = new Beer(hero);
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if(lb.getLive() != 0) {
			batch.begin();
			back.render(batch);
			beer.render(batch, pt, lb);
			hero.render(batch);
			pt.render(batch);
			lb.render(batch);
			batch.end();
		}
		else
			{
				batch.begin();
				save.setPoint(pt.getPoint());
				back.render(batch);
				save.render(batch);
				if(Gdx.input.isKeyPressed(Input.Keys.SPACE))
				{
					pt.setPoint(0);
					lb.setLive(3);
					beer.back();
					beer.setSpeed(10);
				}
				batch.end();
			}
	}

	public void update(){
		beer.update();
		hero.update();

	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
