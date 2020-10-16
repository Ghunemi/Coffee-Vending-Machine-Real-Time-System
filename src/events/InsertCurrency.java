/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

/**
 *
 * @author Abd El Rahman
 */
public class InsertCurrency {
    private int value;
    private boolean condition;

    public InsertCurrency(int value, boolean condition) {
        this.value = value;
        this.condition = condition;
    }

    public int getValue() {
        return value;
    }

    public boolean getCondition() {
        return condition;
    }
    
    
}
