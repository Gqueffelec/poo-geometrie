package figure;

<<<<<<< HEAD
import base.Point;

public class Segment {
	private int color;
	private Point[] coordonnees;

	public Segment(int x1, int y1, int x2, int y2, int color) {
		coordonnees = new Point[2];
		coordonnees[0] = new Point(x1, y1);
		coordonnees[1] = new Point(x2, y2);
		this.color = color;
	}

	public void affiche() {
		System.out.println("Le segment de couleur : " + color + " et constitué de 2 points : ");
		for (Point point : coordonnees) {
			System.out.print("  >" + point.toString() + "\n");
		}
	}
=======
public class Segment {

>>>>>>> 82b686e936ef1b00385a5133f6c9de40668b947e
}
