package com.example.udemyjavacourse.section_eight;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_eight.composition_challenge.CoffeeMaker;
import com.example.udemyjavacourse.udemy_section_eight.composition_challenge.DishWasher;
import com.example.udemyjavacourse.udemy_section_eight.composition_challenge.Refrigerator;
import com.example.udemyjavacourse.udemy_section_eight.composition_challenge.SmartKitchen;

import org.junit.Test;

public class SmartKitchenTests {

    @Test
    public void testSmartKitchenFunctions() {

        SmartKitchen smartKitchen = new SmartKitchen();
        smartKitchen.setKitchenState(true, false, true);


        assertEquals("Brewing Coffee", smartKitchen.brewMaster.brewCoffee());
        assertEquals("No work to be done", smartKitchen.iceBox.orderFood());
        assertEquals("Doing dishes", smartKitchen.dishWasher.doDishes());
    }
}
