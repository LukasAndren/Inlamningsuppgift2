package inlamningsuppgift2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class BestGymEver {

    private final List<Kund> kunder;

    BestGymEver() throws FileNotFoundException {
        kunder = new ArrayList<>();

        BufferedReader in = new BufferedReader(new FileReader("customers.txt"));
        Scanner sc = new Scanner(in);

        String tempRad;

        while (sc.hasNextLine()) {
            Kund tempKund = new Kund();
            tempRad = sc.nextLine();
            tempKund.setPersonnummer(tempRad.substring(0, 10));
            tempKund.setNamn(tempRad.substring(12).trim());

            tempRad = sc.nextLine();
            tempKund.setSenastBetaldÅrsavgift(Integer.parseInt(tempRad.substring(0, 10).replace("-", "")));
            kunder.add(tempKund);
        }

    }

    public List<Kund> getKunder() {
        return kunder;
    }

    public Kund getEnKund(String input) {

        for (Kund kund : kunder) {
            if (kund.getNamn().toLowerCase().equals(input.toLowerCase())
                    || kund.getPersonnummer().equals(input)) {
                return kund;
            }
        }
        return kunder.get(-1);
    }
}
