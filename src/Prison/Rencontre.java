package Prison;

import java.util.ArrayList;

import Strategie.Choix;
import Strategie.Strategie;
import observer.Observable;
import observer.Observer;

public class Rencontre implements Observable {
	int nbTour;
	private Tour tours[];
	private int pointsTotalJoueur1;
	private Strategie st1;
	private Strategie st2;
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public Rencontre(Strategie st1, Strategie st2, int nbTour) {
		this.nbTour = nbTour;
		tours = new Tour[nbTour];
		this.st1 = st1;
		this.st2 = st2;

	}

	public void jouer() {
		Choix dernierChoixAdv1 = null;
		Choix dernierChoixAdv2 = null;
		for (int i = 0; i < nbTour; i++) {
			Choix c1 = this.st1.getNextChoix(dernierChoixAdv1);
			Choix c2 = this.st2.getNextChoix(dernierChoixAdv2);
			try {
				tours[i] = new Tour(c1, c2);
			} catch (Exception e) {
				e.printStackTrace();
			}
			dernierChoixAdv2 = c1;
			dernierChoixAdv1 = c2;
			this.addPointsTotalJoueur1(tours[i].getScoreJoueur1());
		}
		// informer le tournoi a update le point total de joueur dans ce tournoi
		this.notifyObservers();
	}

	public int getPointsTotalJoueur1() {
		return pointsTotalJoueur1;
	}

	public void addPointsTotalJoueur1(int pointsTotalJoueur1) {
		this.pointsTotalJoueur1 = this.pointsTotalJoueur1 + pointsTotalJoueur1;
	}

	@Override
	public void subscribe(Observer o) {
		observers.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach((o) -> o.update());
	}

}
