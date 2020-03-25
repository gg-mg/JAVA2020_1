import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 * 
 * Version: 2
 * 
 * In this version, the crab walks around the beach more or less randomly.
 */
public class Crab extends Actor
{
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
      
    public void act()
    {
        randomTurn();
        turnAtEdge();
        move(5);
        lookForWorm(); 
    }

    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing.
     */

    public void lookForWorm()
    {
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
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

}