package inlamningsuppgift2;

import java.io.FileNotFoundException;
import junit.framework.TestCase;
import org.junit.Test;

public class KundTest {

    public KundTest() {
    }

    @Test
    public void testGetNamn() throws FileNotFoundException {
        BestGymEver gym = new BestGymEver();
        Kund kund = new Kund("199710301234", "Erik Andersson", 123455234);
        TestCase.assertTrue(kund.getNamn().equals("Erik Andersson"));
        TestCase.assertTrue(gym.getKunder().get(0).getNamn().equals("Alhambra Aromes"));
    }

}
