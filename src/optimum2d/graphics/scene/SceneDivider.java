package optimum2d.graphics.scene;

import org.newdawn.slick.opengl.Texture;

import java.util.HashMap;

/**
 * Created by Biw on 8/12/2557.
 */
public class SceneDivider
{
    public static SceneDivider instance = new SceneDivider();
    private static HashMap<Integer, Texture> scene_texture = new HashMap<Integer, Texture>();

    public int current_scene = 0;

    public int getCurrent_scene()
    {
        return current_scene;
    }

    public void setCurrent_scene(int current_scene)
    {
        this.current_scene = current_scene;
    }

    /**
     * Change the scene to the next scene.
     */
    public void nextScene()
    {
        if (current_scene < scene_texture.size())
        {
            current_scene++;
        }
        else if (current_scene == scene_texture.size())
        {
            current_scene = scene_texture.size();
        }
    }

    /**
     * Change the scene to the previous scene
     */
    public void previousScene()
    {
        if (current_scene > 0)
        {
            current_scene--;
        }
        else if (current_scene == 0)
        {
            current_scene = 0;
        }
    }

    /**
     * Render the background (scene)
     */
    public void render()
    {
        Scene.draw(current_scene);
    }

    /**
     * Add the texture to a specify scene
     * @param texture The texture that will be bind.
     * @param scene_number The scene that the texture will be bind to.
     */
    public static void bind(Texture texture, int scene_number)
    {
        scene_texture.put(scene_number, texture);
    }

    /**
     * Get the texture for the scene to be render.
     * @param scene_number The number of the scene to get the texture.
     * @return
     */
    public static Texture getTexture(int scene_number)
    {
        return scene_texture.get(scene_number);
    }
}
