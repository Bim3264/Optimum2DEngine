package optimum2d.component;

import optimum2d.exception.GameException;
import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Biw on 30/11/2557.
 */
public class GameComponent
{
    public Vector2f position = null;
    public boolean isVisible = true;
    public Texture texture = null;

    public ArrayList<GameComponent> gameComponents = new ArrayList<GameComponent>();

    public GameComponent()
    {
        position = new Vector2f(0,0);
        gameComponents.add(this);
    }

    public GameComponent(float x, float y)
    {
        position = new Vector2f(x, y);
        gameComponents.add(this);
    }

    public GameComponent addComponent(GameComponent gameComponent)
    {
        this.gameComponents.add(gameComponent);
        return this;
    }

    public GameComponent loadTexture(String file)
    {
        try
        {
            this.texture = TextureLoader.getTexture("PNG", new FileInputStream(file));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new GameException("Texture not found!");
        }
        return this;
    }

    public void draw()
    {

    }
}
