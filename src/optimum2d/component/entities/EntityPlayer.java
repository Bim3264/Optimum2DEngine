package optimum2d.component.entities;

import optimum2d.exception.GameException;
import optimum2d.physic.Direction;
import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector2f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Biw on 7/12/2557.
 */
public class EntityPlayer extends Entity
{
    public float speed = 8.0f;
    public float currentX = this.position.x, currentY = this.position.y;
    public float previousX = this.position.x, previousY = this.position.y;

    public HashMap<Direction, Texture> animation = new HashMap<Direction, Texture>();

    public EntityPlayer(String unlocalized_name)
    {
        super(unlocalized_name);
        this.loadTexture();
    }

    public EntityPlayer updateInput()
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_W))
        {
            position.y -= speed;
            currentY -= speed;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A))
        {
            position.x -= speed;
            currentX -= speed;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S))
        {
            position.y += speed;
            currentY += speed;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D))
        {
            position.x += speed;
            currentX += speed;
        }

        return this;
    }

    public EntityPlayer animate()
    {
        return this;
    }

    @Override
    public EntityPlayer loadTexture()
    {
        try
        {
            texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/" + unlocalized_name + ".png"));
            animation.put(Direction.FRONT, texture);
        }
        catch (Exception e)
        {
            try
            {
                texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/missing_texture.png"));
            }
            catch (IOException e1)
            {
                throw new GameException("There is some thing wrong with texture loading.");
            }
        }

        //TODO: Wait for texture
//        try
//        {
//            texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/" + unlocalized_name + "_right.png"));
//            animation.put(Direction.RIGHT, texture);
//        }
//        catch (Exception e)
//        {
//            try
//            {
//                texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/missing_texture.png"));
//            }
//            catch (IOException e1)
//            {
//                throw new GameException("There is some thing wrong with texture loading.");
//            }
//        }
//
//        try
//        {
//            texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/" + unlocalized_name + "_left.png"));
//            animation.put(Direction.LEFT, texture);
//        }
//        catch (Exception e)
//        {
//            try
//            {
//                texture = TextureLoader.getTexture("PNG", new FileInputStream("./res/missing_texture.png"));
//            }
//            catch (IOException e1)
//            {
//                throw new GameException("There is some thing wrong with texture loading.");
//            }
//        }

        return this;
    }

    public EntityPlayer setStartPos(Vector2f startPos)
    {
        this.position = startPos;
        return this;
    }
}
