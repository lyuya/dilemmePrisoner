package Prison;

import Strategie.Strategie;
import Strategie.StrategieDonnantDonnant;
import Strategie.StrategieDonnantDonnantAvecSeuil;
import Strategie.StrategieDonnantDonnantDur;
import Strategie.StrategieDur;
import Strategie.StrategieGentille;
import Strategie.StrategieGraineDeChampion;
import Strategie.StrategieMajoriteDur;
import Strategie.StrategieMechante;
import Strategie.StrategieMefiante;
import Strategie.StrategiePeriodiqueGentille;
import Strategie.StrategiePeriodiqueMechante;
import Strategie.StrategieRancuniere;
import Strategie.StrategieSondeur4Coups;
import Strategies.Donnant;
import Strategies.Gentille;
import Strategies.Mechante;
import exception.NombreStrategiesException;

public class Jeu {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NombreStrategiesException{
		Strategie sts[] = new Strategie[2];
		sts[0] = new StrategiePeriodiqueGentille();
		sts[1] = new StrategieGraineDeChampion();
//		sts[1] = new StrategieDonnantDonnantAvecSeuil();
//		sts[1] = new StrategieGentille();
//		sts[2] = new Mechante();
//		sts[3] = new Gentille();
		
		Tournoi t = new Tournoi(sts, 5);
		t.organiser();
		t.afficherResultat();
	}
}
