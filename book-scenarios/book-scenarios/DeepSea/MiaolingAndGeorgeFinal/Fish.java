import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fish class is a child to the Actor super class.
 * 
 * @author (Miaoling Zhang & George Gichuki) 
 * @version (03/10/2020)
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
        setLocation(getX()+speed, getY());   
        
        if(getX()==779)
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
