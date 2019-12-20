package factory;

import Strategie.Strategie;
import Strategie.StrategieDonnantDonnant;
import Strategie.StrategieDonnantDonnantAvecSeuil;
import Strategie.StrategieDonnantDonnantDur;
import Strategie.StrategieDur;
import Strategie.StrategieGentille;
import Strategie.StrategieMajoriteDur;
import Strategie.StrategieMajoriteMou;
import Strategie.StrategieMechante;
import Strategie.StrategieMefiante;
import Strategie.StrategiePeriodiqueGentille;
import Strategie.StrategiePeriodiqueMechante;
import Strategie.StrategieRancuniere;

public class StrategieFactory {
	public Strategie getStrategie(String strategieName) {
		switch (strategieName) {
		case "GENTILLE":
			return new StrategieGentille();
		case "MECHANTE":
			return new StrategieMechante();
		case "DONNANT":
			return new StrategieDonnantDonnant();
		case "DONNANTDUR":
			return new StrategieDonnantDonnantDur();
		case "DONNANTSEUIL":
			return new StrategieDonnantDonnantAvecSeuil();
		case "DUR":
			return new StrategieDur();
		case "MAJODUR":
			return new StrategieMajoriteDur();
		case "MAJOMOU":
			return new StrategieMajoriteMou();
		case "MEFIANTE":
			return new StrategieMefiante();
		case "RANCUNIERE":
			return new StrategieRancuniere();
		case "PERIOGENTILLE":
			return new StrategiePeriodiqueGentille();
		case "PERIOMECHANTE":
			return new StrategiePeriodiqueMechante();
		default:
			return null;
		}
	}
}
