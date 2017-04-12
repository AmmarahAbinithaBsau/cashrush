import greenfoot.*;

/**
 * Write a description of class boundary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boundary extends Actor
{
    /**
     * Act - do whatever the boundary wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        disappear();// Add your action code here.
    } 
    
    public void disappear()
    {
        Actor runner;
        runner=getOneObjectAtOffset(0,0,runner.class);
        if(runner!=null)
        {
            World World;
            World=getWorld();
            World.removeObject(runner);
             display_lost nP = new display_lost();
            World.addObject(nP,getX(),getY());
        }
        
    }
}
