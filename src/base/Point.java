package base;

public final class Point {
	private int x;
	protected int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point d'abcsisse : " + x + " et d'ordonnées : " + y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
