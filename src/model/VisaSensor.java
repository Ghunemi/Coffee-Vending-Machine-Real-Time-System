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
 * @author Abd El Rahman
 */
public class VisaSensor {
    
    private static  VisaSensor visasensor;

    public VisaSensor() 
    {
        Engine.createStatement("select value from InsertVisa").setSubscriber(new Object() 
        {
                    public void update(int value, boolean condition) throws InterruptedException {
                        Random r=new Random();
                        condition =r.nextBoolean();
                        CurrencyDispenser.getInstance().setValue(value);
                        CurrencyDispenser.getInstance().setCondition(condition);
                    }
        });
    }
    
    public static VisaSensor getInstance()
    {
        if(visasensor!= null)
            return visasensor;
        else
            visasensor = new VisaSensor();
            return visasensor;
    }
}
