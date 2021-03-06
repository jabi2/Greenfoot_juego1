import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Codigo para el control del segundo jugador.
 *
 * Utilizar WASD y R para controlar la pelota plateada y apachar hormigas.
 *
 */
public class topo2 extends Actor
{
    /**
     * Act - do whatever the topo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn2();
        eat2();
    }
    public static int score= 0;
    public void moveAndTurn2()
    {
        setImage("steel-ball.png");

        int a;
        a = getX();

        int b;
        b = getY();

        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(a,b-1);
            //move (1);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(a-1,b);

        }

        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(a+1,b);
        }

        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(a,b+1);
        }
    }

    public void eat2()
    {
        Actor worm;
        worm = getOneObjectAtOffset(0, 0, Worm.class);


        //imagen = getImage()
        if (worm != null)
            if (Greenfoot.isKeyDown("r"))
            {
                setImage("red-draught.png");


                World world;
                world = getWorld();
                world.removeObject(worm);
                Greenfoot.playSound("Splat.mp3");
                score++;
            }// Add your action code here.
    }
}
