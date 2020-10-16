/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Engine;
import view.StartPage;

/**
 *
 * @author Abd El Rahman
 */
public class CoffeeVendingMachine {

    private static CoffeeVendingMachine coffeeVendingMachine = null;;
    private boolean power;

    private CoffeeVendingMachine() 
    {
        this.power = true;
        KeyPad.getInstance();
        Monitor.getInstance();
        Heater.getInstance();
        CurrencyDispenser.getInstance();
        InventoryController.getInsatance();
        Order.getInstance();
        Mixer.getInstance();

        Engine.createStatement("select power from PowerSwitch").setSubscriber(new Object() 
        {
            public void update(boolean power) throws InterruptedException 
            {
                System.out.println("Power is ON/OFF ");
                powerSwitch();
                handleSystem();
                }
            });
    }
    
    public void handleSystem() throws InterruptedException{
        if(!power){
            Monitor.getInstance().display("Thank you\nGoodbye");
            Thread goodbye = new Thread(){
            @Override
            public void run()
            {
                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException ex) 
                {
                }
                
                Monitor.getInstance().display(" ");
                disableVendingMachine();  
            }};
           goodbye.start();
           goodbye.stop();
        }
        else
        {
            enableVendingMachine();
            Monitor.getInstance().display("Please select your drink");
        }
    }
    
    public void disableVendingMachine()
    {
        StartPage.getStartPageGUI().getAmericano().setEnabled(false);
        StartPage.getStartPageGUI().getCappuccino().setEnabled(false);
        StartPage.getStartPageGUI().getEspresso().setEnabled(false);
        StartPage.getStartPageGUI().getMocha().setEnabled(false);
        StartPage.getStartPageGUI().getLatte().setEnabled(false);
        StartPage.getStartPageGUI().getMacchiato().setEnabled(false);
        StartPage.getStartPageGUI().getSugar().setEnabled(false);
        StartPage.getStartPageGUI().getSmall().setEnabled(false);
        StartPage.getStartPageGUI().getMedium().setEnabled(false);
        StartPage.getStartPageGUI().getLarge().setEnabled(false);
        StartPage.getStartPageGUI().getStart().setEnabled(false);
        StartPage.getStartPageGUI().getCancel().setEnabled(false);
        StartPage.getStartPageGUI().getInsertMoney().setEnabled(false); 
        
    }
    
    public void enableVendingMachine()
    {
        StartPage.getStartPageGUI().getAmericano().setEnabled(true);
        StartPage.getStartPageGUI().getCappuccino().setEnabled(true);
        StartPage.getStartPageGUI().getEspresso().setEnabled(true);
        StartPage.getStartPageGUI().getMocha().setEnabled(true);
        StartPage.getStartPageGUI().getLatte().setEnabled(true);
        StartPage.getStartPageGUI().getMacchiato().setEnabled(true);
        StartPage.getStartPageGUI().getSugar().setEnabled(true);
        StartPage.getStartPageGUI().getSmall().setEnabled(true);
        StartPage.getStartPageGUI().getMedium().setEnabled(true);
        StartPage.getStartPageGUI().getLarge().setEnabled(true);
        StartPage.getStartPageGUI().getStart().setEnabled(true);
        StartPage.getStartPageGUI().getCancel().setEnabled(true);
        StartPage.getStartPageGUI().getInsertMoney().setEnabled(true);
    }
    
    public boolean getPowered() {
        return power;
    }

    public void powerSwitch() {
        power = !power;
    }
    
    public static CoffeeVendingMachine getInstance() 
    {
       if(coffeeVendingMachine == null)
        {
            coffeeVendingMachine = new CoffeeVendingMachine();
            return coffeeVendingMachine;
        }
        else
        {
           return coffeeVendingMachine;
        }
    }
}
