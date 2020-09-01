package media;

/**
 *
 * @author Bogi
 */
public class Radio {
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
    public Radio() {
        
    }

    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }

    public double getFmFrequency() {
        return fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {
        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }
    
    public void info() {
        System.out.println("FM: " + getFmFrequency());
        System.out.println("AM: " + getAmFrequency());
        System.out.println("Band: " + getBand());
    }
    
    public void printAttributes() {
            System.out.println("FM frekvencija je: " + fmFrequency);
            System.out.println("AM frekvencija je: " + amFrequency);
            System.out.println("Band je: " + band);
    
       }
     
}