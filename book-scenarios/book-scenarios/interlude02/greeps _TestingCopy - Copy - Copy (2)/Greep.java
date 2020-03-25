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
        
        if (atWorldEdge()) {
            turn(45);
        }
        if (carryingTomato()) {
            spit("purple");
            if(atShip()) {
                dropTomato();
                turn(180);
                move();
                setMemory(0);
            }
            else {
                if (atWater()) {
                    turn(110);
                    move();
                }
                else {
                    turnHome();
                    move();
                }
            }
        }
        else {
            if (atWater()) {
                turn(110);
            }
            if (tomatoes != null) {
                if (getMemory() < 2 ) {
                    setMemory(getMemory() + 1);
                }
                if (getMemory() < 2) {
                    move();
                }
            }
        
            else {
                
               if (seePaint("purple")) {
                    
                        turn(90);
                        move();
                    }
               else {
                        turn(-90);
                        move();
                    }
                
                
            }
            checkFood();
        }
        if (tomatoes == null) {
            setMemory(0);
       }
    }

    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        setFlag(1, false);
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject
        (TomatoPile.class);
        if(tomatoes != null)
        {
            setFlag(1, true);
            loadTomato();
        }


    }

  

    /**
     * This method specifies the name of the author (for display on
the result board).
     */
    public static String getAuthorName()
    {
        return "George";  // write your name here!
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
