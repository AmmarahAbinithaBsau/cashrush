import greenfoot.*;

/**
 * Write a description of class runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class runner extends Actor
{
    /**
     * Act - do whatever the runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        collect();// Add your action code here.
    }    

 public void moveAndTurn()
    {
        move(2);
         if(Greenfoot.isKeyDown("left"))
        {
            this.setRotation(180);
            this.move (5);
        }    
        if(Greenfoot.isKeyDown("right"))
        {
            this.setRotation(0);
            this.move (5);
        }  
        if(Greenfoot.isKeyDown("up"))
        {
            this.setRotation(270);
            this.move (5);
        }    
        if(Greenfoot.isKeyDown("down"))
        {
            this.setRotation(90);
            this.move (5); 
        
        }
    }
     public void collect()
    {
      Actor gold;
      gold = getOneObjectAtOffset(0,0,gold.class);
      if(gold!=null)
       {
        World World;
        World =getWorld();
        World.removeObject(gold);
       }
    }
}