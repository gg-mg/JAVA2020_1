import greenfoot.*;

/**
 * A Greep is an alien creature that likes to collect tomatoes.
 * 
 * @author (George Gichuki)
 * @version 0.2
 */
public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this class!
    final static int HOW_MUCH_STEPS = 10;
    //final static int HALF= 180;
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
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject
            (TomatoPile.class);

        moveIt();
          if (carryingTomato()) {      
             //if(atWater() || atWorldEdge()) 
             if(atWater()){
                setMemory(HOW_MUCH_STEPS + Greenfoot.getRandomNumber(HOW_MUCH_STEPS/2));
                //turn(Greenfoot.getRandomNumber(90)); 
            turn(-90);
            } 
              
              
            if(getMemory() == 0) {                
                turnHome();
            } else {                
                setMemory(getMemory() -1);
            }
            
            if(atShip()) {
                dropTomato();
                turn(180);
            }
            
            /*if(atWater() || atWorldEdge()) {
                setMemory(HOW_MUCH_STEPS + Greenfoot.getRandomNumber(HOW_MUCH_STEPS/2));
                turn(Greenfoot.getRandomNumber(FULL_360));
            }*/
            
            move();
        }
        else{
            if (tomatoes == null){                     
                if(getFlag(2)){
                    checkFood();
                    move();
                }
                else{
                    setFlag(1, true);
                    move();
                    checkFood();
                }
            }     

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

            loadTomato();

        }

    }

    // Note: this attempts to load a tomato onto *another* Greep. It won't
    // do anything if we are alone here.

    /**
     * This method specifies the name of the author (for display on the result board).
     */
    public static String getAuthorName()
    {
        return "George Gichuki";  // write your name here!
    }

    /**
     * This method specifies the image we want displayed at any time. (No need 
     * to change this for the competition.)
     */
    public String getCurrentImage()
    {
        if (carryingTomato()) {
            return "greep-with-food.png";
        }
        else {
            return "greep.png";
        }
    }

    public void moveIt(){

        if (atWorldEdge())
        {

            turn(30);

        } 
        if (atWater())
        {            
            turn(120);
        }

    }

}