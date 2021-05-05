package be.bxl.formation.models;

public class Pilote {

    //region Champs
    private String nom;
    private String prenom;
    //endregion

    //region Encapsulation
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomComplet() {
        return getPrenom() + " " + getNom();
    }

    public void setNom(String nom) {
        if(nom == null) {
            throw new IllegalArgumentException("Le nom ne peut être null !!!");
        }
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        if(prenom == null) {
            throw new IllegalArgumentException("Le prenom ne peut être null !!!");
        }
        this.prenom = prenom;
    }
    //endregion

    //region Constructeur
    public Pilote(String prenom, String nom) {
        this.setPrenom(prenom);
        this.setNom(nom);
    }
    //endregion
}
