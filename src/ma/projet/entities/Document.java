package ma.projet.entities;

public class Document {
	protected int numEnreg;
	protected String titre;
	private static int comp;

	public Document(String titre) {
		this.numEnreg = ++comp;
		this.titre = titre;
		
	}

	public int getNumEnreg() {
		return numEnreg;
	}


	public String getTitre() {
		return titre;
	}

	

	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}

}
