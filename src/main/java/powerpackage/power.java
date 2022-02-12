package powerpackage;

public class Power {
    public static int powerFinder(int base, int exponent) {
        int output = 1;
        for (int i = 0; i<exponent; i++) {
            output *= base;
        }
        return output;
    }
}
