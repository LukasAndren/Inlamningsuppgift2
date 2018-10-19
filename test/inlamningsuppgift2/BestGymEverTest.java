package inlamningsuppgift2;

import java.io.FileNotFoundException;
import junit.framework.TestCase;
import org.junit.Test;

public class BestGymEverTest {
    
    public BestGymEverTest() {
    }

    @Test
    public void testGetKunder() throws FileNotFoundException {
        BestGymEver gym = new BestGymEver();
        TestCase.assertTrue(gym.getKunder().get(0).getNamn().equals("Alhambra Aromes"));
        TestCase.assertTrue(gym.getKunder().get(4).getNamn().equals("Elmer Ekorrsson"));
    }

    @Test
    public void testGetEnKund() throws FileNotFoundException {
        BestGymEver gym = new BestGymEver();
        TestCase.assertTrue(gym.getEnKund("Alhambra Aromes").getNamn().equals("Alhambra Aromes"));
    }
    
}
