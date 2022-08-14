import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends Actor
{
    int level = 1;
    /**
     * Act - do whatever the level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Level : "+level, 25,Color.GREEN, Color.BLACK));
    }
    public void next(){
        level++;
    }
}
