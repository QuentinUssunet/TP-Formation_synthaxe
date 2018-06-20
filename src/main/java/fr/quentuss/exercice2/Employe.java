package fr.quentuss.exercice2;


public class Employe {
	private String nom;
	private String prenom;
	private int age;
	private int anneeEmbauche;
	
	public Employe(String nom, String prenom, int age, int anneeEmbauche) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.anneeEmbauche = anneeEmbauche;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAnneeEmbauche() {
		return anneeEmbauche;
	}
	public void setAnneeEmbauche(int anneeEmbauche) {
		this.anneeEmbauche = anneeEmbauche;
	}
	

}
