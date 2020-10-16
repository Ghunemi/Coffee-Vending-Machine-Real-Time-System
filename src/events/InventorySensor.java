/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author Abd El Rahman
 */
public class InventorySensor {
    
    double sugar;
    double milk;
    double coffee;
    double water;
    double chocolate;
    int small;
    int medium;
    int large;

    public InventorySensor(double sugar, double milk, double coffee, double water, double chocolate, int small, int medium, int large) {
        this.sugar = sugar;
        this.milk = milk;
        this.coffee = coffee;
        this.water = water;
        this.chocolate = chocolate;
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMilk() {
        return milk;
    }

    public double getCoffee() {
        return coffee;
    }

    public double getWater() {
        return water;
    }

    public double getChocolate() {
        return chocolate;
    }

    public int getSmall() {
        return small;
    }

    public int getMedium() {
        return medium;
    }

    public int getLarge() {
        return large;
    }
}
