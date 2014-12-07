package optimum2d.graphics.shape;

import optimum2d.rendering.RenderingEngine;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;

/**
 * Created by Biw on 30/11/2557.
 */
public class Box extends Shape
{
    public Vector2f position = new Vector2f(0,0);
    public float size = 64;

    public Box()
    {
        super();

        this.checkInbound();
        this.addComponent(this);
    }

    public boolean checkInbound()
    {
        if (Mouse.getX() >= position.x && Mouse.getX() <= position.x + size
                && Display.getHeight() - Mouse.getY() >= position.y && Display.getHeight() - Mouse.getY() <= position.y + size)
        {
            return true;
        }
        return false;
    }

    public boolean isClicked()
    {
        if (checkInbound() == true && Mouse.isButtonDown(0))
        {
            return true;
        }
        return false;
    }

    public void translate(float x, float y)
    {
        GL11.glTranslatef(position.x + x, position.y + y, 0);
    }

    public void draw()
    {
        GL11.glBegin(GL11.GL_QUADS);
        {
            GL11.glVertex2f(position.x, position.y);
            GL11.glVertex2f(position.x + size, position.y);
            GL11.glVertex2f(position.x + size, position.y + size);
            GL11.glVertex2f(position.x, position.y + size);
        }
        GL11.glEnd();
    }
}
