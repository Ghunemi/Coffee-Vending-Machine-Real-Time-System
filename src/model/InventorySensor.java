/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Engine;
import static java.lang.Thread.sleep;
import view.Page2;

/**
 *
 * @author Abd El Rahman
 */
public class InventorySensor extends Thread{

    private static InventorySensor inventorysensor;
    
    private InventorySensor() 
    {
                Engine.createStatement("select sugar, milk, coffee, water, chocolate, small, medium, large from InventorySensor")
                .setSubscriber(new Object() {
                    public void update(double sugar, double milk, double coffee, double water, double chocolate, int small,int medium,int large) throws InterruptedException {
                        
                        System.out.println("Sugar amount: " + sugar);
                        System.out.println("Milk amount: " + milk);
                        System.out.println("Coffee amount: " + coffee);
                        System.out.println("Chocolate amount: " + chocolate);
                        System.out.println("Water amount: " + water);
                        System.out.println("Small cups amount: " + small);
                        System.out.println("Medium cups amount: " + medium);
                        System.out.println("Large cups amount: " + large);
                        
                        InventoryController.getInsatance().gatherInfo(coffee,sugar,chocolate,milk,small,medium,large);
                        
                        Page2.getInstance().getSugerSlider().setValue((int) sugar);
                        Page2.getInstance().getWaterSlider().setValue((int) water);
                        Page2.getInstance().getLargeSlider().setValue(large);
                        Page2.getInstance().getMediumSlider().setValue(medium);
                        Page2.getInstance().getSmallSlider().setValue(small);
                        Page2.getInstance().getMilkSlider().setValue((int) milk);
                        Page2.getInstance().getChoclateSlider().setValue((int) chocolate);
                        Page2.getInstance().getCoffeeSlider().setValue((int) coffee);
                    
                    }
                });
        this.start();
    }

    public static InventorySensor getInstance()
    {
       if(inventorysensor == null)
        {
            inventorysensor = new InventorySensor();
            return inventorysensor;
        }
        else
        {
           return inventorysensor;
        }
    }
    @Override
    public void run() {
          while (true) 
          {
            try 
            {
                sleep(1200);
            } 
            catch (InterruptedException ex) 
            {
            }
            if (CoffeeVendingMachine.getInstance().getPowered()) 
            {
                double sugarQuantity = Inventory.getInstance().getSugar();
                double milkQuantity = Inventory.getInstance().getMilk();
                double choccolateQuantity = Inventory.getInstance().getChocolate();
                double coffeeQuantity = Inventory.getInstance().getCoffee();
                double waterQuantity = Inventory.getInstance().getWater();
                int smallCupsQuantity = Inventory.getInstance().getSmall();
                int mediumCupsQuantity = Inventory.getInstance().getMedium();
                int largeCupsQuantity = Inventory.getInstance().getLarge();
                
                Engine.sendEvent(new events.InventorySensor(sugarQuantity, milkQuantity, coffeeQuantity, waterQuantity, choccolateQuantity,smallCupsQuantity,mediumCupsQuantity,largeCupsQuantity));
            } 
        } 
    }
}
