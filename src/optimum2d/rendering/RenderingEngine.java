package optimum2d.rendering;

import optimum2d.component.GameComponent;
import optimum2d.main.Game;
import org.lwjgl.input.Mouse;

import java.util.ArrayList;

/**
 * Created by Biw on 30/11/2557.
 */
public class RenderingEngine
{
    public ArrayList<GameComponent> gameComponents = new ArrayList<GameComponent>();

    public void addComponent(GameComponent gameComponent)
    {
        gameComponents.add(gameComponent);
    }

    public void renderAll()
    {
        for (GameComponent g : gameComponents)
        {
            g.draw();
        }
    }
}
