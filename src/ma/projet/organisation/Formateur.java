package ma.projet.organisation;

import ma.projet.Personne;

public class Formateur  extends Personne{
	protected String matricule;

	public Formateur(String nom, String prenom, String telephone, String email, String matricule) {
		super(nom, prenom, telephone, email);
		this.matricule = matricule;
	}

	public String getMatricule() {
		return matricule;
	}
	
	
}
