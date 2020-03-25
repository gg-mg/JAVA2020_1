import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
   
    {
        randomTurn();
        turnAtEdge();
        move(5);
        lookForCrab(); 
    }
}
    /**
     * Check whether we have stumbled upon a worm.
     * If we have, eat it. If not, do nothing.
     */

    public void lookForCrab()
    {
        if(isTouching(Crab.class)){
            removeTouching(Crab.class);
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
