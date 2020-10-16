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
public class InventoryController {

    private static InventoryController inventoryController;
    
    private InventoryController() 
        {
        Inventory.getInstance();
        InventorySensor.getInstance();
    }
    
    public static InventoryController getInsatance()
    {
        if(inventoryController == null)
        {
            inventoryController = new InventoryController();
            return inventoryController;
        }
        else
        {
           return inventoryController;
        }
    }
    
    public double waterCapacity(){
        return WaterTank.getInstance().getCapacity();
    }
    
    public void addWater(double water){
        WaterTank.getInstance().setCapacity(water);
    }
    
    private boolean ingredientsAvailability(Coffee drink ,double coffee, double choco,double milk )
    {
        if ( coffee >= drink.getCoffee() && choco >= drink.getChocolate() &&  milk >= drink.getMilk()  )
            return true;
        return false;
    }
        
    public boolean pourIngredients(double coffee,double choco,double milk,double sugar, int size){
        return (WaterTank.getInstance().pourWater(200 + ((size-1)*100))&& Inventory.getInstance().releaseIngredients(sugar, milk, coffee, choco, size));
    }
    
    public void gatherInfo(double coffeeAm,double sugers, double choco,double milk,int smallSize,int mediumSize,int largeSize)
    {
        ArrayList<Coffee> coffeeTypes = Coffee.getCoffeeTypes();
        boolean mocha = false,espresso = false,americano = false, machiatto = false ,cappuccino = false,latte = false,sugar=false,small=false,medium=false,large=false;
        for (Coffee coffee : coffeeTypes)
        {
            switch(coffee.coffeeName)
            {
                    case "mocha":
                        if(ingredientsAvailability(coffee ,coffeeAm,choco,milk))
                        mocha = true;
                    case "espresso":
                        if(ingredientsAvailability(coffee ,coffeeAm,choco,milk))
                        espresso = true;;
                    case "americano":
                        if(ingredientsAvailability(coffee ,coffeeAm,choco,milk))
                        americano = true;
                    case "machiatto":
                        if(ingredientsAvailability(coffee ,coffeeAm,choco,milk))
                        machiatto = true;
                    case "latte":
                        if(ingredientsAvailability(coffee ,coffeeAm,choco,milk))
                        latte = true;
                    case "cappuccino":
                        if(ingredientsAvailability(coffee ,coffeeAm,choco,milk))
                        cappuccino = true;
            }
        }
        if(sugers>=5)
            sugar=true;
        if(smallSize>=1)
            small=true;
        if(mediumSize>=1)
            medium=true;
        if(largeSize>=1)
            large=true;
         
        KeyPad.getInstance().activatePads(mocha, espresso, cappuccino, machiatto, americano, latte,sugar,small,medium,large);
    }
}
