package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public abstract class Entity {

    protected float x, y;
    // TODO: create a protected int called width and height
    // TODO: create a protected Rectangle2D.Float named hitbox

    public Entity(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        // TODO: set this width to width
        // TODO: set this height to height.
    }

    protected void drawHitbox(Graphics g) {
        // TODO: call g.setColor(Color.PINK) which will set the hitbox's color
        // TODO: call g.drawRect((int) hitbox.x, (int) hitbox.y, (int) hitbox.width, (int) hitbox.height)
        //  which will place a pink rectangle on the screen at the hitbox coordinates
    }

    protected void initHitbox(float x, float y, int width, int height) {
        // TODO: initialize hitbox with hitbox = new Rectangle2D.FLOAT passing in the appropriate parameters.
    }

    public Rectangle2D.Float getHitbox() {
        // TODO: return this hitbox.
    }

}