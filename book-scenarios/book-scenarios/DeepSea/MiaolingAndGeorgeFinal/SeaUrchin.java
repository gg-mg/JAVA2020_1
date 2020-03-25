import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SeaUrchin here.
 * 
 * @author (Miaoling Zhang & George Gichuki) 
 * @version (a version number or a date)
 */
public class SeaUrchin extends Actor
{
    private int speed;    
    /**
     * contructor: Initialise the swimming speed to a random value.
     */
    public SeaUrchin()
    {
        speed = Greenfoot.getRandomNumber(2) +1;
        setRotation(Greenfoot.getRandomNumber(360));        
    }
    
    /**
     * Swimming along, right to left. Disappear when reaching the left edge.
     */
    public void act() 
    {
      move(3);
      turnAtEdge();   
      StrikeSeaHorse();
    }
    public void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(1);
        }
    }
    
      public void StrikeSeaHorse()
    {
        if ( isTouching(SeaHorse.class) ) 
        {     
            MyWorld ggWorld = (MyWorld)getWorld();
            ggWorld.getMySong().stop();                        
            ggWorld.showText(" THE SEAHORSE IS DEAD, RESET", 350,100);
            ggWorld.showText(" Your final score: " + ggWorld.getScore() + " Points", 350,150);            
            Greenfoot.playSound("theEnd.mp3");
            ggWorld.removeObject(ggWorld.getMySeaHorse());
            setImage("seaBottom.png");            
            Greenfoot.stop();
        }
    }
}


