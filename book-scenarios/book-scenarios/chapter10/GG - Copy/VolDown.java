import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolDown extends Actor
{
 
    private GreenfootSound music;
    /**
     * Act - do whatever the VolumeUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VolDown (GreenfootSound musik)
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
            //System.out.print(music.getVolume() + " initVolDn \n"); //Testing only
            music.setVolume(music.getVolume()-10);
            //System.out.print(music.getVolume() + " VolDn \n"); //Testing only
        }
    }
}
