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
public class Cat extends Animal implements Pet{
    
    private String name;
    
    public Cat(){
        this("");
    }
    
    public Cat(String name){
        super(4);
        this.name = name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public void play(){
        System.out.println("Play :OK");
    }
    
    @Override
    public void eat(){
        System.out.println("Eat fish"); 
    }
}
