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
public class TestAnimal {
    public static void main(String[] args){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        
        //FISH
        d.setName("Fish XYZ");
        System.out.println("Name fish: "+ d.getName());
        System.out.println("Legs: " + d.getLegs());
        d.walk();
        d.eat();
        d.play();
        
        Fish a1 = (Fish) a;
        a1.setName("Fish ABC");
        System.out.println("Name fish: "+ a1.getName());
        System.out.println("Legs: " + a1.getLegs());
        a1.walk();
        a1.eat();
        a1.play();
        System.out.print("\n");
        
        //Cat
        System.out.println("Name cat: "+ c.getName());
        System.out.println("Legs: " + c.getLegs());
        c.walk();
        c.eat();
        c.play();
        
        Cat p1 = (Cat) p;
        p1.setName("MeoMeo");
        System.out.println("Name fish: "+ p1.getName());
        System.out.println("Legs: " + p1.getLegs());
        p1.walk();
        p1.eat();
        p1.play();
        System.out.print("\n");
        
        //Spider
        e.eat();
        e.walk();
        System.out.println("Legs: " + e.getLegs());
        
    }
}
