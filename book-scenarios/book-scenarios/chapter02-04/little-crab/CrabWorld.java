import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() //This is the contructor of the class, to create/build/construct an instance of this class.
    {
        super(560, 560, 1);//invoke the constructor of the superclass with the plugged in parameters
        
        Crab myCrab= new Crab();
        addObject (myCrab, 100, 200);
        
        addObject  (new Crab(), 200, 200);//anonymous object ; an object without a name.
    }
}