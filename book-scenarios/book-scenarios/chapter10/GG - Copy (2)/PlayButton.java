import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeUpButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            MyWorld myNewWorld =(MyWorld)getWorld();
            if( ! myNewWorld.getEurySong().isPlaying() ){
                
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
        
        
      
