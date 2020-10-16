/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Engine;
import java.util.Random;

/**
 *
 * @author Abdelrahman
 */
public class CurrencySensor {
    private static  CurrencySensor currencySensor;
    
    public static CurrencySensor getInstance()
    {
        if(currencySensor!= null)
            return currencySensor;
        else
            currencySensor = new CurrencySensor();
            return currencySensor;
    }

    private CurrencySensor() 
    {
        Engine.createStatement("select value, condition from InsertCurrency").setSubscriber(new Object() 
        {
                    public void update(int value, boolean condition) throws InterruptedException {
                        Random r = new Random();
                        condition =r.nextBoolean();
                        CurrencyDispenser.getInstance().setValue(value);
                        CurrencyDispenser.getInstance().setCondition(condition);
                    }
        });
    }
}
