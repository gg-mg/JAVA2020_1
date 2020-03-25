import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the PlayButton class which defines the play and pause buttons.
 * It is a child class to the Actor class.
 * 
 * @author (George Gichuki) 
 * @version (3/7/2020)
 */
public class PlayButton extends Actor
{   private GreenfootImage image1;
    private GreenfootImage image2;

    public PlayButton()
    {
        image1 = new GreenfootImage("button1.jpg");
        image2 = new GreenfootImage("button2.jpg");
    }
    /**
     * Act - do whatever the VolumeUpButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            MyWorld myNewWorld =(MyWorld)getWorld();
            if(!myNewWorld.getEurySong().isPlaying()){                
                myNewWorld.getEurySong().play();               
                setImage(image2);                        
            }
            else{
                 myNewWorld.getEurySong().pause();
                 setImage(image1);
            }    
        } 
    }  
}
        
        
      
