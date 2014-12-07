package optimum2d.graphics;

import optimum2d.main.Game;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Biw on 6/12/2557.
 */
public class Background
{
    public static int current_scene = 0;
    public static Texture texture = null;

    public static HashMap<Integer, Texture> scene_texture = new HashMap<Integer, Texture>();

    public static void loadTexture(String filename, int scene)
    {
        try
        {
            texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/" + filename));
            scene_texture.put(scene, texture);
            texture = scene_texture.get(scene);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void draw()
    {
        if (texture != null)
        {
            texture.bind();

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
//        else
//        {
//            GL11.glBegin(GL11.GL_QUADS);
//            GL11.glVertex2f(0,0);
//            GL11.glVertex2f(Display.getWidth(), 0);
//            GL11.glVertex2f(Display.getWidth(), Display.getHeight());
//            GL11.glVertex2f(0, Display.getHeight());
//            GL11.glEnd();
//        }
    }
}
