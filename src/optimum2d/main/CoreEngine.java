package optimum2d.main;

/**
 * Created by Biw on 29/11/2557.
 */
public class CoreEngine
{
    public int width = 1280;
    public int height = 720;
    public String title = "Optimum Engine 2D";

    public CoreEngine()
    {
        this.width = 1280;
        this.height = 720;
        this.title = "Optimum Engine 2D";
    }

    public CoreEngine(int width, int height, String title)
    {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }
}
