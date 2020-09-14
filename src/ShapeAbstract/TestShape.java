/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeAbstract;

/**
 *
 * @author pc
 */
public class TestShape {
    public static void main(String[] args){
        Shape r1 = new Rectangle("blue",6,4);
        System.out.println(r1.getArea());
        System.out.println(r1.toString() + "\n");
        
        Shape t1 = new Triangle("red",4,5);
        System.out.println(t1.getArea());
        System.out.println(t1.toString());
        
    }
}
