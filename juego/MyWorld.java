import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 *
 * @author Javier Bocanegra
 * @version Fase 2 prototipo inicial
 */
public class MyWorld extends World
{
    //public static int score1= topo.score11;
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld()
    {
        
        super(10, 10, 50);
        prepare();
    }
    //public int hormigas = numberOfObjects()
    public void act()
    {
        showText("Score P1: " + topo.score, 1, 0);
        showText("Score P2: " + topo2.score, 8, 0);
        
        //showText("objetos" + numberOfObjects() , 1,1);
        if (numberOfObjects() ==2)
        {
            nuevaRonda();
        }
        
    }
    public void summonHormigas()
    {
        Worm worm = new Worm();
        addObject(worm,Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm2 = new Worm();
        addObject(worm2,Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm3 = new Worm();
        addObject(worm3,Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm4 = new Worm();
        addObject(worm4,Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm5 = new Worm();
        addObject(worm5,Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm6 = new Worm();
        addObject(worm6,Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm7 = new Worm();
        addObject(worm7,Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm8 = new Worm();
        addObject(worm8, Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
        Worm worm9 = new Worm();
        addObject(worm9, Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
    }
    public void summonTopos()
    {
        topo topo = new topo();
        topo2 topo2 = new topo2();
        addObject(topo,0,0);
        addObject(topo2,9,9);
        //mueveTopos();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        summonHormigas();
        summonTopos();
        topo.score=0;
        topo2.score=0;
    }
    public int ronda = 1;
    //public java.util.List todos = getObjects(null);
    public void GameOver()
    {
        showText("Game Over", 4,1);
        if (topo.score > topo2.score)
        {
             showText("Ganó jugador 1", 4,2);   
        } else if (topo2.score > topo.score)
        {
            showText("Ganó jugador 2", 4,2);  
        } else
            showText("Empate" , 4 ,2);
            
        showText("Puntos P1:"+topo.score, 4,3);
        showText("Puntos P2:"+topo2.score, 4,4);
        Greenfoot.playSound("Victory.mp3");
        end end = new end();
        addObject(end,3,2);
        end end2 = new end();
        addObject(end2,5,2);
        end end3 = new end();
        addObject(end3,3,3);
        end end4 = new end();
        addObject(end4,5,3);
    }
    public void nuevaRonda()
    {
        //topo.removeObject(topo);
        //removeObjects(topo2);
        //summonHormigas();
        if (ronda == 3)
        {
            GameOver();
        } else
        {
            summonHormigas();
            ronda++;            
        }
            showText("Ronda "+ ronda, 4, 0);    

        //topo.score=0;
        //topo2.score=0;
        //Actor topo;
        //removeObjects(todos);
        //MyWorld.topo.setLocation(0,0);
        //MyWorld.removeObject(topo.actor);
        //topo.setLocation(0,0);
    }
}
