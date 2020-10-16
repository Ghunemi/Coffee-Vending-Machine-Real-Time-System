/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Abd El Rahman
 */
public class Inventory {
    
    private static Inventory inventorystorage = null;
    private double milk;
    private double coffee;
    private double chocolate;
    private double water;
    private double sugar;
    private int small;
    private int medium;
    private int large;
    

    private Inventory() {
        this.sugar = 12;
        this.milk = 11;
        this.coffee = 10;
        this.water = WaterTank.getInstance().getCapacity();
        this.chocolate = 10;
        this.small = 15;
        this.medium = 20;
        this.large = 25;
    }
    
    public static Inventory getInstance()
    { 
        if(inventorystorage == null)
        {
            inventorystorage = new Inventory();
            return inventorystorage;
        }
        else
        {
           return inventorystorage;
        }
    }
    
    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
        InventoryController.getInsatance().addWater(water);
    }

    public double getChocolate() {
        return chocolate;
    }

    public void setChocolate(double chocolate) {
        this.chocolate = chocolate;
    }

    public static Inventory getInventorystorage() {
        return inventorystorage;
    }

    public int getSmall() {
        return small;
    }

    public void setSmall(int small) {
        this.small = small;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getLarge() {
        return large;
    }

    public void setLarge(int large) {
        this.large = large;
    }
    
      public boolean releaseIngredients(double sugar, double milk,double coffee, double chocolate,int size){
        switch (size) {
            case 1:
                small--;
                break;
            case 2:
                medium--;
                break;
            case 3:
                large--;
                break;
            default:
                break;
        }
        this.sugar-=sugar;
        this.milk-=milk;
        this.coffee-=coffee;
        this.chocolate-=chocolate;
        return true;
    }
}
