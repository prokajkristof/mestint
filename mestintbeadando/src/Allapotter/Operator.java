package Allapotter;

import java.io.IOException;
import java.util.Arrays;

public class Operator {
    private int mit;
    private char mire;

    public int getMit() {
        return mit;
    }

    public void setMit(int mit) {
        this.mit = mit;
    }

    public char getMire() {
        return mire;
    }

    public void setMire(char mire) {
        this.mire = mire;
    }

    public Operator(int mit, char mire) {
        this.mit = mit;
        this.mire = mire;
    }

    public Allapot atir(Allapot allapot) throws IOException {
        Allapot ujallapot = new Allapot();

        for (int i = 0; i < 5; i++) {
            ujallapot.getKarakterek()[i] = allapot.getKarakterek()[i];
        }
        ujallapot.getKarakterek()[mit] = mire;
        return ujallapot;
    }

    public boolean eloFeltetel(Allapot allapot) {
        if (allapot.getKarakterek()[mit] == mire) {
            return false;
        }
        char voltAllapot = allapot.getKarakterek()[mit];
        allapot.getKarakterek()[mit] = mire;
        boolean contains = Arrays.asList(allapot.szavak).contains(new String(allapot.getKarakterek()));
        allapot.getKarakterek()[mit] = voltAllapot;
        return contains;
    }
}
