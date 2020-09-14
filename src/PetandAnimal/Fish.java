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
public class Fish extends Animal implements Pet{
    private String name = "";
    
    public Fish(){
        super(0);
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
        System.out.println("Play: OK");
    }
    
    @Override
    public void walk(){
        System.out.println("NOT walk");
    }
    
    @Override
    public void eat(){
        System.out.println("Eat vegetable"); 
    }
}
