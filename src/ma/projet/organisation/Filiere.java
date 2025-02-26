package ma.projet.organisation;

public class Filiere {

	int id;
	String code;
	String libelle;
	
	int comp;

	public Filiere(String code, String libelle) {
		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "La liste des étudiants de la filière " + libelle + " est :";
	}
	
	
	

}
