/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import esper.Engine;
import java.awt.Color;
import view.StartPage;


/**
 *
 * @author Abd El Rahman
 */
public class KeyPad{

    private static KeyPad keypad;
    private Boolean americanoButton = false;
    private Boolean espressoButton = false;
    private Boolean cappuccinoButton = false;
    private Boolean mochaButton = false;
    private Boolean latteButton = false; 
    private Boolean machiattoButton = false;
    private Boolean sugar = false;
    private Boolean small = false;
    private Boolean medium = false;
    private Boolean large = false;
 

    public KeyPad() {
        
        Engine.createStatement("select coffee from SelectCoffee")
                .setSubscriber(new Object() {
                    public void update(Coffee d) throws InterruptedException {
                       
                        
                        Order.getInstance().setDrink(d);
                        Order.getInstance().calculatePrice();
                        Monitor.getInstance().display("The balance equal "+Order.getInstance().getBalance()+"\nOrder Price "+ Order.getInstance().getOrderPrice());
                    }
                });

        Engine.createStatement("select sugar from SelectSugar")
                .setSubscriber(new Object() {
                    public void update(int sugar) throws InterruptedException {
                        Order.getInstance().setSugar(sugar);
                    }
                });

        Engine.createStatement("select size from SelectSize")
                .setSubscriber(new Object() {
                    public void update(int size) throws InterruptedException {
                        
                        Order.getInstance().setSize(size);
                        Order.getInstance().calculatePrice();
                        Monitor.getInstance().display("The balance equal "+Order.getInstance().getBalance()+"\nOrder Price "+ Order.getInstance().getOrderPrice());
                    }
                });

        Engine.createStatement("select startt from StartOrder")
                .setSubscriber(new Object() {
                    public void update(Boolean startOrder) throws InterruptedException {
                       
                        Order.getInstance().makeOrder();
                    }
                });
        Engine.createStatement("select cancel from CancelEvent")
                .setSubscriber(new Object() {
                    public void update(Boolean cancel) throws InterruptedException {
                       
                        Order.getInstance().cancelOrder();
                    }
                });
    }
    
    public static KeyPad getInstance() 
    {
        if(keypad == null)
        {
            keypad = new KeyPad();
            return keypad;
        }
        else
        {
           return keypad;
        }
    }

    public void activatePads(Boolean m, Boolean e, Boolean a,Boolean ma, Boolean c, Boolean l, Boolean s,Boolean sm, Boolean me, Boolean la) 
    {
        this.cappuccinoButton = c;
        this.espressoButton = e;
        this.latteButton = l;
        this.machiattoButton = ma;
        this.mochaButton = m;
        this.americanoButton = a;
        this.medium = me;
        this.large = la;
        this.small = sm;
        this.sugar = s;
        
        StartPage.getStartPageGUI().getAmericano().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getCappuccino().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getEspresso().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getLatte().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getMacchiato().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getMocha().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getSmall().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getMedium().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getLarge().setBackground(Color.LIGHT_GRAY);
        StartPage.getStartPageGUI().getStart().setBackground(Color.yellow);
        StartPage.getStartPageGUI().getCancel().setBackground(Color.yellow);
        
    }
}
