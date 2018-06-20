package fr.quentuss.exercice2;

public class Producteur extends Employe{

	private boolean envDangereux;
	private float primeDanger;
	private int unitProd;
	private float tauxFixe = 5;
	private float salaire;
	
	
	
	public float calculSalaire() {		
		if (envDangereux=true) {
			salaire=(tauxFixe*unitProd)+primeDanger;
		} else {
			salaire=tauxFixe*unitProd;
		}
		return salaire;		
	}
	
	public Producteur(String nom, String prenom, int age, int anneeEmbauche, float salaire) {
		super(nom, prenom, age, anneeEmbauche);
		this.salaire = salaire;
	}
	public Producteur(String nom, String prenom, int age, int anneeEmbauche, boolean envDangereux, float primeDanger,
			int unitProd, float tauxFixe, float salaire) {
		super(nom, prenom, age, anneeEmbauche);
		this.envDangereux = envDangereux;
		this.primeDanger = primeDanger;
		this.unitProd = unitProd;
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
	public int getUnitProd() {
		return unitProd;
	}
	public void setUnitProd(int unitProd) {
		this.unitProd = unitProd;
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
