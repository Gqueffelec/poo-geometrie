package base;

import action.Translation;
import figure.Quadrilatere;
import figure.Segment;
import figure.Triangle;

public abstract class Figure implements Translation {
	protected Point[] coordonnees;
	protected int color;

	public Figure(int x1, int y1, int x2, int y2, int color) {
		coordonnees = new Point[2];
		coordonnees[0] = new Point(x1, y1);
		coordonnees[1] = new Point(x2, y2);
		this.color = color;
	}

	public Figure(int x1, int y1, int x2, int y2, int x3, int y3, int color) {
		coordonnees = new Point[3];
		coordonnees[0] = new Point(x1, y1);
		coordonnees[1] = new Point(x2, y2);
		coordonnees[2] = new Point(x3, y3);
		this.color = color;
	}

	public Figure(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int color) {
		coordonnees = new Point[4];
		coordonnees[0] = new Point(x1, y1);
		coordonnees[1] = new Point(x2, y2);
		coordonnees[2] = new Point(x3, y3);
		coordonnees[3] = new Point(x4, y4);
		this.color = color;
	}

	public Figure(int x1, int y1, int color) {
		coordonnees = new Point[1];
		coordonnees[0] = new Point(x1, y1);
		this.color = color;
	}

	public void affiche() {
		String forme = "";
		if (this instanceof Segment) {
			forme = "Le segment";
		} else if (this instanceof Triangle) {
			forme = "Le triangle";
		} else if (this instanceof Quadrilatere) {
			forme = "Le quadrilatère";
		}
		System.out.println(
				forme + " de couleur : " + this.color + " et constitué de " + this.coordonnees.length + "points : ");
		for (Point point : this.coordonnees) {
			System.out.print("  >" + point.toString() + "\n");
		}
	}

	@Override
	public void translation(int x, int y) {
		for (Point point : coordonnees) {
			int newX = point.getX() + x;
			int newY = point.getY() + y;
			System.out.println("Translation du point : ");
			System.out.println("ancienne abscisse " + point.getX() + " nouvelle abscisse " + newX);
			System.out.println("ancienne ordonnées " + point.getY() + " nouvelle ordonnées " + newY);
			point = new Point(newX, newY);
		}
	}
}
