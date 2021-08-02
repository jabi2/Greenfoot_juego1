import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Codigo para el control del primer jugador
 *
 *  Utilizar las flechas y el espacio para controlar la pelota dorada y apachar hormigas.
 *
 */
public class topo extends Actor
{
    /**
     * Act - do whatever the topo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
    public static int score= 0;
    public void moveAndTurn()
    {
        setImage("gold-ball.png");

        int a;
        a = getX();

        int b;
        b = getY();

        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(a,b-1);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(a-1,b);

        }

        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(a+1,b);
        }

        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(a,b+1);
        }
    }

    public void eat()
    {
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class);

        if (worm != null)
            if (Greenfoot.isKeyDown("space"))
            {
                setImage("red-draught.png");


                World world;
                world = getWorld();
                world.removeObject(worm);
                Greenfoot.playSound("Splat.mp3");
                score++;
            }
    }
    public void morir()
    {
        if (score >= 10)
        {
            Actor topo;
            topo = getOneObjectAtOffset(0, 0, topo2.class);
            World world;
            world = getWorld();
            world.removeObject(topo);
        }
    }
}
