package ma.projet.entities;

public class Livre extends Document {
	protected String auteur;
	protected int nbrPages;
	public Livre(String titre, String auteur, int nbrPages) {
		super(titre);
		this.auteur = auteur;
		this.nbrPages = nbrPages;
	}
	public String getAuteur() {
		return auteur;
	}
	
	public int getNbrPages() {
		return nbrPages;
	}
	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", nbrPages=" + nbrPages + ", numEnreg=" + numEnreg + ", titre=" + titre
				+ "]";
	}
	
	
	
}
