package Prison;

import Strategie.Choix;
import Strategie.Strategie;

public class Rencontre {
	int nbTour;
	private Tour tours[];
	private int pointsTotalJoueur1;
	public Rencontre(Strategie st1, Strategie st2, int nbTour) {
		this.nbTour = nbTour;
		tours = new Tour[nbTour];
		Choix dernierChoixAdv1 = null;;
		Choix dernierChoixAdv2 = null;
		for(int i =0; i< nbTour; i++) {
				Choix c1 = st1.getNextChoix(dernierChoixAdv1);
				Choix c2 = st2.getNextChoix(dernierChoixAdv2);
				try {
					tours[i] = new Tour(c1, c2);
				} catch (Exception e) {
					e.printStackTrace();
				}
				dernierChoixAdv2 = c1;
				dernierChoixAdv1 = c2;
			this.addPointsTotalJoueur1(tours[i].getScoreJoueur1());
		}
	}
	public int getPointsTotalJoueur1() {
		return pointsTotalJoueur1;
	}
	public void addPointsTotalJoueur1(int pointsTotalJoueur1) {
		this.pointsTotalJoueur1 = this.pointsTotalJoueur1 + pointsTotalJoueur1;
	}

}
