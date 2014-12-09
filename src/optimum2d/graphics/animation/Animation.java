package optimum2d.graphics.animation;

import optimum2d.physic.Direction;

/**
 * Created by Biw on 9/12/2557.
 */
public class Animation
{
    public enum lookAt
    {
        RIGHT, LEFT, STRAIGHT
    }

    public static void animateMovement(Direction direction)
    {
        if (direction == Direction.RIGHT)
        {
            //TODO: Display animation for moving right
        }
        else if (direction == Direction.LEFT)
        {
            //TODO: Display animation for moving left
        }
        else
        {
            //TODO: Idle state
        }
    }
}
