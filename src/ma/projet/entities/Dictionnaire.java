package ma.projet.entities;

public class Dictionnaire extends Document {
	protected String langue;

	public Dictionnaire(String titre, String langue) {
		super(titre);
		this.langue = langue;
	}

	public String getLangue() {
		return langue;
	}

	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + ", numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}
}
