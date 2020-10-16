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
public class HeaterSensor {

    double temprature;

    public HeaterSensor(double temprature) {
        this.temprature = temprature;
    }

    public double getTemprature() {
        return temprature;
    }

}
