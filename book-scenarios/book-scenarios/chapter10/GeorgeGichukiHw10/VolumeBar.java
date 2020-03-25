import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the VolumeBar class which defines the volume bar.
 * It is a child class to Actor.
 * 
 * @author (George Gichuki) 
 * @version (3/7/2020)
 */
public class VolumeBar extends Actor
{
    private GreenfootImage bar;
    private int barLevel;      
   
    public VolumeBar(){   
        barLevel = 50;
        bar = new GreenfootImage(200,200);
        bar.setColor(new Color(0, 0, 0));        
        bar.fillRect(0,0,150,40);        
        bar.setColor(new Color(255, 255, 255)); 
        bar.fillRect(18,12,100,15);
        bar.setColor(new Color(0, 0, 255));              
        bar.fillRect(18,12,barLevel,15);        
        setImage(bar);
    }
     public void changeBar(){
        MyWorld world = (MyWorld)getWorld();
        barLevel = world.getLevel();
        bar = getImage();
        bar.clear();
        bar.setColor(new Color(0, 0, 0));         
        bar.fillRect(0,0,150,40);        
        bar.setColor(new Color(255, 255, 255)); 
        bar.fillRect(18,12,100,15);
        bar.setColor(new Color(0, 0, 255));      
        bar.fillRect(18,12,barLevel,15);   
        world.showText("" + barLevel, 332,70);   
        setImage(bar);
    }
 }
