package figure;

import action.Rotation;
import base.Figure;
import base.Point;

public class Quadrilatere extends Figure implements Rotation {

	public Quadrilatere(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int color) {
		super(x1, y1, x2, y2, x3, y3, x4, y4, color);
	}

	@Override
	public void rotation() {
		// calcul bidon juste pour l'héritage
		for (Point point : coordonnees) {
			point = new Point(point.getX() * 2, point.getY() * 2);
		}
	}

}
