/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Abd El Rahman
 */
public class Coffee {
   
    private static ArrayList<Coffee> coffeeTypes = new ArrayList<Coffee>();
    double milk;
    double coffee;
    double chocolate;
    double mocha;
    String coffeeName;
    double price;
    
    private Coffee(String name, double coffee,double milk , double chocolate,double price){
        this.coffeeName = name;
        this.coffee = coffee;
        this.milk = milk;
        this.chocolate=  chocolate;
        this.price=price;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getCoffee() {
        return coffee;
    }

    public double getMilk() {
        return milk;
    }

    public double getChocolate() {
        return chocolate;
    }
    public String getName(){
        return coffeeName;
    }
    
    private static void setCoffeeTypes()
    {
        
        Coffee americano = new Coffee("americano",4,2,0,15);
        Coffee cappuccino = new Coffee("cappuccino",5,5,0,15);
        Coffee espresso = new Coffee("espresso",4,0,0,10);
        Coffee mocha = new Coffee("mocha",5,2,3,30);
        Coffee machiatto = new Coffee("machiatto",4,5,5,30);
        Coffee latte = new Coffee("latte",3,10,0,15);
        
        
        
        coffeeTypes.add(mocha);
        coffeeTypes.add(espresso);
        coffeeTypes.add(americano);
        coffeeTypes.add(machiatto);
        coffeeTypes.add(latte);
        coffeeTypes.add(cappuccino);
    }
    
    public static  ArrayList<Coffee> getCoffeeTypes()
    {
        if (coffeeTypes.size() > 0)
            return coffeeTypes;
        else 
        {
            setCoffeeTypes();
            return coffeeTypes;
        }
    }        
}
