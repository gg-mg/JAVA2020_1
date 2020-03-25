import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fish class is a child to the Actor super class.
 * 
 * @author (Miaoling Zhang & George Gichuki) 
 * @version (03/10/2020)
 */
public class Crab extends Actor
{
    private int speed;
    
    /**
     * contructor: Initialise the swimming speed to a random value.
     */
    public Crab()
    {
        speed = Greenfoot.getRandomNumber(2) +1;
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    /**
     * Swimming along, right to left. Disappear when reaching the left edge.
     */
    public void act() 
    {
        setLocation(getX()-speed, getY());
        turn(1);
        
        if(getX()==0)
        {   
            MyWorld myNewWorld = (MyWorld)getWorld();            
            int aNB=myNewWorld.getNumberOfCrabMissed();
            aNB++;
            myNewWorld.setNumberOfCrabMissed(aNB);
            myNewWorld.addScore(-2);
            myNewWorld.removeObject(this);
        } 
    }
}
