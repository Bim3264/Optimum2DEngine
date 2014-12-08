package theroyalguard;

import optimum2d.component.entities.EntityPlayer;
import optimum2d.graphics.scene.Scene;
import optimum2d.main.Game;
import optimum2d.main.Updater;
import optimum2d.physic.PhysicEngine;
import optimum2d.rendering.RenderingEngine;

/**
 * Created by Biw on 29/11/2557.
 */
public class Main extends Game implements Updater
{
    public RenderingEngine renderingEngine = new RenderingEngine();

    public EntityPlayer player = null;

    public static void main(String[] args)
    {
        coreEngine.setTitle("The Royal Guard");
        launch();
    }

    @Override
    public void init()
    {
        this.setRenderingEngine(renderingEngine);
        
        player = new EntityPlayer("Royal");

        Scene.loadTexture("test_scene_2.png", 0);
        Scene.loadTexture("test_scene_3.png", 1);
        Scene.loadTexture("test_scene_4.png", 2);
    }

    @Override
    public void input()
    {
        player.updateInput();
    }

    @Override
    public void update()
    {
        //Debugging
        Scene.draw(0);
        player.render();

        PhysicEngine.instance.checkCollision(player);

//        System.out.println("Player X : " + player.position.getX() + "Player Y : " + player.position.getY());
    }
}
