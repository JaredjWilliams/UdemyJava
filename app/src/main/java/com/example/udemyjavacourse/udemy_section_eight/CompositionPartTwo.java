package com.example.udemyjavacourse.udemy_section_eight;

public class CompositionPartTwo {

    public static void buildComputer() {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theMonitor, theCase, theMotherboard);

        thePC.powerUp();
    }
}
