package Keresok;

import Allapotter.Allapot;
import Allapotter.Csomopont;
import Allapotter.Operator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Melysegi extends Kereso {
    public Melysegi() {
        Kereses();
    }

    @Override
    public void Kereses() {
        Stack<Csomopont> nyiltcsucsok = new Stack<>();
        List<Csomopont> zartcsucsok = new ArrayList<>();

        try {
            nyiltcsucsok.push(new Csomopont(new Allapot(), null));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (!nyiltcsucsok.isEmpty() && !nyiltcsucsok.peek().getAllapot().celfeltel()) {
            Csomopont aktualcsomopont = nyiltcsucsok.pop();
            for (Operator _operator : getOperatorok()) {
                if (_operator.eloFeltetel(aktualcsomopont.getAllapot())) {
                    Allapot ujallapot = null;
                    try {
                        ujallapot = _operator.atir(aktualcsomopont.getAllapot());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Csomopont ujcsomopont = new Csomopont(ujallapot, aktualcsomopont);

                    if (!nyiltcsucsok.contains(ujcsomopont) && !zartcsucsok.contains(ujcsomopont))
                        nyiltcsucsok.push(ujcsomopont);
                }
            }
            zartcsucsok.add(aktualcsomopont);
        }

        if (!nyiltcsucsok.isEmpty()) {
            Csomopont celcsomopont = nyiltcsucsok.peek();

            while (celcsomopont != null) {
                getUt().add(celcsomopont.getAllapot());
                celcsomopont = celcsomopont.getSzulo();
            }
            java.util.Collections.reverse(getUt());
        }
    }
}
