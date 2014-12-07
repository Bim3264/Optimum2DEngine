package optimum2d.rendering;

import static org.lwjgl.opengl.GL11.*;

/**
 * Created by Biw on 29/11/2557.
 */
public class Camera
{
    public Camera(int width, int height)
    {
        glEnable(GL_TEXTURE_2D);
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,width,height,0,1,-1);
        glMatrixMode(GL_MODELVIEW);
    }
}
