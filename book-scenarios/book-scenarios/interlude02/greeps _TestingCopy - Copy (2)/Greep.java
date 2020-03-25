import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this
//class!


    /**
     * Default constructor for testing purposes.
     */
    public Greep()
    {
        this(null);
    }


    /**
     * Create a Greep with its home space ship.
     */
    public Greep(Ship ship)
    {
        super(ship);
    }


    /**
     * Do what a greep's gotta do.
     */


         public void act()
    {
        super.act();   // do not delete! leave as first statement in act().
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
      
        worldEdge();
        if (carryingTomato())
        {
            spit("orange");
            if(atShip())
            {
                
                dropTomato();
                turn(180);
              
            }
            else
            {
               
                move();                
                turnHome();
            }
       }
        else
            if (tomatoes == null) {
            setFlag(1, true);
            move();
            checkFood();
           
            
            }


            else
            {   
            
                           
                move();
                checkFood();
            }

              } 
          


    


    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject
        (TomatoPile.class);
        if(tomatoes != null)
        {
            move();
            
            loadTomato();
        }
        else{
            return;
            
        }

    }


    public void worldEdge()
    {
        if (atWorldEdge())
        {
           
            turn(45);
        
        
}
        if (atWater())
        {    
    
        turn( 110);
    }


    
}

    /**
     * This method specifies the name of the author (for display on
the result board).
     */
    public static String getAuthorName()
    {
        return "Gichuki George";  // write your name here!
    }


    /**
     * This method specifies the image we want displayed at any time.
(No need
     * to change this for the competition.)
     */
    public String getCurrentImage()
    {
        if(carryingTomato())
            return "greep-with-food.png";
        else
            return "greep.png";
    }
}
