package optimum2d.component.entities;

import org.lwjgl.opengl.GL11;

/**
 * Created by Biw on 7/12/2557.
 */
public class EntityPlayer extends Entity
{
    public EntityPlayer(String unlocalized_name)
    {
        super(unlocalized_name);
    }

    public void translate(float x, float y)
    {
        position.x += x;
        position.y += y;
    }
}
