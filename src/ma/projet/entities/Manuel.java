package ma.projet.entities;

public class Manuel extends Livre {
	protected String niveau;

	public Manuel(String titre, String auteur, int nbrPages, String niveau) {
		super(titre, auteur, nbrPages);
		this.niveau = niveau;
	}

	
	
	public String getNiveau() {
		return niveau;
	}



	@Override
	public String toString() {
		return "Manuel [niveau=" + niveau + ", auteur=" + auteur + ", nbrPages=" + nbrPages + ", numEnreg=" + numEnreg
				+ ", titre=" + titre + "]";
	}
	
	
}
