package be.bxl.formation.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Participant {

    //region Champs
    private Pilote pilote;
    private Voiture voiture;
    private int numero;
    private ArrayList<Double> tempsTour;
    //endregion


    //region Encapsulation
    public Pilote getPilote() {
        return pilote;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Double> getTempsTour() {
        // TODO Cleanup this ;)
        return new ArrayList<>(tempsTour);
    }

    public double getTempsTotal() {
        double tempsTotal = 0;
        for(double temps : tempsTour) {
            tempsTotal += temps;
        }
        return tempsTotal;
    }
    //endregion


    //region Constructeur
    public Participant(Pilote pilote, Voiture voiture, int numero) {
        this.pilote = pilote;
        this.voiture = voiture;
        this.numero = numero;

        this.tempsTour = new ArrayList<>();
    }
    //endregion


    //region Méthode
    public void faireUnTour(Circuit circuit) {
        double vitMoy = this.voiture.calculVitesseMoyenne();

        double temps = (circuit.getKilometrage() / vitMoy) * 3600;
        this.tempsTour.add(temps);
    }
    //endregion
}
