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
    public Vector2f position = new Vector2f();
    public Texture texture = null;
    public ArrayList<Entity> entities = new ArrayList<Entity>();
    public String unlocalized_name = "unnamed_" + Integer.valueOf(entities.size());

    public Entity(String unlocalized_name)
    {
        this.unlocalized_name = unlocalized_name;
        this.loadTexture();
    }

    private void loadTexture()
    {
        try
        {
            texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/" + unlocalized_name + ".png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void render()
    {
        texture.bind();
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0,1);
        GL11.glVertex2f(position.x, position.y);
        GL11.glTexCoord2f(1,1);
        GL11.glVertex2f(position.x + texture.getWidth(), position.y);
        GL11.glTexCoord2f(1,0);
        GL11.glVertex2f(position.x + texture.getWidth(), position.y + texture.getHeight());
        GL11.glTexCoord2f(0,0);
        GL11.glVertex2f(position.x, position.y + texture.getHeight());
        GL11.glEnd();
    }
}
