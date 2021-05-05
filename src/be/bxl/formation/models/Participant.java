package be.bxl.formation.models;

import java.util.*;

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

    public List<Double> getTempsTour() {
        // Renvois une liste en lecture seul
        return Collections.unmodifiableList(tempsTour);
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
