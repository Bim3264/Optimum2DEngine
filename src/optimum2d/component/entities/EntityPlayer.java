package optimum2d.component.entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector2f;

/**
 * Created by Biw on 7/12/2557.
 */
public class EntityPlayer extends Entity
{
    public float speed = 8.0f;

    public EntityPlayer(String unlocalized_name)
    {
        super(unlocalized_name);
        this.loadTexture();
    }

    public EntityPlayer updateInput()
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_W))
        {
            position.y -= speed;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A))
        {
            position.x -= speed;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S))
        {
            position.y += speed;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D))
        {
            position.x += speed;
        }

        return this;
    }

    public EntityPlayer setStartPos(Vector2f startPos)
    {
        this.position = startPos;
        return this;
    }
}
