import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolumeUp extends Actor
{
    private GreenfootImage image4;   
     
    public VolumeUp(){}
     
    public VolumeUp(GreenfootImage image4){
       image4 = new GreenfootImage("vUp.jpg");
    } 
    
    /**
     * Act - do whatever the VolumeDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    
    {
        int volume = 50;
        if(Greenfoot.mouseClicked(this)){
            MyWorld ggWorld = (MyWorld)getWorld(); 
                volume+=5;
                ggWorld.getEurySong().setVolume(volume);
            System.out.println(ggWorld.getEurySong().getVolume());
           
        }
   }
     
}  
