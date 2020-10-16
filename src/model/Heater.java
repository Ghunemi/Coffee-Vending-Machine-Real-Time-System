/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import view.Page2;

/**
 *
 * @author Abd El Rahman
 */
public class Heater extends Thread {
    
    private static Heater heat = new Heater();
    private boolean heating;

    private Heater() 
    {
        Page2.getInstance().setStatus("Heating");
        heating = true;
        WaterTank.getInstance();
        HeaterSensor.getInstance();
       
        this.start();
    }

    public void threshold(double temp) throws InterruptedException 
    {
        if (temp <= 35) {
            heating = true;
        } else if (temp > 68) {
            heating = false;
        }
    }

    public static Heater getInstance() {
        return heat;
    }

    @Override
    public void run() {
        while (true) 
        {
            if (!CoffeeVendingMachine.getInstance().getPowered())
            {
                heating = false;
                WaterTank.getInstance().cooling();
                Page2.getInstance().setStatus("Heater turned off");
            } 
            else 
            {
                if (heating) 
                {
                    WaterTank.getInstance().heatUp();
                    Page2.getInstance().setStatus("HEATING");
                } 
                else if (!heating) 
                {
                    WaterTank.getInstance().cooling();
                    Page2.getInstance().setStatus("COOLING");
                }
            }
            try 
            {
                this.sleep(1000);
            } 
            catch (InterruptedException ex)
            {
            }
        }
    } 
}
