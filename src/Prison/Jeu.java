package Prison;

import java.util.ArrayList;
import java.util.Scanner;
import Strategie.Strategie;
import Strategie.StrategieType;
import exception.NombreStrategiesException;
import factory.StrategieFactory;

public class Jeu {
	int nbTours;
	ArrayList<Strategie> strategies = new ArrayList<Strategie>();

	public ArrayList<Strategie> getStrategies() {
		return strategies;
	}
	
	public void resetStrategies() {
		this.strategies.clear();
		if (this.strategies.size() == 0) {
			System.out.println("Les stratégies sont vidés");
		}
		
	}
	
	public void addStrategies(Strategie strategie) {
		this.strategies.add(strategie);
	}

	public void commencerTournoi() {
		Tournoi t;
		if (strategies.size() < 2) {
			System.out.println("Veuillez choisir au moins 2 strategies ! ");
		} else {
			try {
				t = new Tournoi(strategies, nbTours);
				t.organiser();
				t.afficherResultat();
			} catch (InstantiationException | IllegalAccessException | NombreStrategiesException e) {
				e.printStackTrace();
			}
		}

	}

	public void definirNbTour() {
		System.out.println("Veuillez saisir le nombre de tour");
		Scanner input = new Scanner(System.in);
		setNbTours(input.nextInt());
	}

	public int getNbTours() {
		return nbTours;
	}

	public void setNbTours(int nbTours) {
		this.nbTours = nbTours;
	}

	public void choisirStrategie() {
		int selection = -1;
		System.out.println("/***************************************************/");
		System.out.println("Veuillez choisir une strategie");
		System.out.println("/***************************************************/");
		StrategieFactory sf = new StrategieFactory();
		do {
			afficherMenu();
			Scanner input = new Scanner(System.in);
			selection = input.nextInt();
			String strategieType = "";
			switch (selection) {
			case 1:
				strategieType = StrategieType.GENTILLE.name();
				break;

			case 2:
				strategieType = StrategieType.MECHANTE.name();
				break;

			case 3:
				strategieType = StrategieType.DONNANT.name();
				break;

			case 4:
				strategieType = StrategieType.DONNANTDUR.name();
				break;

			case 5:
				strategieType = StrategieType.DONNANTSEUIL.name();
				break;
			case 6:
				strategieType = StrategieType.DUR.name();
				break;
			case 7:
				strategieType = StrategieType.MEFIANTE.name();
				break;
			case 8:
				strategieType = StrategieType.RANCUNIERE.name();
				break;
			case 9:
				strategieType = StrategieType.PERIOGENTILLE.name();
				break;
			case 10:
				strategieType = StrategieType.PERIOMECHANTE.name();
				break;
			case 11:
				strategieType = StrategieType.MAJODUR.name();
				break;
			case 12:
				strategieType = StrategieType.MAJOMOU.name();
				break;
			default:
				break;
			}
			if (selection > 0 && selection < 13) {
				strategies.add(sf.getStrategie(strategieType));
				System.out.println("Vous avez choisi" + strategies.get(strategies.size() - 1).getName() + "!");
			} else if (selection != 0) {
				System.out.println("Vous avez rien choisi!");
			}
		} while (selection != 0);
	}

	public void afficherMenu() {
		System.out.println("/***************************************************/");
		System.out.println("Choisir une strategie pour jouer");
		System.out.println("-------------------------\n");
		System.out.println("0 - Finir de choisir");
		System.out.println("1 - Gentille");
		System.out.println("2 - Mechante");
		System.out.println("3 - Donnant-donnant");
		System.out.println("4 - Donnant-donnant dur");
		System.out.println("5 - Donnant-donnant avec seuil");
		System.out.println("/***************************************************/");
	}

	public void terminer() {
		System.exit(0);
	}
}
