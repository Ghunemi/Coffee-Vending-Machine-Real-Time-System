/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import model.Coffee;

/**
 *
 * @author Abd El Rahman
 */
public class SelectCoffee {
    Coffee coffee;

    public SelectCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }
    
    
}
