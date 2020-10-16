/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esper;

import events.CancelEvent;
import events.SelectSize;
import events.StartOrder;
import events.SelectCoffee;
import events.InventorySensor;
import events.InsertCurrency;
import events.SelectSugar;
import events.PowerSwitch;
import events.HeaterSensor;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

/**
 *
 * @author Abd El Rahman
 */
public class Engine {

    private static EPServiceProvider engine = EPServiceProviderManager.getDefaultProvider();

    public static void registerEvents() {
        engine.getEPAdministrator().getConfiguration().addEventType(HeaterSensor.class);
        engine.getEPAdministrator().getConfiguration().addEventType(PowerSwitch.class);
        engine.getEPAdministrator().getConfiguration().addEventType(InsertCurrency.class);
        engine.getEPAdministrator().getConfiguration().addEventType(InventorySensor.class);
        engine.getEPAdministrator().getConfiguration().addEventType(SelectCoffee.class);
        engine.getEPAdministrator().getConfiguration().addEventType(SelectSize.class);
        engine.getEPAdministrator().getConfiguration().addEventType(SelectSugar.class);
        engine.getEPAdministrator().getConfiguration().addEventType(StartOrder.class);
        engine.getEPAdministrator().getConfiguration().addEventType(CancelEvent.class);
    }

    public static EPStatement createStatement(String s) {
        EPStatement result = engine.getEPAdministrator().createEPL(s);
        System.out.println("EPL Statement Successfully Created.");
        return result;
    }

    public static void sendEvent(Object o) {
        engine.getEPRuntime().sendEvent(o);
    }
}
