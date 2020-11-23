package figure;

import base.Point;

public class Quadrilatere {
	private int color;
	private Point[] coordonnees;

	public Quadrilatere(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int color) {
		coordonnees[0] = new Point(x1, y1);
		coordonnees[1] = new Point(x2, y2);
		coordonnees[2] = new Point(x3, y3);
		coordonnees[3] = new Point(x4, y4);
		this.color = color;
	}

	public void affiche() {
		System.out.println("Le triangle de couleur : " + color + " et constitué de 4 points : ");
		for (Point point : coordonnees) {
			System.out.print("  >" + point.toString() + "\n");
		}
	}
}
