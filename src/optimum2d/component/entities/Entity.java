package optimum2d.component.entities;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Biw on 7/12/2557.
 */
public class Entity
{
    public Vector2f position = new Vector2f(0,0);
    private Texture texture = null;
    public ArrayList<Entity> entities = new ArrayList<Entity>();
    public String unlocalized_name = "unnamed_" + Integer.valueOf(entities.size());
    public float width, height;

    public Entity(String unlocalized_name)
    {
        this.unlocalized_name = unlocalized_name;
        this.loadTexture();
        this.entities.add(this);

        width = texture.getImageWidth();
        height = texture.getImageHeight();
    }

    public Entity loadTexture()
    {
        try
        {
            texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/" + unlocalized_name + ".png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return this;
    }

    public Entity render()
    {
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        if (texture != null)
        {
            texture.bind();
            GL11.glBegin(GL11.GL_QUADS);
            GL11.glTexCoord2f(0, 0);
            GL11.glVertex2f(position.x, position.y);
            GL11.glTexCoord2f(1, 0);
            GL11.glVertex2f(position.x + texture.getImageWidth(), position.y);
            GL11.glTexCoord2f(1, 1);
            GL11.glVertex2f(position.x + texture.getImageWidth(), position.y + texture.getImageHeight());
            GL11.glTexCoord2f(0, 1);
            GL11.glVertex2f(position.x, position.y + texture.getImageHeight());
            GL11.glEnd();
        }

        return this;
    }

    public float getWidth()
    {
        return this.width;
    }

    public float getHeight()
    {
        return this.height;
    }
}
