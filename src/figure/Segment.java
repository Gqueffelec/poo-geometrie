package figure;

import base.Point;

public class Segment {
	private int color;
	private Point[] coordonnees;

	public Segment(int x1, int y1, int x2, int y2, int color) {
		coordonnees[0] = new Point(x1, y1);
		coordonnees[1] = new Point(x2, y2);
		this.color = color;
	}

}
