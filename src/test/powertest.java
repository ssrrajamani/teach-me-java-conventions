package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void one_raised_to_one_is_1() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_2() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void power_of_2_and_3_is_9) {
        assert powerfinder.OF(3, 2) == 9;
    }
}
