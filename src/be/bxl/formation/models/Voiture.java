package be.bxl.formation.models;

import java.util.Random;

public class Voiture {

    //region Champs
    private String marque;
    private String modele;
    private int vitesseMin;
    private int vitesseMax;
    //endregion

    //region Encapsulation
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
    //endregion

    //region Constructeur
    public Voiture(String marque, String modele, int vitesseMin, int vitesseMax) {
        if(vitesseMin > vitesseMax)
            throw new IllegalArgumentException("Les vitesses ne sont pas correct !");

        setMarque(marque);
        setModele(modele);
        this.vitesseMin = vitesseMin;
        this.vitesseMax = vitesseMax;
    }
    //endregion

    //region Méthode
    public double calculVitesseMoyenne() {
        Random rng = new Random(); // nextDouble -> Valeur double entre 0 et 1

        double vitesseBrute = vitesseMin + (rng.nextDouble() * (vitesseMax - vitesseMin));
        // Exemple (Min 100, Max 150) => 100 + (0.53451 * 50) => 126.7255

        // Renvois de la vitesse avec 2 chiffres aprés la virgule (cf exemple : 126.73)
        return Math.round(vitesseBrute * 100) / 100.0;
    }
    //endregion
}
