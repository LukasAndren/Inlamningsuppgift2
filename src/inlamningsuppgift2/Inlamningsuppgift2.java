package inlamningsuppgift2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Inlamningsuppgift2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BestGymEver gym = new BestGymEver();

        String input = JOptionPane.showInputDialog("Skriv namn eller personnummer:");

        try {
            Kund tempKund = new Kund();

            tempKund = gym.getEnKund(input);
            if (tempKund.getSenastBetaldÅrsavgift() + 10000 > getDagensDatum()) {
                JOptionPane.showMessageDialog(null, getSvar(1));
                loggaTräning(tempKund);
            } else {
                JOptionPane.showMessageDialog(null, getSvar(2));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, getSvar(3));
        }
    }

    public static int getDagensDatum() {
        String datum = Calendar.getInstance().getTime().toString();

        datum = datum.substring(4, datum.length());

        String år = datum.substring(datum.length() - 4, datum.length());
        String dag = datum.substring(4, 6);
        String månad = datum.substring(0, 3);
        månad = månad.toLowerCase();

        switch (månad) {
            case "jan":
                månad = "01";
                break;
            case "feb":
                månad = "02";
                break;
            case "mar":
                månad = "03";
                break;
            case "apr":
                månad = "04";
                break;
            case "maj":
                månad = "05";
                break;
            case "jun":
                månad = "06";
                break;
            case "jul":
                månad = "07";
                break;
            case "aug":
                månad = "08";
                break;
            case "sep":
                månad = "09";
                break;
            case "oct":
                månad = "10";
                break;
            case "nov":
                månad = "11";
                break;
            case "dec":
                månad = "12";
                break;
        }
        datum = år + månad + dag;

        return Integer.parseInt(datum);

    }

    public static void loggaTräning(Kund k) throws IOException {
        PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter("träningsLog.txt", true)));
        ut.println(k.getNamn() + " (" + k.getPersonnummer() + ") tränade " + getDagensDatum());
        ut.close();

    }

    public static String getSvar(int i) {
        if (i == 1) {
            return "Stig på!";
        } else if (i == 2) {
            return "Ditt medlemskap har gått ut!";
        } else {
            return "Du har aldrig tränat hos oss!";
        }

    }
}
