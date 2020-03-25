 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
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
  
    //public void adjustVolume(int adjustment){
       //level += adjustment;
       //eurySong.setVolume(level);
    //}
    public void setVolumar(){
        volumar.changeBar();
    }
}
    
