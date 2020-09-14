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
public class TestMovable {
    public static void main(String[] args){
        Movable m1 = new MovablePoint(5,3);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveUp();
        m1.moveUp();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        m1.moveLeft();
        m1.moveLeft();
        System.out.println(m1);
    }
}
