package ma.projet.test;

import ma.projet.organisation.Etudiant;
import ma.projet.organisation.Filiere;

public class TestFiliere1 {
	public static void main(String[] args) {
        Filiere[] filieres = new Filiere[3];
        filieres[0] = new Filiere("IALL", "IALL");
        filieres[1] = new Filiere("IRT", "IRT");
        filieres[2] = new Filiere("IIR", "IIR");

        Etudiant[] etudiants = new Etudiant[3];
        etudiants[0] = new Etudiant("safi", "amal", "06.95.84.65.84", "safiamal@gmail.com", "G135684975", filieres[0]);
        etudiants[1] = new Etudiant("alami", "samir", "06.45.16.75.44", "alamisamir@gmail.com", "G894756853", filieres[0]);
        etudiants[2] = new Etudiant("bouanani", "abderrahman", "06.95.94.16.64", "bouananiabderrahman@gmail.com", "G135386566", filieres[1]);

            System.out.println("La liste des étudiants de la filière " + filieres[1].getLibelle() + " est :");
            int i = 1;
            for (Etudiant e : etudiants) {
                if (e.getFiliere().getLibelle().equals("IRT")) {
                    System.out.println(i + ". " + e.toString());
                    i++;
                }
            }
	}
}
