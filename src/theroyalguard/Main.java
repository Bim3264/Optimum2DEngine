package theroyalguard;

import optimum2d.graphics.Background;
import optimum2d.graphics.shape.Box;
import optimum2d.main.Game;
import optimum2d.main.Updater;
import optimum2d.rendering.RenderingEngine;

/**
 * Created by Biw on 29/11/2557.
 */
public class Main extends Game implements Updater
{
    public RenderingEngine renderingEngine = new RenderingEngine();

    public static void main(String[] args)
    {
        coreEngine.setTitle("The Royal Guard");
        launch();
    }

    public void init()
    {
        this.setRenderingEngine(renderingEngine);
        Background.loadTexture("test_scene_2.png", 0);
    }

    public void update()
    {
        Background.draw();
    }
}
