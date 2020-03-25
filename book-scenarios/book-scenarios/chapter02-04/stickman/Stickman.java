import greenfoot.*;

/**
 * This is a stick man. Make him run and jump.
 * 
 * @author 
 * @version 
 */
public class Stickman extends Actor
{
    /**
     * Make the stickman act.
     */
    public void act() 
    {   
        //solution for exer 3.31
        
        move(5);

        //solution for exer 3.32       

        if(Greenfoot.getMicLevel() > 5)
        {
            move(3);
        }

        //solution for exer 3.34
        
        moveLeftIfNoise();
        
        //solution for exer 3.35
        
        gameOver();
    }

    public void moveLeftIfNoise()
    {           
        if(Greenfoot.getMicLevel() > 5)
        {
            move(-5);
        }
    }

    public void gameOver() 
    {    
        if(isAtEdge())
        {
            Greenfoot.playSound("gameOver.wav");
            Greenfoot.stop();
        }
    }
}
