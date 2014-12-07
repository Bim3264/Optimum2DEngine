package optimum2d.component.entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/**
 * Created by Biw on 7/12/2557.
 */
public class EntityPlayer extends Entity
{
    public float speed = 1.0f;

    public EntityPlayer(String unlocalized_name)
    {
        super(unlocalized_name);
    }

    public EntityPlayer updateInput()
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_W))
        {
            position.y += speed;
        }
        else if (Keyboard.isKeyDown(Keyboard.KEY_A))
        {
            position.x -= speed;
        }
        else if (Keyboard.isKeyDown(Keyboard.KEY_S))
        {
            position.y -= speed;
        }
        else if (Keyboard.isKeyDown(Keyboard.KEY_D))
        {
            position.x += speed;
        }

        return this;
    }
}
