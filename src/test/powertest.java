package test;

import main.java.powerpackage.powerFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class powertest {
    @Test
    public void oneRaisedToPowerOneIsOne() {
        powerFinder calculator = new powerFinder();
        assertEquals(1, calculator.toThePowerOf(1,1));
    }

    @Test
    public void twoRaisedToPowerOneIsTwo() {
        powerFinder calculator = new powerFinder();
        assertEquals(2, calculator.toThePowerOf(2,1));
    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {
        powerFinder calculator = new powerFinder();
        assertEquals(4, calculator.toThePowerOf(2,2));
    }

    @Test
    public void twoRaisedToPowerThreeIsEight() {
        powerFinder calculator = new powerFinder();
        assertEquals(8, calculator.toThePowerOf(2,3));
    }

    @Test
    public void threeRaisedToPowerThreeIsTwentySeven() {
        powerFinder calculator = new powerFinder();
        assertEquals(27, calculator.toThePowerOf(3,3));
    }
}
