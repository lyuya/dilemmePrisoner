package Prison;

import Strategie.Strategie;
import Strategie.StrategieDonnantDonnant;
import Strategie.StrategieDonnantDonnantAvecSeuil;
import Strategie.StrategieDonnantDonnantDur;
import Strategie.StrategieDur;
import Strategie.StrategieGentille;
import Strategie.StrategieMajoriteDur;
import Strategie.StrategieMechante;
import Strategie.StrategieMefiante;
import Strategie.StrategiePeriodiqueGentille;
import Strategie.StrategiePeriodiqueMechante;
import Strategie.StrategieRancuniere;
import Strategies.Donnant;
import Strategies.DonnantDur;
import Strategies.DonnantSeuil;
import Strategies.Gentille;
import Strategies.Mechante;
import exception.NombreStrategiesException;

public class Jeu {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NombreStrategiesException{
		Strategie sts[] = new Strategie[10];
		sts[0] = new StrategieGentille();
		sts[1] = new StrategieMechante();
		sts[2] = new StrategieDonnantDonnant();
		sts[3] = new StrategieDonnantDonnantDur();
		sts[4] = new StrategieDonnantDonnantAvecSeuil();
		sts[5] = new Gentille();
		sts[6] = new Mechante();
		sts[7] = new Donnant();
		sts[8] = new DonnantDur();
		sts[9] = new DonnantSeuil();
		
		Tournoi t = new Tournoi(sts, 20);
		t.organiser();
		t.afficherResultat();
	}
}
