package Prison;

import java.util.ArrayList;
import java.util.Collections;

import Strategie.Strategie;
import exception.NombreStrategiesException;

public class Tournoi {
	private Strategie[] strategies;
	private int nbNour;
	private Rencontre rens[][];
	private int total[];

	public Tournoi(Strategie[] sts, int nbTour) throws NombreStrategiesException {
		if (sts.length < 2) {
			throw new NombreStrategiesException();
		} else {
			this.strategies = sts;
			this.nbNour = nbTour;
			rens = new Rencontre[sts.length][sts.length];
			total = new int[sts.length];
		}

	}

	public void afficherResultat() {
		int maxLength = 0;
		for (Strategie s : strategies) {
			if (s.getName().length() > maxLength) {
				maxLength = s.getName().length();
			}
		}
		
		String head = String.join("", Collections.nCopies(maxLength, " ")) + "|";
		for (int i = 0; i < strategies.length; i++) {
			head += strategies[i].getName() + String.join("", Collections.nCopies(maxLength - strategies[i].getName().length(), " ")) + "|";
		}
		head += "TOTAL";
		System.out.println(head);
		int max = 0;
		ArrayList<String> gagnantsNames = new ArrayList<String>();
		for (int i = 0; i < strategies.length; i++) {
			String sName = strategies[i].getName();
			System.out.print(sName + String.join("", Collections.nCopies(maxLength - sName.length(), " ")) + "|");
			for (int j = 0; j < strategies.length; j++) {
				int point = rens[i][j].getPointsTotalJoueur1();
				System.out.print(point +String.join("", Collections.nCopies(maxLength - Integer.toString(point).length(), " ")) +  "|");
			}
			System.out.println(total[i]);
			if (total[i] > max) {
				max = total[i];
			}
		}

		for (int i = 0; i < strategies.length; i++) {
			if (total[i] == max) {
				gagnantsNames.add(strategies[i].getName());
			}
		}

		System.out.println("Stratégie gagnante du tournoi :" + gagnantsNames.toString());

	}

	public void organiser() throws InstantiationException, IllegalAccessException {
		for (int i = 0; i < strategies.length; i++) {
			for (int j = 0; j < strategies.length; j++) {
				// une nouvelle rencontre => une nouvelle instance de strategie()
				rens[i][j] = new Rencontre(strategies[i].getClass().newInstance(),
						strategies[j].getClass().newInstance(), nbNour);
				this.addTotal(i, rens[i][j].getPointsTotalJoueur1());
			}
		}
	}

	public int getTotal(int i) {
		return total[i];
	}

	public void addTotal(int i, int point) {
		this.total[i] = this.total[i] + point;
	}
}
