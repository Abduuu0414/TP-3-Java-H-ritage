package ma.projet.organisation;

public class Etudiant extends Personne {

	protected String cne;
	protected Filiere filiere;
	

	public Etudiant(String nom, String prenom, String telephone, String email, String cne, Filiere filiere) {
		super(nom, prenom, telephone, email);
		this.cne = cne;
		this.filiere = filiere;
	}

	

	public String getCne() {
		return cne;
	}



	public void setCne(String cne) {
		this.cne = cne;
	}



	public Filiere getFiliere() {
		return filiere;
	}



	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}



	@Override
	public String toString() {
		return cne + " " + nom.toUpperCase() + " " + prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
	}

}
