package fr.uvsq.coo.ex4_2;

//import heritagePolymorphisme.Document;

import java.util.Date;
import java.util.List;

public class Personnel implements Element {

	private final String nomPersonnel;
	private final String prenomPersonnel;
	private final Date dateNaissance;
	private final List<NumeroTelephone> numerosTelephone;
	private final String poste;

	public static class Builder {
		private final String nomPersonnel;
		private final String prenomPersonnel;
		private final Date dateNaissance;
		private final List<NumeroTelephone> numerosTelephone;

		private String poste = "Agent";

		public Builder(String nomPersonnel, String prenomPersonnel,
				Date dateNaissance, List<NumeroTelephone> numerosTelephone) {
			this.nomPersonnel = nomPersonnel;
			this.prenomPersonnel = prenomPersonnel;
			this.dateNaissance = dateNaissance;
			this.numerosTelephone = numerosTelephone;
		}

		public Builder setPoste(String poste) {
			this.poste = poste;
			return this;
		}

		public Personnel build() {
			return new Personnel(this);
		}
	}

	private Personnel(Builder builder) {
		this.nomPersonnel = builder.nomPersonnel;
		this.prenomPersonnel = builder.prenomPersonnel;
		this.dateNaissance = builder.dateNaissance;
		this.numerosTelephone = builder.numerosTelephone;
		this.poste = builder.poste;
	}

	public void insertPersonnel(String filename) {
		/*
		 * try (ObjectOutputStream out = new ObjectOutputStream( new
		 * BufferedOutputStream(new FileOutputStream(filename)))) {
		 * out.writeObject(this.nomPersonnel); out.writeChars("|");
		 * out.writeObject(this.prenomPersonnel); out.writeChars("|");
		 * out.writeObject(this.dateNaissance); out.writeChars("|"); for
		 * (NumeroTelephone numeroTelephone : numerosTelephone) {
		 * out.writeObject(numeroTelephone + ","); } out.writeChars("\n");
		 * out.close(); } catch (Exception e) {
		 * 
		 * }
		 */
	}

	public void afficher() {
		// TODO Auto-generated method stub

	}

}
