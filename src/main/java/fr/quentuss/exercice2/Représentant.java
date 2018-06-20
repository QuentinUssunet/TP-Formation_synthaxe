package fr.quentuss.exercice2;

public class Représentant extends Employe{

	private float ca;
	private float multiplInteret = 0.2F;
	private float salaire;
	private float primeFixe = 800;
	
	
	public float calculSalaire() {		
		salaire=primeFixe+(multiplInteret*ca);
		return salaire;		
	}
	
	public Représentant(String nom, String prenom, int age, int anneeEmbauche, float salaire) {
		super(nom, prenom, age, anneeEmbauche);
		this.salaire = salaire;
	}
	public Représentant(String nom, String prenom, int age, int anneeEmbauche, float ca, float multiplInteret,
			float salaire, float primeFixe) {
		super(nom, prenom, age, anneeEmbauche);
		this.ca = ca;
		this.multiplInteret = multiplInteret;
		this.salaire = salaire;
		this.primeFixe = primeFixe;
	}
	public float getCa() {
		return ca;
	}
	public void setCa(float ca) {
		this.ca = ca;
	}
	public float getMultiplInteret() {
		return multiplInteret;
	}
	public void setMultiplInteret(float multiplInteret) {
		this.multiplInteret = multiplInteret;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public float getPrimeFixe() {
		return primeFixe;
	}
	public void setPrimeFixe(float primeFixe) {
		this.primeFixe = primeFixe;
	}
	
	
}
