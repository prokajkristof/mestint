package Keresok;

import Allapotter.Allapot;
import Allapotter.Operator;

import java.util.ArrayList;
import java.util.List;

public abstract class Kereso {
    private List<Allapot> ut = new ArrayList<>();
    private List<Operator> operatorok = new ArrayList<>();

    public String angolabc = "abcdefghijklmnopqrstuvwxyz";

    public List<Allapot> getUt() {
        return ut;
    }

    public void setUt(List<Allapot> ut) {
        this.ut = ut;
    }

    public List<Operator> getOperatorok() {
        return operatorok;
    }

    public void setOperatorok(List<Operator> operatorok) {
        this.operatorok = operatorok;
    }

    public Kereso() {
        operatorfeltoltes();
    }

    private void operatorfeltoltes() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < angolabc.length(); j++) {
                operatorok.add(new Operator(i, angolabc.charAt(j)));
            }
        }
    }

    public abstract void Kereses();
}