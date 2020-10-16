/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import static java.lang.Thread.sleep;
import view.StartPage;

/**
 *
 * @author Abd El Rahman
 */
public class Mixer {

    private static Mixer Mixer = null;

    public Mixer() {
    }
    
    
    public static Mixer getInstance() 
    {
       if(Mixer == null)
        {
            Mixer = new Mixer();
            return Mixer;
        }
        else
        {
           return Mixer;
        }
    }

    public void mix(double sugar, int size, Coffee drink) 
    {
        Monitor.getInstance().display("Your order is being mixed, be patience.");
        try 
        {
            sleep(1000);
        } 
        catch (InterruptedException ex)
        {
            System.out.println("WE ARE AT MIXER ERROR!");
        }
        if(InventoryController.getInsatance().pourIngredients(drink.getCoffee(), drink.getChocolate(), drink.getMilk(), sugar, size)) 
        {
           
        this.pour();
        }
    }

    public void pour() 
    {
        Monitor.getInstance().display("Your order is being prepared, one moment.");
   
        Thread slider = new Thread(){
        @Override
        public void run(){
            for(int i=0;i<=100;i+=5){
                StartPage.getStartPageGUI().getDrink().setValue(i);
                try 
                {
                    sleep(400);
                } 
                catch (InterruptedException ex) 
                {
                    System.out.println("Error");
                }
            }
        }};
        slider.start();
        try 
        {
            slider.join();
        } 
        catch (InterruptedException ex) 
        {
        } 
        Monitor.getInstance().display("Enjoy your drink");
        try 
        {
            sleep(1000);
        } 
        catch (InterruptedException ex) 
        {
            
        }
    }
}
