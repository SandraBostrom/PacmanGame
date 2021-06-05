package com.main.player;

import com.main.Game;
import com.main.object.GameObject;
import com.main.object.ID;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();
    public Player(int x, int y, ID id){
        super(x,y,id);

    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x,0,Game.WIDTH -37);
        y = Game.clamp(y,0,Game.HEIGHT -60);
    }

    @Override
    public void render(Graphics g) {
            g.setColor(Color.white);
        g.fillRect(x,y,32,32);
    }


}
