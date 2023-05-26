package Allapotter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Allapot {
    public static String path = "C:\\Users\\kisco\\OneDrive\\Desktop\\mestint\\mestintbeadando\\wordset.txt";
    public String[] szavak;
    public static String kezdoszo = "mouse";
    public static String vegszo = "tiger";
    private char[] karakterek = new char[5];

    public char[] getKarakterek() {
        return karakterek;
    }
    public void setKarakterek(char[] karakterek) {
        this.karakterek = karakterek;
    }
    public Allapot() throws IOException {
        szavak = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        for (int i = 0; i < kezdoszo.length(); i++) {
            karakterek[i] = kezdoszo.charAt(i);
        }
    }

    public boolean celfeltel() {
        for (int i = 0; i < vegszo.length(); i++) {
            if (!(karakterek[i] == vegszo.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Allapot masikAllapot = (Allapot) obj;
        for (int i = 0; i < 5; i++) {
            if (karakterek[i] != masikAllapot.karakterek[i]) {
                return false;
            }
        }
        return true;
    }
}
