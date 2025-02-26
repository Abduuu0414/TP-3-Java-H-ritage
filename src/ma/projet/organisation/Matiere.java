package ma.projet.organisation;

public class Matiere {
	protected int id;
	protected String code;
	protected String libelle;
	protected Formateur formateur;

	public Matiere(int id, String code, String libelle, Formateur formateur) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.formateur = formateur;
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

	public Formateur getFormateur() {
		return formateur;
	}

}
