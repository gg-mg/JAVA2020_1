import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolumeDown extends Actor
{
    private GreenfootImage image3;     
    private int volume;
    public VolumeDown(){
        image3 = new GreenfootImage("buttonDown.jpg");
        volume = 50;
    }
     
   
    /**
     * Act - do whatever the VolumeDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    {
        
        if(Greenfoot.mouseClicked(this)){           
            volume -= 5;              
            MyWorld ggWorld = (MyWorld)getWorld();
            ggWorld.getEurySong().setVolume(volume);
            System.out.println(volume);
        }
   }
     
}  

