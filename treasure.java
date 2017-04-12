import greenfoot.*;

/**
 * Write a description of class treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class treasure extends Actor
{
    /**
     * Act - do whatever the treasure wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        disappear();// Add your action code here.
    } 
    public void disappear()
    {
        Actor runner;
        runner=getOneObjectAtOffset(20,0,runner.class);
        if(runner!=null)
        {
            World World;
            World=getWorld();
            World.removeObject(runner);
             display_won nP = new display_won();
            World.addObject(nP,getX(),getY());
        }
        
    }
}
