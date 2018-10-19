package inlamningsuppgift2;

public class Kund {

    protected String personnummer;
    protected String namn;
    protected long senastBetaldÅrsavgift;

    Kund() {
    }

    Kund(String pnummer, String namn, long avgift) {
        this.personnummer = pnummer;
        this.namn = namn;
        this.senastBetaldÅrsavgift = avgift;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public long getSenastBetaldÅrsavgift() {
        return senastBetaldÅrsavgift;
    }

    public void setSenastBetaldÅrsavgift(long senastBetaldÅrsavgift) {
        this.senastBetaldÅrsavgift = senastBetaldÅrsavgift;
    }

}
