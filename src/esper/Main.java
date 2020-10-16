/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;

import model.CoffeeVendingMachine;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import view.Page2;
import view.StartPage;

/**
 *
 * @author Abd El Rahman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Logger.getRootLogger().setLevel(Level.OFF);
        Engine.registerEvents();
        StartPage.getStartPageGUI();
        Page2.getInstance();
        CoffeeVendingMachine.getInstance();  
    }
}
