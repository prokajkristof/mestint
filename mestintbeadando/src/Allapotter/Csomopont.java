package Allapotter;

import java.util.Objects;

public class Csomopont {
    private Allapot allapot;
    private Csomopont szulo;
    private int koltseg;
    private int operatorIndex;

    public Csomopont(Allapot allapot, int operatorIndex) {
        this.allapot = allapot;
        this.operatorIndex = operatorIndex;
    }

    public Csomopont(Allapot allapot, Csomopont szulo) {
        this.allapot = allapot;
        this.szulo = szulo;

        if (szulo == null)
            koltseg = 0;
        else
            this.koltseg = this.szulo.getKoltseg() + 1;
    }

    public int getKoltseg() {
        return koltseg;
    }

    public void setKoltseg(int koltseg) {
        this.koltseg = koltseg;
    }

    public int getOperatorIndex() {
        return operatorIndex;
    }

    public void setOperatorIndex(int operatorIndex) {
        this.operatorIndex = operatorIndex;
    }

    public Allapot getAllapot() {
        return allapot;
    }

    public void setAllapot(Allapot allapot) {
        this.allapot = allapot;
    }

    public Csomopont getSzulo() {
        return szulo;
    }

    public void setSzulo(Csomopont szulo) {
        this.szulo = szulo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Csomopont masik = (Csomopont) obj;
        return Objects.equals(allapot, masik.allapot);
    }
}