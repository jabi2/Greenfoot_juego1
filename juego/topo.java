import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class topo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
            //move (1);
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
        
    
        //imagen = getImage()
        if (worm != null)
            if (Greenfoot.isKeyDown("space"))
            {
                setImage("red-draught.png");
            
            
                World world;
                world = getWorld();
                world.removeObject(worm);
            }// Add your action code here.
    }   
}
