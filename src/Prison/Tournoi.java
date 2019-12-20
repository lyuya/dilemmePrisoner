package Prison;

import java.util.ArrayList;
import java.util.Collections;
import Strategie.Strategie;
import exception.NombreStrategiesException;
import observer.Observer;

public class Tournoi implements Observer {
	private ArrayList<Strategie> strategies;
	private int nbNour;
	private Rencontre rens[][];
	private int total[];
	private int index1;
	private int index2;

	public Tournoi(ArrayList<Strategie> sts, int nbTour) throws NombreStrategiesException {
		if (sts.size() < 2) {
			throw new NombreStrategiesException();
		} else {
			this.strategies = sts;
			this.nbNour = nbTour;
			rens = new Rencontre[sts.size()][sts.size()];
			total = new int[sts.size()];
		}

	}

	public void afficherResultat() {
		System.out.println("/***************************************************/");
		System.out.println("RESULTAT DU TOURNOI");
		System.out.println("/***************************************************/");
		int maxLength = 0;
		for (Strategie s : strategies) {
			if (s.getName().length() > maxLength) {
				maxLength = s.getName().length();
			}
		}

		String head = String.join("", Collections.nCopies(maxLength, " ")) + "|";
		for (int i = 0; i < strategies.size(); i++) {
			head += strategies.get(i).getName()
					+ String.join("", Collections.nCopies(maxLength - strategies.get(i).getName().length(), " ")) + "|";
		}
		head += "TOTAL";
		System.out.println(head);
		int max = 0;
		ArrayList<String> gagnantsNames = new ArrayList<String>();
		for (int i = 0; i < strategies.size(); i++) {
			String sName = strategies.get(i).getName();
			System.out.print(sName + String.join("", Collections.nCopies(maxLength - sName.length(), " ")) + "|");
			for (int j = 0; j < strategies.size(); j++) {
				int point = rens[i][j].getPointsTotalJoueur1();
				System.out.print(
						point + String.join("", Collections.nCopies(maxLength - Integer.toString(point).length(), " "))
								+ "|");
			}
			System.out.println(total[i]);
			if (total[i] > max) {
				max = total[i];
			}
		}

		for (int i = 0; i < strategies.size(); i++) {
			if (total[i] == max) {
				gagnantsNames.add(strategies.get(i).getName());
			}
		}

		System.out.println("Stratégie gagnante du tournoi :" + gagnantsNames.toString());

	}

	public void organiser() throws InstantiationException, IllegalAccessException {
		for (int i = 0; i < strategies.size(); i++) {
			for (int j = 0; j < strategies.size(); j++) {
				// une nouvelle rencontre => une nouvelle instance de strategie()
				rens[i][j] = new Rencontre(strategies.get(i).getClass().newInstance(),
						strategies.get(j).getClass().newInstance(), nbNour);
				this.setIndex1(i);
				this.setIndex2(j);
				rens[i][j].subscribe(this);
				rens[i][j].jouer();
				rens[i][j].unsubscribe(this);
			}
		}
	}

	public int getTotal(int i) {
		return total[i];
	}

	public void addTotal(int i, int point) {
		this.total[i] = this.total[i] + point;
	}

	@Override
	public void update() {
		this.addTotal(index1, rens[index1][index2].getPointsTotalJoueur1());
	}

	public int getIndex1() {
		return index1;
	}

	public void setIndex1(int index1) {
		this.index1 = index1;
	}

	public int getIndex2() {
		return index2;
	}

	public void setIndex2(int index2) {
		this.index2 = index2;
	}
}
