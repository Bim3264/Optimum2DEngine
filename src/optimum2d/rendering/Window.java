package optimum2d.rendering;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Created by Biw on 29/11/2557.
 */
public class Window
{
    public static void createWindow(int width, int height, String title)
    {
        try
        {
            Display.setTitle(title);
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.create();
        }
        catch (LWJGLException e)
        {
            e.printStackTrace();
        }
    }
}
