import Allapotter.Allapot;
import Keresok.Kereso;
import Keresok.Melysegi;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("2.1. Feladat\nJussunk el a MOUSE szóból a TIGER szóhoz, olyan módon, hogy minden egyes lépésben egyetlen betűt cserélünk ki a szóban, és minden csere értelmes angol szót eredményezzen! A megoldáshoz adott az 5 betűs értelmes angol szavakat felsoroló szövegállomány. 1(Soronként 1 szó, összesen kb. 5500 darab.)");
        kiir(new Melysegi());
    }

    public static void kiir(Kereso kereso) {
        for (Allapot allapot : kereso.getUt()) {
            for (int i = 0; i < 5; i++) {
                System.out.print(allapot.getKarakterek()[i]);
            }
            System.out.println();
        }
        System.out.println("Lépések száma: " + kereso.getUt().size());
    }
}