import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class random_car_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Greencar extends Actor
{
    /**
     * Act - do whatever the random_car_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1%3);
        
        if(isAtEdge())
        {
            turn(-45);
        }
        
        if(getX() == 75 && getY() == 550)
        {
            setRotation(0);
        }
        
        if(getX() == 850 && getY() == 550)
        {
            setRotation(-90);
        }
        
        if(getX() == 850 && getY() == 80)
        {
            setRotation(-180);
        }
        
        if(getX() == 75 && getY() == 80)
        {
            setRotation(-270);
        }
        
    }
    
    
}   


