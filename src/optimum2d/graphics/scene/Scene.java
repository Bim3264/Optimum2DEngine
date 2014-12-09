package optimum2d.graphics.scene;

import optimum2d.main.Game;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Biw on 6/12/2557.
 */
public class Scene
{
    public static Texture texture = null;

    public static void loadTexture(String filename, int scene_number)
    {
        try
        {
            texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/" + filename));
            SceneDivider.bind(texture, scene_number);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void clear()
    {
        GL11.glClearColor(0,0,0,0);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
    }

    public static void draw(int scene_number)
    {
        if (SceneDivider.getTexture(scene_number) != null)
        {
            SceneDivider.getTexture(scene_number).bind();

            GL11.glBegin(GL11.GL_QUADS);
            GL11.glTexCoord2f(0,1);
            GL11.glVertex2f(0,0);
            GL11.glTexCoord2f(1,1);
            GL11.glVertex2f(Game.coreEngine.getWidth(), 0);
            GL11.glTexCoord2f(1,0);
            GL11.glVertex2f(Game.coreEngine.getWidth(), Game.coreEngine.getHeight());
            GL11.glTexCoord2f(0,0);
            GL11.glVertex2f(0, Game.coreEngine.getHeight());
            GL11.glEnd();
        }
    }
}
