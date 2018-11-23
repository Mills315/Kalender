package KalenderMaken;

public class Jaar {

    private static int jaartal;

    public static int getJaartal() {
        return jaartal;
    }

    public void setJaartal(int jaartal) {
        this.jaartal = jaartal;
    }

    public Jaar(int jaartal) {
        this.jaartal = jaartal;

    }

    public boolean getSchrikkeljaar() {
        if ((Jaar.getJaartal() % 4 == 0 && Jaar.getJaartal() % 100 != 0) || (Jaar.getJaartal() % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }
}
