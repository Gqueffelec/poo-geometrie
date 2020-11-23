package main;

import figure.Cercle;
import figure.Quadrilatere;
import figure.Segment;
import figure.Triangle;

public class Exec {
	public static void main(String[] args) {
		Segment s1 = new Segment(0, 1, 2, 1, 52);
		s1.affiche();
		Triangle t1 = new Triangle(3, 6, 4, 1, 0, 4, 50);
		t1.affiche();
		Quadrilatere q1 = new Quadrilatere(0, 1, 2, 3, 3, 5, 6, -1, 33);
		q1.affiche();
		Cercle c1 = new Cercle(3, 4, 52, 5);
		c1.affiche();
	}
}
