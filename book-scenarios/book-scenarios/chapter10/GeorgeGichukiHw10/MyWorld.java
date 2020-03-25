 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class MyWorld is a child class to World.
 * I have defined 3 private data elements followed by a default constructor, MyWorld.
 * I have provided a getter and setter for the first two private data elements and
 * one effector.
 * @author (George Gichuki) 
 * @version (3/7/2020)
 */
public class MyWorld extends World
{
    private GreenfootSound eurySong;
    private int level = 50; 
    private VolumeBar volumar;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        eurySong = new GreenfootSound("EurythmicsSweetDreams.mp3");
        PlayButton myButton= new PlayButton();
        addObject(myButton, 150,300);
        VolumeUp upButton= new VolumeUp();
        addObject(upButton, 250,300);
        VolumeDown downButton= new VolumeDown();
        addObject(downButton, 50,300);
        volumar= new VolumeBar();
        addObject(volumar, 300,150);
        showText("" + level, 332,70);
    }    
    public GreenfootSound getEurySong()
    {
         return eurySong;
    }
    public void setEurySong(GreenfootSound eurySong)
    {
        this.eurySong = eurySong;
    }
    public int getLevel()
    {
         return level;
    }
    public void setLevel(int level)
    {
        this.level = level;
        eurySong.setVolume(level);
    }  
    public void setVolumar()
    {
        volumar.changeBar();
    }
    
}
    

