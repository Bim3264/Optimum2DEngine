package optimum2d.main;

import optimum2d.rendering.Camera;
import optimum2d.rendering.RenderingEngine;
import optimum2d.rendering.Window;
import optimum2d.util.Time;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import theroyalguard.Main;

/**
 * Created by Biw on 29/11/2557.
 */
public class Game
{
    public static Game instance = new Game();
    public static Main game = new Main();
    public static CoreEngine coreEngine = new CoreEngine();

    public RenderingEngine renderingEngine = null;

    public long lastFrame;
    public int fps;
    public long lastFPS;

    public static void launch()
    {
        Window.createWindow(coreEngine.getWidth(), coreEngine.getHeight(), coreEngine.getTitle());

        Camera camera = new Camera(coreEngine.width, coreEngine.height);

        instance.init();

        while (!Display.isCloseRequested() && !Keyboard.isKeyDown(Keyboard.KEY_ESCAPE))
        {
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

            instance.input();

            instance.update();
            Display.update();
            Display.sync(60);
        }

        Display.destroy();
        System.exit(0);
    }

    public void setRenderingEngine(RenderingEngine renderingEngine)
    {
        this.renderingEngine = renderingEngine;
    }

    private void init()
    {
        lastFPS = Time.getTime();

        game.init();
    }

    private void input()
    {
        game.input();
    }

    private void update()
    {
        //Always add your updater here
        game.update();
    }
}
