import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  SeaHorse swim so slowly so that it is challenge for them to get the food,
 *  and, they have no stomach, thus they needs to eat almost constantly, 
 *  also can only eat something like small fish or crustaceans.  
 * 
 * @author (Miaoling Zhang & George Gichuki) 
 * @version (03/10/2020)
 */
public class SeaHorse extends Actor
{
    /**
     * Act - move when cursor keys are pressed.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    }  
     /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    public void checkKeyPress()
    {
     if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
        
     if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+2);
        }
        
     if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+2, getY());
        }
        
     if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-2, getY());
        }
     
}
    /**
     * Check whether the sea horse catch the fish or crab. 
     * Remove fish or crab.
     */
    private void checkCollision()
    {
        if(isTouching(Fish.class))
        {
            MyWorld myNewWorld = (MyWorld)getWorld();
            GreenfootSound catchSong = myNewWorld.getCatchSong();
            catchSong.play();
            setImage("seaHo.png");
            int aNB=myNewWorld.getNumberOfFishTouched();
            aNB++;
            myNewWorld.setNumberOfFishTouched(aNB);
            myNewWorld.addScore(1);
            myNewWorld.showName();
            removeTouching(Fish.class);
        }
        
        if(isTouching(Crab.class))
        {
            MyWorld myNewWorld = (MyWorld)getWorld();
            GreenfootSound catchSong = myNewWorld.getCatchSong();
            catchSong.play();
            setImage("seaH.png");
            int aNB=myNewWorld.getNumberOfCrabTouched();
            aNB++;
            myNewWorld.setNumberOfCrabTouched(aNB);
            myNewWorld.addScore(2);
            myNewWorld.showName();
            removeTouching(Crab.class);
        }
    }   
}
