/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.StartPage;

/**
 *
 * @author Abd El Rahman
 */

public class Order extends Thread {

    private PaymentInterface payment;
    private static Order order = null;
    private double price;
    private Coffee coffee;
    private int size;
    private double sugar;
    private double change;
    private double balance;
    private Boolean status = null;

     private Order() {
        this.start();
    }
    
    public static Order getInstance() {

        if(order == null)
        {
            order = new Order();
            return order;
        }
        else
        {
           return order;
        }
    }

    public void setDrink(Coffee coffee) {
        this.coffee = coffee;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }
    
    public double getOrderPrice(){
        return price;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setPaymentMethod(PaymentInterface p)
    {
        this.payment = p;
    }
    
    public void checkout()
    {
        System.out.println("You will pay with visa");
    }
    
    public void calculatePrice(){
        price = coffee.price + ((size - 1) * 5);
    }

    public void makeOrder() 
    {
        if (coffee == null) 
        {
            Monitor.getInstance().display("Please select drink first");
        } 
        else 
        {
            calculatePrice();
            change = balance - price;
            this.status = false;
        }
    }

    public void cancelOrder() {
        if (status == null) {
            CurrencyDispenser.getInstance().returnCash((int) balance);
            sugar = 0;
            size = 1;
            status = null;
            balance = 0;
            change = 0;
            coffee = null;
            StartPage.getStartPageGUI().getDrink().setValue(0);
        } 
        else 
        {
            System.out.println("Cannot Cancel");
        }
    }

    @Override
    public void run() {
        while (true) 
        {
            if (CoffeeVendingMachine.getInstance().getPowered()) 
            {
                if (status != null) 
                {
                    if (status == false) 
                    {
                        if (change < 0) 
                        {
                            Monitor.getInstance().display("The balance equal "+balance+"\nOrder price "+price+"\nInsufficent balance");
                            status = null;
                        } 
                        else 
                        {
                            status = true;
                        }
                    } 
                    else if (status == true) 
                    {
                        CoffeeVendingMachine.getInstance().disableVendingMachine();
                        Thread t = new Thread() 
                        {
                            public void run() 
                            {
                                Mixer.getInstance().mix(sugar, size, coffee);
                            }
                        };
                        t.start();
                        try 
                        {
                            t.join();
                        } 
                        catch (InterruptedException ex) 
                        {
                            System.out.println("GHUUUUUUUUUUUNEEEEEEEEEEEEMIIIIIIIIIII");
                        }
                        CoffeeVendingMachine.getInstance().enableVendingMachine();
                        CurrencyDispenser.getInstance().returnCash((int) change);
                        sugar = 0;
                        size = 1;
                        status = null;
                        balance = 0;
                        change = 0;
                        coffee = null;
                        //StartPage.getStartPageGUI().getDrink().setValue(0);
                    }
                }
            }
            try 
            {
                this.sleep(1000);
            }
            catch (InterruptedException ex) 
            {
                System.out.println("WE REACHED HERE GHUNEMI2");
            }
        }
    }
}
