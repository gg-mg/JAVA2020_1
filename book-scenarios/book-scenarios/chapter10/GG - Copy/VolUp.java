import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolUp extends Actor
{
    private GreenfootSound music;
     
    public VolUp (GreenfootSound musik)
    {
        this.music = musik;
    }
   
    public void act() 
    {
        isClicked();
    }   
   
    public void isClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
             
            //System.out.print(music.getVolume() + " initVolUp \n");
            music.setVolume(music.getVolume()+ 10);
            //System.out.print(music.getVolume() + " VolUp \n");
        }
    }
}