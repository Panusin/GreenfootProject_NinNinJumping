import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall2 extends Wall
{
    /**
     * Act - do whatever the Wall2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja();
    public void act() 
    {
        setLocation(getX(),getY()+nini.getRunSpeed());
        if(isAtEdge()){
           getWorld().removeObject(this);
        }
    }    
}
