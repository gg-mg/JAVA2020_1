import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VolumeBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VolumeBar extends Actor
{
    private GreenfootImage bar;
    private int barLevel;      
   
    public VolumeBar(){   
        barLevel = 50;
        bar = new GreenfootImage(200,200);
        bar.setColor(new Color(0, 0, 0));
        bar.drawRect(0,0,150,40); 
        bar.fillRect(0,0,150,40);
        bar.drawRect(18,12,100,15);
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
        bar.drawRect(0,0,150,40); 
        bar.fillRect(0,0,150,40);
        bar.drawRect(18,12,100,15);
        bar.setColor(new Color(255, 255, 255)); 
        bar.fillRect(18,12,100,15);
        bar.setColor(new Color(0, 0, 255));      
        bar.fillRect(18,12,barLevel,15);
        setImage(bar);
    }
    /**
     * Act - do whatever the VolumeBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*public void act() 
    {
        if (Greenfoot.mouseClicked(VolumeUp.class)){
            changeVolume();
        }
    }*/  

}
