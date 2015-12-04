package fr.uvsq.coo.ex4_1;

import java.util.List;

public class Groupe implements Element {

	private String type;
	private String nom;
	private List<Element> membres;

	public Groupe(String type, String nom, List<Element> membres) {
		this.type = type;
		this.nom = nom;
		this.membres = membres;
	}

	public void ajouterMembre(Element membre) {
		this.membres.add(membre);
	}

	public void afficher() {

	}

}
