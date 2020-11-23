package main;

import java.util.ArrayList;
import java.util.List;

import action.Rotation;
import base.Figure;
import figure.Cercle;
import figure.Quadrilatere;
import figure.Segment;
import figure.Triangle;

public class Exec {
	public static void main(String[] args) {
		List<Figure> listeFigure = new ArrayList<Figure>();
		Segment s1 = new Segment(0, 1, 2, 1, 52);
		Triangle t1 = new Triangle(3, 6, 4, 1, 0, 4, 50);
		Quadrilatere q1 = new Quadrilatere(0, 1, 2, 3, 3, 5, 6, -1, 33);
		Cercle c1 = new Cercle(3, 4, 52, 5);
		listeFigure.add(c1);
		listeFigure.add(t1);
		listeFigure.add(s1);
		listeFigure.add(q1);
		for (Figure figure : listeFigure) {
			figure.affiche();
			figure.translation(2, 3);
			System.out.println();
			if (figure instanceof Rotation) {
				((Rotation) figure).rotation();
			}
			System.out.println();
			figure.affiche();
		}
	}
}
