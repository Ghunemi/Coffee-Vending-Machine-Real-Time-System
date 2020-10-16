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
public class WaterTank {

    private static  WaterTank tank;
    private double capacity;
    private double temperature;
    
    private WaterTank() 
    {
        this.temperature = 0.0;
        this.capacity = 100.0;
    }
    
    public static WaterTank getInstance()
    {
        if(tank == null)
        {
            tank = new WaterTank();
            return tank;
        }
        else
        {
           return tank;
        }
    }
    
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double quantity) {
        this.capacity = quantity;
    }
    
    public double getTempreture() {
        return temperature;
    }

    void heatUp() {
        temperature = temperature + 5.3;
    }

    public void cooling() 
    {
        temperature = temperature - 3.5;
        if (temperature > 0)
        {
            temperature = temperature -  3.5;
        }
        else
        {
            temperature = 0;
        }
    }
    
    public boolean pourWater(double w){
        this.capacity = this.capacity - w;
        return true;
    }
}
