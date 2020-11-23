package figure;

import base.Figure;

public class Cercle extends Figure {
	private int rayon;

	public Cercle(int x1, int y1, int color, int rayon) {
		super(x1, y1, color);
		this.rayon = rayon;
	}

	@Override
	public void affiche() {
		System.out.println(
				"Le cercle de couleur : " + this.color + ", de rayon " + this.rayon + " et constitué de 1 points : ");
		System.out.println("  >" + this.coordonnees[0].toString());
	}

}
