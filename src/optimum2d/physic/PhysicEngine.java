package optimum2d.physic;

import optimum2d.component.entities.Entity;
import optimum2d.main.Game;

/**
 * Created by Biw on 8/12/2557.
 */
public class PhysicEngine
{
    public static PhysicEngine instance = new PhysicEngine();

    public void checkCollision(Entity entity)
    {
        this.checkOutOfFrame(entity);
    }

    private void checkOutOfFrame(Entity entity)
    {
        if (entity.position.getX() <= 0)
        {
//            Scene.clear();
//            SceneDivider.instance.previousScene();
//            SceneDivider.instance.render();
            entity.position.x = 1;
        }
        else if (entity.position.getX() + entity.getWidth() >= Game.coreEngine.getWidth())
        {
//            Scene.clear();
//            SceneDivider.instance.nextScene();
//            SceneDivider.instance.render();
            entity.position.x = Game.coreEngine.getWidth() - entity.getWidth() - 1;
        }
        else if (entity.position.getY() <= 0)
        {
            entity.position.y = 1;
        }
        else if (entity.position.getY() + entity.getHeight() >= Game.coreEngine.getHeight())
        {
            entity.position.y = Game.coreEngine.getHeight() - entity.getHeight() - 1;
        }
    }
}
