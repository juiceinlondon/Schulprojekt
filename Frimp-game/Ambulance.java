import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;
import greenfoot.GreenfootImage;
import java.util.List;
import java.lang.Math;

/**
 * Write a description of class car_forward here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends Actor 
{
    /**
     * Act - do whatever the car_forward wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        steuerung();
        istGeparkt();
        checkCollision();
        
        if(isAtEdge())
        {
            Greenfoot.stop();
        }
        
        
    }        
    
    public void checkCollision()
    {
            Actor Greencar;
            Greencar = this.getOneIntersectingObject(Greencar.class);
            
            if(Greencar != null)
            {
                // System.out.println("GAME OVER!");
                Towtruck truck = new Towtruck(this);
                getWorld().addObject(truck, 218, 220);
                truck.setRotation(90);
                
                getWorld().addObject(new Boom(), getX(), getY());
                getWorld().addObject(new Endscreen(), 461, 313); 
                
            }
        
       
        
            
    }
    
      
    private void steuerung()
    {
                
        if(getX() == 850 && getY() == 450)
        {
            setRotation(-90);
        }
        
        
        if (Greenfoot.isKeyDown("a"))
        {
        turn(-2);
        }
        
        if (Greenfoot.isKeyDown("d"))
        {
        turn(2);
        }

        if (Greenfoot.isKeyDown("w"))
        {
        move(2);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
        move(-2);
        }  

        
    }
          
    private void istGeparkt()
    {

        Checkpoint cp = (Checkpoint) getOneIntersectingObject(Checkpoint.class);
        if (cp!= null)
        {
            int cpx= cp.getX();
            int cpy= cp.getY();
            
            if(Math.abs(getX()-cpx)<6 && Math.abs(getY()-cpy)<6 && ((Math.abs(getRotation()-90)<5) || Math.abs(getRotation()-270)<5) )
            {
            
                Greenfoot.stop();
            }
        }  

        
    }
    

}

