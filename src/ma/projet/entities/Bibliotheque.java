package ma.projet.entities;

import java.util.Arrays;

public class Bibliotheque {
	protected int capacite;
	Document[] documents;
	int nombreDoc;

	public Bibliotheque(int capacite) {
		this.capacite = capacite;
		this.documents = new Document [capacite];
		this.nombreDoc = 0;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	public void afficherDocuments () {
		for(Document d : documents) {
			System.out.println(d);
		}
	}
	
	public boolean ajouter (Document doc) {
		if(capacite <= nombreDoc) {
			return false;
		}
		documents[nombreDoc++] = doc;
		return true;
	}
	
	public boolean supprimer (Document doc) {
		for(int i = 0; i < nombreDoc; i++) {
			if(documents[i].getNumEnreg() == doc.getNumEnreg()) {
				for(int j = 0; j < nombreDoc; j++) {
					documents[j] = documents[j + 1];
				}
				documents[--nombreDoc] = null;
				return true;
			}
		}
		return false;
	}
	
	public Document document(int numEnrg) {
		for(Document d : documents) {
			if(d.getNumEnreg() == numEnrg) {
				return d;
			}
		}
		return null;
	}
	
	public void afficherAuteurs() {
		System.out.println("e la liste des auteurs :");
		for(Document d : documents) {
			if(d instanceof Livre) {
				System.out.println(d.toString());
			}
		}
	}
	

	@Override
	public String toString() {
		return "Bibliotheque [capacite=" + capacite + ", documents=" + Arrays.toString(documents) + "]";
	}

}
