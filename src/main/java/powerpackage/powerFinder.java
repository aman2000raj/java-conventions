package powerpackage;

public class powerFinder {
    public long toThePowerOf(int number, int power) {
        if(power == 0) return 1;

        return number * toThePowerOf(number, power - 1);
    }
}
