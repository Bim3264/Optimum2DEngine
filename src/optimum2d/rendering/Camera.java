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
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0,width,height,0,1,-1);
        glMatrixMode(GL_MODELVIEW);
    }
}
