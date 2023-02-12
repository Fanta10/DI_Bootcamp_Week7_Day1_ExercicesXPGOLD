package exercice1;

public class Shape {
	protected int hauteur = 5;
	protected int largeur = 5;
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shape(int hauteur, int largeur) {
		super();
		this.hauteur = hauteur;
		this.largeur = largeur;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	public double calculAire() {
		double aire = this.hauteur * this.largeur;
		return aire;
		
	}

}
