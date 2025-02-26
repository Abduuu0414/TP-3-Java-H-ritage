package ma.projet.entities;

public class Roman extends Livre {
	protected double prix;

	public Roman(String titre, String auteur, int nbrPages, double prix) {
		super(titre, auteur, nbrPages);
		this.prix = prix;
	}


	public double getPrix() {
		return prix;
	}



	@Override
	public String toString() {
		return "Roman [prix=" + prix + ", auteur=" + auteur + ", nbrPages=" + nbrPages + ", numEnreg=" + numEnreg
				+ ", titre=" + titre + "]";
	}
	
	
}
