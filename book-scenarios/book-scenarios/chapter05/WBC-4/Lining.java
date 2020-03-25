import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are objects at the edge of the vein.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Lining extends Actor
{
    /**
     * Move the lining along at regular speed.
     */
    public void act() 
    {
        setLocation(getX()-1, getY());
        
        if (getX() == 0) 
        {
            World myWorld = this.getWorld();
            myWorld.removeObject(this); //This 
            this.move(1);//this cannot work because object has been removed.
            //Which class does getWorld belong to? It belongs to the act class.
            //Which class does getWorld belong to? removeObject belongs to the World class
            //getWorld().removeObject(this);This is the same as the first two lines combined.
        }
    }    
}
