import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
            System.out.println(ggWorld.getLevel());
            
        }

    }

}  

