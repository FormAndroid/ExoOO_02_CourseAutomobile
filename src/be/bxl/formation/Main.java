package be.bxl.formation;

import be.bxl.formation.models.*;

public class Main {

    public static void main(String[] args) {

        Circuit spa = new Circuit("Spa", 7.04);

        // Participant -> Zaza
        Pilote pilote1 = new Pilote("Zaza", "Vanderquack");
        Voiture voiture1 = new Voiture("Bugatti", "Veyron", 120, 200);
        Participant p1 = new Participant(pilote1, voiture1, 42);

        // Participant -> Fifi
        Pilote pilote2 = new Pilote("Fifi", "Duck");
        Voiture voiture2 = new Voiture("VW", "Polo", 90, 140);
        Participant p2 = new Participant(pilote2, voiture2, 2);

        // Course
        Course c1 = new Course("Demo !", spa, 5);
        c1.addParticipant(p1);
        c1.addParticipant(p2);

        // Participant -> Balthazar
        Pilote pilote3 = new Pilote("Balthazar", "Picsou");
        Voiture voiture3 = new Voiture("VW", "Coccinelle", 75, 130);
        c1.addParticipant(pilote3, voiture3, 1337);

        // Start de la course
        c1.simulation();

        // Affichage du resultat
        // c1.obtenirVainqueur
    }
}
