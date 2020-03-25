import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  SeaHorse swim so slowly so that it is chanllenge for them to get the food,
 *  and, they have no stomach, thus they needs to eat almost constantly, 
 *  also can only eat somthing like small fish or crustaceans.
 *  
 *  ( using keyboard for interaction)
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeaHorse extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    
    /**
     * Create a sea horse and initialize its two images.
     */
    public SeaHorse()
    {
        image1 = new GreenfootImage("sea-horse.png");
        image2 = new GreenfootImage("sea-horseB.png");
        image3= new GreenfootImage("seaFlip.png");
    }
    
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
        
     if(Greenfoot.isKeyDown("space"))//switch another iamge.
        {
            if(getImage() == image1)
        {
            setImage(image3);
        }
        else
        {
            setImage(image1);
        }
        
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
            MyWorld myRef = (MyWorld)(this.getWorld());
            //World myNewWorld = getWorld();
            myRef.getCatchFishSong().play();
            //switchImage();
            int aNB=myRef.getNumberOfFishTouched();
            aNB++;
            myRef.setNumberOfFishTouched(aNB);
            myRef.addScore(1);
            myRef.showName();
            switchImage3();
            removeTouching(Fish.class);
        }
        
        if(isTouching(Crab.class))
        {
            MyWorld myNewWorld = (MyWorld)getWorld();
            myNewWorld.getCatchCrabSong().play();
            switchImage();//need to test for work or not
            int aNB=myNewWorld.getNumberOfCrabTouched();
            aNB++;
            myNewWorld.setNumberOfCrabTouched(aNB);
            myNewWorld.addScore(2);
            myNewWorld.showName();
            removeTouching(Crab.class);
        }
    }
    
    private void switchImage()
    {
        if(getImage() == image3)
        {
            setImage(image2);
        }
        else
        {
            setImage(image2);
        }
    }
      private void switchImage3()
    {
        if(getImage() == image1)
        {
            setImage(image3);
        }
        else
        {
            setImage(image3);
        }
    }
    
}
