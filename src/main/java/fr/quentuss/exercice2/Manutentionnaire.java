package fr.quentuss.exercice2;

public class Manutentionnaire extends Employe{

	private boolean envDangereux;
	private float primeDanger;
	private float tempsTravail;
	private float tauxFixe = 65;
	private float salaire;

	
	
	
	public Manutentionnaire(String nom, String prenom, int age, int anneeEmbauche, float salaire) {
		super(nom, prenom, age, anneeEmbauche);
		this.salaire = salaire;
	}
	public Manutentionnaire(String nom, String prenom, int age, int anneeEmbauche, boolean envDangereux,
			float primeDanger, float tempsTravail, float tauxFixe, float salaire) {
		super(nom, prenom, age, anneeEmbauche);
		this.envDangereux = envDangereux;
		this.primeDanger = primeDanger;
		this.tempsTravail = tempsTravail;
		this.tauxFixe = tauxFixe;
		this.salaire = salaire;
	}
	public boolean isEnvDangereux() {
		return envDangereux;
	}
	public void setEnvDangereux(boolean envDangereux) {
		this.envDangereux = envDangereux;
	}
	public float getPrimeDanger() {
		return primeDanger;
	}
	public void setPrimeDanger(float primeDanger) {
		this.primeDanger = primeDanger;
	}
	public float getTempsTravail() {
		return tempsTravail;
	}
	public void setTempsTravail(float tempsTravail) {
		this.tempsTravail = tempsTravail;
	}
	public float getTauxFixe() {
		return tauxFixe;
	}
	public void setTauxFixe(float tauxFixe) {
		this.tauxFixe = tauxFixe;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
}
