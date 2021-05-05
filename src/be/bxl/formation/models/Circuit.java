package be.bxl.formation.models;

public class Circuit {

    //region Champs
    private String nom;
    private double kilometrage;
    //endregion

    //region Encapsulation
    public double getKilometrage() {
        return kilometrage;
    }

    public String getNom() {
        return nom;
    }

    public void setKilometrage(double kilometrage) {
        if(kilometrage < 0)
            throw new IllegalArgumentException("Le kilometrage doit etre supperieur à zero :o");

        this.kilometrage = kilometrage;
    }

    public void setNom(String nom) {
        if(nom == null) {
            throw new IllegalArgumentException("Le nom d'un circuit ne peut être null !!!");
        }
        this.nom = nom;
    }
    //endregion

    //region Constructeur
    public Circuit(String nom, double kilometrage) {
        setNom(nom);
        setKilometrage(kilometrage);
    }
    //endregion
}
