package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert Power.powerFinder(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert Power.powerFinder(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert Power.powerFinder(2, 2) == 4;
    }

    @Test
    public void threeRaisedToThreeIsNine() {
        assert Power.powerFinder(3, 2) == 9;
    }
}
