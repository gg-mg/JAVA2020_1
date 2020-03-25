import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound mySong = new GreenfootSound("deepSea.mp3");
     private GreenfootSound catchFishSong = new GreenfootSound("longbeat.mp3");//need edit new song
    private GreenfootSound catchFishSong = new GreenfootSound("longbeat.mp3");//need edit new song
    //private GreenfootSound catchCrabSong = new GreenfootSound("fanfare.wav");
    //private GreenfootSound missSong = new GreenfootSound(" au.wav");
    //private GreenfootSound finalSong = new GreenfootSound("game-over.wav ");
    private int score;
    private int time;
    private int numberOfFishTouched;
    private int numberOfFishMissed;
    private int numberOfCrabTouched;
    private int numberOfCrabMissed;
    private int candy=0;
    
   /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 780x360 cells with a cell size of 1x1 pixels.
        super(780, 360, 1); 
        SeaHorse mySeaHorse = new SeaHorse();
        addObject(mySeaHorse, 120,180);
        showName();
        score = 0;
        time = 1500;
        showScore();
        showCandy();
        showTime();
    }
    
    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        mySong.play();
        if (Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new Fish(),2, Greenfoot.getRandomNumber(100));
            addObject(new Crab(),779, Greenfoot.getRandomNumber(360));
        }
        countTime();
    }
    /**
     * Add some points to the current score.
     * if the score falls below 0, game's up
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        
        if(score<0)
        {
            mySong.stop();
            //finalSong.play();
            Greenfoot.stop();
            
        }
    
        if(score%5==0) //earn a candy for every 5 scores.
        {
            
            candy = candy+1;//int candy++;//setImage//candy
            showCandy();
        }
    }
    /**
     * getter and setter
     */
    
    public GreenfootSound getCatchFishSong()
    {
         return catchFishSong;
    }
    public void setCatchFishSong(GreenfootSound catchFishSong)
    {
        this.catchFishSong = catchFishSong;
    }
    public int getNumberOfFishTouched()
    {
         return numberOfFishTouched;
    }
    public void setNumberOfFishTouched( int numberOfFishTouched)
    {
        this.numberOfFishTouched = numberOfFishTouched;
    }
    public int getNumberOfFishMissed()
    {
        return numberOfFishMissed;
    }
    public void setNumberOfFishMissed(int numberOfFishMissed)
    {
        this.numberOfFishMissed = numberOfFishMissed;
    }
        
    public int getNumberOfCrabTouched()
    {
        return numberOfCrabTouched;
    }
    public void setNumberOfCrabTouched(int numberOfCrabTouched)
    {
        this.numberOfCrabTouched = numberOfCrabTouched;
    }
    public int getNumberOfCrabMissed()
    {
        return numberOfCrabMissed;
    }
    public void setNumberOfCrabMissed(int numberOfCrabMissed)
    {
        this.numberOfCrabMissed = numberOfCrabMissed;
    } 
    
    /**
     * show the name and the values of the above two variables
     * at the higher left corner under the score bar
     */
    public void showName()
    {
        showText("Fish Touched:" + numberOfFishTouched,80,45);
        showText("Crab Touched:" + numberOfCrabTouched,80,65);
        
    }
    
    /**
     * Show current score at the higher left corner on the screen.
     */
    private void showScore()
    {
        showText("Score: " + score, 48,25);
       
    }
    private void showCandy()
    {
        showText("Candy: " + candy, 690,55);
    }
    
    /**
     * count down the game time and display it.Stop the game with 
     * a winning message when time is up.
     */
    private void countTime()
    {
        time--;
        showTime();
        //showImagine big candy
        if(time == 0)
        {
            mySong.stop();
            showEndMessage();
            Greenfoot.stop();
        }
    }

    /**
     * show the remaining game time on screen.
     */
    private void showTime()
    {
        showText("Time: " + time, 700,25);
    }
    
    /**
     * Show the end of game message on the screen.
    */
   private void showEndMessage()
   {
       if(score > 0)
       {
       showText(" Awsome--win!", 350,100);
       showText(" Your final score: " + score + "Points", 350,150);
       showText(" Your earn " + candy +"candy!", 350,180);
       }
       else 
       {
       showText(" OOPS!!!", 350,100);
       showText(" Your final score: " + score + "Points", 350,150);
       showText(" Try again and enjoy!", 350,180);
    }
           
    
}
}

    
    
   
     
    
        
