import greenfoot.*;

/**
 * A Greep is an alien creature that likes to collect tomatoes.
 * 
 * @Miaoling Zhang
 * @version 0.2
 */
public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this class!
    
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
        if (carryingTomato()) 
        {
            if (atShip()) 
            {
                dropTomato();
                move();
            }
            else 
            {
                if(randomChance(25))
                {
                    turnHome();
                    atSomeWhere();
                }
                atSomeWhere();
                checkFood();
                atSomeWhere();
                move();
            }
        }
        else 
        {
            atSomeWhere();//find,check,mark and waiting for pick up
            checkFood();
            atSomeWhere();
            mark();
        }
    }
    
    /**
     * at some where, greeps need make a turn to find other way to walk for finding tomators or 
     * back to the ship.
     */
    private void atSomeWhere()
    {
        if(atWater())
        {
            turn(Greenfoot.getRandomNumber(30));
            spit("red");
            mark();
        }
        else
        {
            mark();
        }
        if(atWorldEdge())
        {
            turn(Greenfoot.getRandomNumber(30));
            mark();
        }
    }
    /**
     * 
     */
    public void mark()
    {
        Greep greeps=(Greep)getOneIntersectingObject(Greep.class);
        if(!getFlag(1))
        {
            move();
        }
        if(getFlag(1))
        {
            move(0);
        }
    }
      
    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        if (tomatoes != null) 
        {
            setFlag(1, true);
            loadTomato();
            // Note: this attempts to load a tomato onto *another* Greep. It won't
            // do anything if we are alone here.
        }
    }

    /**
     * This method specifies the name of the author (for display on the result board).
     */
    public static String getAuthorName()
    {
        return "";  // write your name here!
    }

    /**
     * This method specifies the image we want displayed at any time. (No need 
     * to change this for the competition.)
     */
    public String getCurrentImage()
    {
        if (carryingTomato()) {
            spit("purple");
            return "greep-with-food.png";
            
        }
        else {
            return "greep.png";
        }
    }
}