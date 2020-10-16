/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Engine;
import events.InsertCurrency;
import view.StartPage;

/**
 *
 * @author Abd El Rahman
 */
public class VisaController {
    
     private static VisaController visaController = null;
     
    private VisaController() {
    }

    public static VisaController getInstance() 
    {
        if(visaController == null)
        {
            visaController = new VisaController();
            return visaController;
        }
        else
        {
           return visaController;
        }
    }
    
      public void determineCurrencyValue() {
        if ("".equals(StartPage.getStartPageGUI().getMoneyEntered().getText())) 
        {
            System.out.println("Please Enter creditcard 4 numbers First");
            Monitor.getInstance().display("Please Enter creditcard 4 numbers First");
        } 
        else 
        {
            Engine.sendEvent(new InsertCurrency(Integer.parseInt(StartPage.getStartPageGUI().getMoneyEntered().getText()), true));
            StartPage.getStartPageGUI().getMoneyEntered().setText("");
        }
    }
    
}
