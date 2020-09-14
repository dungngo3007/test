/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetandAnimal;

/**
 *
 * @author pc
 */
public abstract class Animal {
    private int legs;
    
    public Animal(int legs){
        this.legs = legs;
    }
    
    public abstract void eat();
    
    public void walk(){
        System.out.println("The animal walk"); 
    }
    
    public int getLegs(){
        return this.legs;
    }
}
