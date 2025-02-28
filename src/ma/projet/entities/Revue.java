package ma.projet.entities;

public class Revue extends Document {
	protected String mois;
	protected int annee;
	public Revue(String titre, String mois, int annee) {
		super(titre);
		this.mois = mois;
		this.annee = annee;
	}
	public String getMois() {
		return mois;
	}
	public int getAnnee() {
		return annee;
	}
	@Override
	public String toString() {
		return "Revue [mois=" + mois + ", annee=" + annee + ", numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}
	
	
}
