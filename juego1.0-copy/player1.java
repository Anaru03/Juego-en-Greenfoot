import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player1 extends Actor
{
    /**
     * Act - do whatever the player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+2,getY());
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-2);
        }
        
    }
}

