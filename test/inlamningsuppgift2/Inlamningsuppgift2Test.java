package inlamningsuppgift2;

import junit.framework.TestCase;
import org.junit.Test;

public class Inlamningsuppgift2Test {

    public Inlamningsuppgift2Test() {
    }

    @Test
    public void testGetDagensDatum() {
        Inlamningsuppgift2 i = new Inlamningsuppgift2();
        TestCase.assertTrue(i.getDagensDatum() > 20181014);
    }

    @Test
    public void getSvar() {
        Inlamningsuppgift2 i = new Inlamningsuppgift2();
        TestCase.assertTrue(i.getSvar(1).equals("Stig på!"));
        TestCase.assertTrue(i.getSvar(2).equals("Ditt medlemskap har gått ut!"));
        TestCase.assertTrue(i.getSvar(3).equals("Du har aldrig tränat hos oss!"));
    }

}
