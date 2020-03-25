import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
       
        //here comes the solution for 2.35
     
        if(isBored()){
           dance();
        }
      
       //here comes the solution for 2.36
        if(isHungry()){
           eat();
       
        }
       //here comes the solution for 2.37        
        if(isSleepy()){
          sleep(2);
          shoutHooray();
        }else{
            shoutHooray();
            }
                  
         
       //here comes the solution for 2.38
        if(isAlone()){
           sleep(3);
        }else{
         shoutHooray();
        }
        
    }   
} 

