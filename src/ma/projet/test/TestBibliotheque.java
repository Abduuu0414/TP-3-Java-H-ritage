package ma.projet.test;

import java.util.Scanner;

import ma.projet.entities.Bibliotheque;
import ma.projet.entities.Document;
import ma.projet.entities.Livre;
import ma.projet.entities.Roman;

public class TestBibliotheque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Bibliotheque bibliotheque = new Bibliotheque(5);

        
        bibliotheque.ajouter(new Livre("Java pour les nuls", "John Doe", 350));
        bibliotheque.ajouter(new Roman("Les Miserables", "Victor Hugo", 1200, 25.99));

        
        while (true) {
            System.out.println("\n \t Menu Bibliothèque");
            System.out.println("1. Afficher les documents");
            System.out.println("2. Ajouter un document");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Afficher les auteurs");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();  

            switch (choix) {
                case 1:
                    bibliotheque.afficherDocuments();
                    break;

                case 2:
                    System.out.print("Titre du livre : ");
                    String titre = scanner.nextLine();
                    System.out.print("Auteur : ");
                    String auteur = scanner.nextLine();
                    System.out.print("Nombre de pages : ");
                    int nbPages = scanner.nextInt();
                    bibliotheque.ajouter(new Livre(titre, auteur, nbPages));
                    break;

                case 3:
                    System.out.print("Numero d'enregistrement du document a supprimer : ");
                    int num = scanner.nextInt();
                    Document doc = bibliotheque.document(num);
                    if (doc != null) {
                        bibliotheque.supprimer(doc);
                        System.out.println("Document supprime.");
                    } else {
                        System.out.println("Document introuvable.");
                    }
                    break;

                case 4:
                    bibliotheque.afficherAuteurs();
                    break;

                case 5:
                    System.out.println("Fermeture du programme.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}