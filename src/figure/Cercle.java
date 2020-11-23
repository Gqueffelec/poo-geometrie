package figure;

<<<<<<< HEAD
import base.Point;

public class Cercle {
	private int color;
	private Point coordonnees;
	private int rayon;

	public Cercle(int x1, int y1, int color, int rayon) {
		coordonnees = new Point(x1, y1);
		this.color = color;
		this.rayon = rayon;
	}

	public void affiche() {
		System.out.println("Le cercle de couleur : " + color + ", de rayon " + rayon + " et constitué de 1 points : ");
		System.out.println("  >" + coordonnees.toString());
	}
=======
public class Cercle {

>>>>>>> 82b686e936ef1b00385a5133f6c9de40668b947e
}
