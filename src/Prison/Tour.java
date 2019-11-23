package Prison;

import Strategie.Choix;
import Strategie.PointCalculatrice;
import exception.EnumChoixNullException;

public class Tour {

	private int scoreJoueur1;
	public Tour(Choix c1, Choix c2) throws EnumChoixNullException{
		this.setScoreJoueur1(PointCalculatrice.getPoint(c1, c2));
	}
	
	public int getScoreJoueur1() {
		return scoreJoueur1;
	}
	public void setScoreJoueur1(int score1) {
		this.scoreJoueur1 = score1;
	}

}
