import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage img1;
    private GreenfootImage img2;
    
    public Crab()
    { 
        this.img1 =private GreenfootImage ("crab.png")
    private GreenfootImage img2;
        
    }
    
    
    public void act()// default constructor
    {
        this.randomTurn();
        this.turnAtEdge();
        this.move(5);
        lookForWorm();
        checkKeypress();
    }

    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing.
     */

    public void lookForWorm()
    {
        if(isTouching(Worm.class)){//if it catches the worm
            removeTouching(Worm.class);//it will consume the worm
            Greenfoot.playSound("au.wav");
        }

    }

    /**
     * Check whether we are at the edge of the world
     * If we are at the edge of the Crabworld, turn to get back into the 
     * Crabworld.
     */

    public void turnAtEdge()
    {
        if(isAtEdge()){
            turn(17);            
        }
    }

    /**
     * Check whether we are at the edge of the world
     * If we are at the edge of the Crabworld, turn to get back into the 
     * Crabworld.
     */

    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(90)-45);

        }
    }
      public void checkKeypress()
    {
        if(Greenfoot.isKeyDown("left")){
            turn(-4);

        }
         if(Greenfoot.isKeyDown("right")){
            turn(4);

        }
    }
}
