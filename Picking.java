import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Picking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picking extends KeyAndButton
{
    /**
     * Act - do whatever the Picking wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Picking(){
    }
    public Picking(int i){
        if(i==1){
         GreenfootImage img = new GreenfootImage(">            <",50,Color.DARK_GRAY,null);
         setImage(img);
        }else if(i==2){
         GreenfootImage img = new GreenfootImage(">                <",50,Color.DARK_GRAY,null);
         setImage(img);
        }
        else if(i==3){
         GreenfootImage img = new GreenfootImage(">            <",50,Color.DARK_GRAY,null);
         setImage(img);
        }else if (i==10){
         GreenfootImage img = new GreenfootImage(">>",30,Color.DARK_GRAY,null);
         img.rotate(90);
         setImage(img);
        }else if (i==11){
         GreenfootImage img = new GreenfootImage(">>",30,Color.DARK_GRAY,null);
         img.rotate(90);
         setImage(img);
        }
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
