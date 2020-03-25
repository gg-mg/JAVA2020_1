import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the VolumeUp class which defines the key that turns the volume up.
 * It is a child class to the Actor class.
 * 
 * @author (George Gichuki) 
 * @version (3/7/2020)
 */
public class VolumeUp extends Actor 
{
    private GreenfootImage image4;    

    public VolumeUp(){  
        image4 = new GreenfootImage("buttonUp.jpg"); 
    }
    /**
     * Act - do whatever the VolumeDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld ggWorld = (MyWorld)getWorld();
        if(Greenfoot.mouseClicked(this) && ggWorld.getLevel() < 100){             
            ggWorld.setLevel(ggWorld.getLevel()+5); 
            ggWorld.setVolumar();                       
        }
    }
}  

