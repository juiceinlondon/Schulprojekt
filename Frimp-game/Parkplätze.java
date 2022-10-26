import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Actor;
//import

/**
 * Write a description of class parkplätze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parkplätze extends World
{

    /**
     * Constructor for objects of class parkplätze.
     * 
     */
    public Parkplätze()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(923, 616, 1); 
        
        int x = Greenfoot.getRandomNumber(5); 
        int y = Greenfoot.getRandomNumber(2); 
        
        addObject(new Checkpoint(), 218+123*(x), 403+183*(y-1));
        addObject(new Ambulance(), 850, 450);
        addObject(new Greencar(), 75, 550);
        
        
        
        
        
        
       
                
        
    }
}
