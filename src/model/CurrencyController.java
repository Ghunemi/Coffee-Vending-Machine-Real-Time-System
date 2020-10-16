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
 * @author 
 */
public class CurrencyController {

    private static CurrencyController currencyController = null;
    
    private CurrencyController() {
    }

    public static CurrencyController getInstance() 
    {
        if(currencyController == null)
        {
            currencyController = new CurrencyController();
            return currencyController;
        }
        else
        {
           return currencyController;
        }
    }

    public void determineCurrencyValue() {
        if ("".equals(StartPage.getStartPageGUI().getMoneyEntered().getText())) 
        {
            System.out.println("Please Enter Money First");
            Monitor.getInstance().display("Please Enter Money First");
        } 
        else 
        {
            Engine.sendEvent(new InsertCurrency(Integer.parseInt(StartPage.getStartPageGUI().getMoneyEntered().getText()), true));
            StartPage.getStartPageGUI().getMoneyEntered().setText("");
        }
    }
}

