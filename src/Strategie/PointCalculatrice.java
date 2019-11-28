package Strategie;

public class PointCalculatrice {

	public static int getPoint(Choix s1, Choix s2) {
		if (s1.equals(Choix.C) && s2.equals(Choix.T)) {
			return 0;
		}
		if (s1.equals(Choix.C) && s2.equals(Choix.C)) {
			return 3;
		}
		if (s1.equals(Choix.T) && s2.equals(Choix.T)) {
			return 1;
		}
		if (s1.equals(Choix.T) && s2.equals(Choix.C)) {
			return 5;
		}
		if (s1.equals(Choix.N) || s2.equals(Choix.N)) {
			return 2;
		}
		return 0;

	}
}
