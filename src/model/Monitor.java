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
public class Monitor {
    
    private static Monitor monitor;
    
    private Monitor()
    {
        display("Hello, choose your drink");
    }
    
    public static Monitor getInstance()
    {
        if(monitor == null)
        {
            monitor = new Monitor();
            return monitor;
        }
        else
        {
           return monitor;
        }
    }
    
    public synchronized void display(String msg)
    {
        StartPage.getStartPageGUI().getScreen().setText(msg);
    }
}
