import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is deep sea world.
 * 
 * @author (Miaoling Zhang & George Gichuki) 
 * @version (03/10/2020)
 */
public class MyWorld extends World
{
   private GreenfootSound mySong = new GreenfootSound("waterSound.mp3");
   private GreenfootSound finalSong = new GreenfootSound("final.mp3");
   private GreenfootSound catchSong = new GreenfootSound("longbeatReverse.mp3");
   private int score;
   private int time;
   private int numberOfFishTouched;
   private int numberOfFishMissed;
   private int numberOfCrabTouched;
   private int numberOfCrabMissed;   
   private SeaHorse mySeaHorse;  
   /**
     * Constructor  
     * 
     */
   public MyWorld()
   {    
      // Create a new world with 780x360 cells with a cell size of 1x1 pixels.
      super(780, 360, 1); 
      mySeaHorse = new SeaHorse();
      addObject(mySeaHorse, 120,180);
      SeaUrchin ggSeaUrchin = new SeaUrchin();
      SeaUrchin mySeaUrchin = new SeaUrchin();        
      addObject(ggSeaUrchin ,779, 50);
      addObject(mySeaUrchin ,779, 300);
      showName();
      score = 0;
      time = 1500;
      showScore();        
      showTime();
   }
   /**
     * Create new floating objects at irregular intervals.
     */
   public void act()
   {
      mySong.play();
        
      if (Greenfoot.getRandomNumber(100)<2){
          addObject(new Fish(),2, Greenfoot.getRandomNumber(360));
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
        
      if(score<-10){
          mySong.stop();
          showEndMessage();
          finalSong.play();            
          Greenfoot.stop();
      }       
   }
    
   /**
     * getter and setter
     */
   
   public int getScore()
   {
      return score;
   }
   public SeaHorse getMySeaHorse()
   {
      return mySeaHorse;
   }
   public GreenfootSound getCatchSong()
   {
      return catchSong;
   }
   public GreenfootSound getMySong()
   {
      return mySong;
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
   /**
    * count down the game time and display it.Stop the game with 
    * a winning or lossing the game message when time is up.
    */
   private void countTime()
   {
      time--;
      showTime();        
      if(time == 0)
      {
          mySong.stop();
          showEndMessage();
          finalSong.play();
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
      finalSong.play();
      if(score > 0)
      {
          showText(" IT IS A WIN!!!!!!", 350,100);
          showText(" Your final score: " + score + " Points", 350,150);       
      }
      else 
      {
          showText(" OOPS YOU LOST!!!!", 350,100);
          showText(" Your final score: " + score + " Points", 350,150);       
      }   
   }
}

    
    
   
     
    
        
