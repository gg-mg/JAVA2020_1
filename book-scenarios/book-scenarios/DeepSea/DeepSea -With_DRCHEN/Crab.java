import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private int speed;
    //private GreenfootSound missSong = new GreenfootSound(" au.wav");//new sound
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
            //missSong.play();
            MyWorld myNewWorld = (MyWorld)getWorld();
            
            int aNB=myNewWorld.getNumberOfCrabMissed();
            aNB++;
            myNewWorld.setNumberOfCrabMissed(aNB);
            myNewWorld.addScore(-2);
            myNewWorld.removeObject(this);
        } 
    }
}
