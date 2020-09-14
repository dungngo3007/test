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
public abstract class Shape {
    private String color;
    
    public Shape(String color){
        this.color = color;
    }
    
    public abstract double getArea();
    
    @Override
    public String toString(){
        return "Shape[color=" + this.color + "]";
    }
    
}
