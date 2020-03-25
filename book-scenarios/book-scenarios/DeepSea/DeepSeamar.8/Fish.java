import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * small fish swim along .
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private int speed;
    
    /**
     * Contructor: Initialise the swiming speed to a random value.
     */
    public Fish()
    {
        speed = Greenfoot.getRandomNumber(2) +1;
        
    }
    
    /**
     * Swim along, up to right down. Disappear when reaching the right edge
     */
    public void act() 
    {
        setLocation(getX()-speed, getY());
        move(1);
       
    
        
        if(getX()==0 )
        {
            
            MyWorld myNewWorld = (MyWorld)getWorld();
            
            int aNB=myNewWorld.getNumberOfFishMissed();
            aNB++;
            myNewWorld.setNumberOfFishMissed(aNB);
            myNewWorld.addScore(-1);
            myNewWorld.removeObject(this);
            
        }   
    }
}
