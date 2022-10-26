import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ttruck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Towtruck extends Actor
{
    private Ambulance car;
    
    public Towtruck(Ambulance car){
        this.car = car;       
    }
    
    /**
     * Act - do whatever the ttruck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
                turnTowards(car.getX(), car.getY());
                move(2);
            
    }
}
