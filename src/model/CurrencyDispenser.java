/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class CurrencyDispenser extends Thread implements PaymentInterface{
    private double balance;
    private double value;
    private Boolean condition;
    private static CurrencyDispenser currencyController;
    
    private CurrencyDispenser()  {
        this.start();
        balance=0;
        condition = null;
        CurrencySensor.getInstance();
    }
    
    public static CurrencyDispenser getInstance()  
    {
        if(currencyController == null)
        {
            currencyController = new CurrencyDispenser();
            return currencyController;
        }
        else
        {
           return currencyController;
        }
    }

    public void setValue(double value)   {
        this.value = value;
    }

    public void setCondition(boolean condition)  {
        this.condition = condition;
    }

    public double getBalance()  {
        return balance;
    }

    public void setBalance(double balance)  {
        this.balance = balance;
    }
       
     public void authenticateCurrency() throws InterruptedException  
    {
        if(condition != null)
        {
            if(condition)
            { 
                acceptMoney();
            }
            else
            {
                 rejectMoney();
            }
        }
    }
     
    public void acceptMoney() {
        if(value%5==0 && value<=20 && value>0){
            
            balance += value;
            value = 0;
            condition = null;
            Order.getInstance().setBalance(balance);
            pay();
        }
        else
        {
            condition = null;
            Monitor.getInstance().display("The balance equal "+balance+"\nRejected Money Value");
        }
    }
    
    
    public void rejectMoney()  {
        condition = null;
        Monitor.getInstance().display("The balance equal "+balance+"\nBad Money Condition");     
    }
    
    public void returnCash(int m)  {
        try 
        {
            balance = 0;
            Monitor.getInstance().display("Balance : "+balance+"\nMoney returned : "+m);
            Thread.sleep(2000);
            Monitor.getInstance().display("Hello! Please select your drink :)");
        } 
        catch (InterruptedException ex) 
        {
        } 
    }
    
   
    
    @Override
    public void run()  {
     while(true){
         try {
             authenticateCurrency();
         } catch (InterruptedException ex) {
             Logger.getLogger(CurrencyDispenser.class.getName()).log(Level.SEVERE, null, ex);
         }
            try 
            {
                this.sleep(500);
                
            } catch (InterruptedException ex) {

            }
        }
    }   

    @Override
    public void pay()  {
        Monitor.getInstance().display("The balance equal "+balance+"\nYou payed in CASH!");
    }
}
