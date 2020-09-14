/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovableInterface;

/**
 *
 * @author pc
 */
public class MovablePoint implements Movable {
    private int x;
    private int y;
    
    public MovablePoint(int x, int y){
        this.x = x;
        this.y =y;
    }
    
    @Override
    public String toString(){
        return "x:" + this.x + ",y:" + this.y;
    }
    
    @Override
    public void moveUp(){
        this.y++;
    }
    
    @Override
    public void moveDown(){
        this.y--;
    }
    
    @Override
    public void moveLeft(){
        this.x--;
    }
    
    @Override
    public void moveRight(){
        this.x++;
    }
}
