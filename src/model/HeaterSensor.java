/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Engine;
import view.Page2;

/**
 *
 * @author Abd El Rahman
 */
public class HeaterSensor extends Thread {
    
    private static HeaterSensor sensor = null;
    
    private HeaterSensor() 
    {
        
        Engine.createStatement("select temprature from HeaterSensor").setSubscriber(new Object() 
        {
            
            public void update(double temp) throws InterruptedException 
            {
                
                Heater.getInstance().threshold(temp);
                Page2.getInstance().setTemp(String.format("%.2f", temp));
            }
        });
        this.start();
    }

    public static HeaterSensor getInstance()
    {
       if(sensor == null)
        {
            sensor = new HeaterSensor();
            return sensor;
        }
        else
        {
           return sensor;
        }
    }
    
    @Override
    public void run() {
        while (true) {
            try 
            {
                sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
            }
            if (CoffeeVendingMachine.getInstance().getPowered()) 
            {
                double temprature = WaterTank.getInstance().getTempreture();
                Engine.sendEvent(new events.HeaterSensor(temprature));
            } 
            else 
            {
                Page2.getInstance().setTemp("Heat Sensor Off");
            }
        }
    }
}
