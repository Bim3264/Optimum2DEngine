package optimum2d.mapeditor;

import optimum2d.graphics.shape.Box;
import optimum2d.main.Game;
import optimum2d.main.Updater;
import optimum2d.rendering.RenderingEngine;
import optimum2d.util.GameLogger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector2f;

import java.util.ArrayList;

/**
 * Created by Biw on 1/12/2557.
 */
public class MapEditor extends Game implements Updater
{
    public static String[] m_args;

    public static void main(String[] args)
    {
        m_args = args;
        coreEngine.setTitle("Map Editor");
        launch();
    }

    @Override
    public void init()
    {
//        ComponentTab.main(m_args);
    }

    @Override
    public void input()
    {

    }

    @Override
    public void update()
    {

    }

}
