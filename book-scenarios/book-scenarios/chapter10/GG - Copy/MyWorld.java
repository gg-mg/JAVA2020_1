import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound music = new GreenfootSound("freebird.mp3");
    private GreenfootImage volumeB = new GreenfootImage(50, 60);
    private int volume = 100;
    Actor volumeUp, volumeDown;
     
    public MyWorld()
    {
        super(600, 400, 1);
        setButtons();
    }
     
    public void setButtons()
    {
        startButton start = new startButton(music);
        addObject(start, 300, 200);
         
        volumeDown = new VolumeDown();
        addObject(volumeDown, 70, 300);
         
        volumeUp = new VolumeUp();
        addObject(volumeUp, 70, 250);
    }
     
    public void act()
    {
        if (Greenfoot.mouseClicked(volumeUp) && volume < 100) adjustVolume(5);
        if (Greenfoot.mouseClicked(volumeDown) && volume > 0) adjustVolume(-5);
    }
     
    public void adjustVolume(int adjustment)
    {
        volume += adjustment;
        music.setVolume(volume);
    }
}