import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food3 extends Actor
{
    /**
     * Act - do whatever the food3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(player1.class)){
            if(Greenfoot.isKeyDown("d")){
                setLocation(getX()+1,getY());
            }
            if(Greenfoot.isKeyDown("a")){
                setLocation(getX()-1,getY());
            }
            if(Greenfoot.isKeyDown("s")){
                setLocation(getX(),getY()+1);
            }
            if(Greenfoot.isKeyDown("w")){
                setLocation(getX(),getY()-1);
            }
        }
        if(isTouching(player2.class)){
            if(Greenfoot.isKeyDown("right")){
                setLocation(getX()+1,getY());
            }
            if(Greenfoot.isKeyDown("left")){
                setLocation(getX()-1,getY());
            }
            if(Greenfoot.isKeyDown("down")){
                setLocation(getX(),getY()+1);
            }
            if(Greenfoot.isKeyDown("up")){
                setLocation(getX(),getY()-1);
            }
        }
    }
}
