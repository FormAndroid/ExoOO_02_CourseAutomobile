package be.bxl.formation.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {

    public final int NOMBRE_MAX_PARTICIPANT = 10;

    //region Champs
    private String nom;
    private Circuit circuit;
    private int nombreTour;
    private ArrayList<Participant> participants;
    //endregion


    //region Encapsulation
    public String getNom() {
        return nom;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public int getNombreTour() {
        return nombreTour;
    }

    public List<Participant> getParticipants() {
        return Collections.unmodifiableList(participants);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public void setNombreTour(int nombreTour) {
        this.nombreTour = nombreTour;
    }
    //endregion


    //region Constructure
    public Course(String nom, Circuit circuit, int nombreTour) {
        setNom(nom);
        setCircuit(circuit);
        setNombreTour(nombreTour);

        this.participants = new ArrayList<>();
    }
    //endregion


    //region Méthode
    public void addParticipant(Participant participant) {
        // TODO Verifier si les numeros des participants sont unique
        //      Alternative, la course genere le numero

        this.participants.add(participant);
    }

    public void addParticipant(Pilote pilote, Voiture voiture, int numero){
        Participant p = new Participant(pilote, voiture, numero);
        this.addParticipant(p);
    }

    public void simulation() {
        int tourActuel = 0;

//        System.out.println("Simulation de la cours");
//        System.out.println();
        while(tourActuel < this.nombreTour) {
            tourActuel++;

//            System.out.println();
//            System.out.println(" - Tour " + tourActuel);
            for(Participant p : this.participants) {
                p.faireUnTour(this.circuit);

//                double temps = p.getTempsTour().get(p.getTempsTour().size() - 1);
//                System.out.println(p.getNumero() + " -> " + temps);
            }
        }
    }
    //endregion
}
