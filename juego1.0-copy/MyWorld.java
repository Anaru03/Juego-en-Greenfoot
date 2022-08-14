import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    player1 player = new player1();
    player2 player2 = new player2();
    mesa mesa1 = new mesa();
    mesa mesa2 = new mesa();
    mesa mesa3 = new mesa();
    mesa mesa4 = new mesa();
    level level = new level();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        moreFood();
    }
    private void prepare(){
    addObject(counter,42,40);
    addObject(player,300,300);
    addObject(mesa1,215,220);
    addObject(mesa2,215,335);
    addObject(mesa3,390,220);
    addObject(mesa4,390,335);
    addObject(player2,500,300);
    addObject(level,500,100);
    Greenfoot.playSound("m.mp3");
    }
    public  void moreFood(){
        food1 food1 = new food1();
        addObject(food1,200,100);
    }
    public void moreFood2(){
        food2 food2 = new food2();
        addObject(food2,230,100);
    }
    public void moreFood3(){
        food3 food3 = new food3();
        addObject(food3,250,100);
    }
    public Counter getCounter(){
        return counter;
    }
    public level getLevel(){
        return level;
    }
    public void winScreen(){
        winScreen win = new winScreen();
        addObject(win,300,200);
    }
}
