import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mesa extends Actor
{
    int puntos = 0;
    int nivel = 1;
    /**
     * Act - do whatever the mesa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {  
        
        Actor mesa = getOneIntersectingObject(food1.class);
        Actor mesa2 = getOneIntersectingObject(food2.class);
        Actor mesa3 = getOneIntersectingObject(food3.class);
        if(mesa!=null){
            World myWorld = getWorld();
            MyWorld myworld = (MyWorld) myWorld;
            Counter counter = myworld.getCounter();
            level level = myworld.getLevel();
            
            if((puntos < 20)&&(nivel == 1)){
                counter.addScore1();
                puntos = puntos + 5;
                myworld.moreFood();
            }
            if((puntos == 20)&&(nivel == 1)){
                counter.resetScore();
                level.next();
                nivel = 2;
                puntos = 0;
                myworld.moreFood2();
            }
            
            
            myWorld.removeObject(mesa);
            myWorld.removeObject(mesa2);
            
        
        }
        if(mesa2!=null){
            World myWorld = getWorld();
            MyWorld myworld = (MyWorld) myWorld;
            Counter counter = myworld.getCounter();
            level level = myworld.getLevel();
            
            if((puntos < 30)&&(nivel == 2)){
                counter.addScore2();
                puntos = puntos + 3;
                myworld.moreFood2();
            }
            if((puntos == 30)&&(nivel == 2)){
                counter.resetScore();
                level.next();
                nivel = 3;
                puntos = 0;
                myworld.moreFood3();
            }
  
            myWorld.removeObject(mesa2);
            
        
        }
        if(mesa3!=null){
            World myWorld = getWorld();
            MyWorld myworld = (MyWorld) myWorld;
            Counter counter = myworld.getCounter();
            level level = myworld.getLevel();
            if((puntos < 40)&&(nivel == 3)){
                counter.addScore3();
                puntos = puntos + 2;
                myworld.moreFood3();
            }
            if((puntos == 40) && (nivel == 3)){
                myworld.winScreen();
            }
            
            
            myWorld.removeObject(mesa3);
            
        
        }
    }
}
