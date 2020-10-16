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
 * @author Abd El Rahman
 */
public class VisaDetector extends Thread implements PaymentInterface{
    
        private static VisaDetector visaDetector = null;
        private double balance;
        private double value;
        
        private VisaDetector(){
            
            this.start();
            try {
                this.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(VisaDetector.class.getName()).log(Level.SEVERE, null, ex);
            }
            balance=0;
            VisaDetector.getInstance();
    }
        
   public static VisaDetector getInstance()
    {
        if(visaDetector == null)
        {
            visaDetector = new VisaDetector();
            return visaDetector;
        }
        else
        {
           return visaDetector;
        }
    }
   
   public void setValue(double value) {
        this.value = value;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
       
    public void acceptMoney()  {

                balance = 50;
                value = 0;
                Order.getInstance().setBalance(balance);
                pay();
    }
    

    @Override
    public void pay()   {
        Monitor.getInstance().display("The balance equal "+balance+"\nYou payed with VISA");
    }
    
    @Override
    public void run() {
        while(true){
            try {
                acceptMoney();
                
                this.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(VisaDetector.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
