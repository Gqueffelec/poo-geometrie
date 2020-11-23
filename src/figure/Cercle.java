package figure;

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

}
