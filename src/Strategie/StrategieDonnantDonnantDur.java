package Strategie;

import java.util.ArrayList;

public class StrategieDonnantDonnantDur extends StrategieComplexe{

	@Override
	public String getName() {
		return "DonnantDonnantDur";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		ArrayList<Choix> historyAdv = this.getHistoryChoixAdv();
		if (dernierChoixAdv == null) {
			// premier tour
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else {
			if (historyAdv.size() > 0 && historyAdv.get(historyAdv.size()-1) == Choix.T) {
				// adv trahis dans le tour actuel -1
				choixActuel = Choix.T;
			} else if ( historyAdv.size() > 1 && historyAdv.get(historyAdv.size()-2) == Choix.T ) {
				// adv trahis dans le tour actuel -2
				choixActuel = Choix.T;
			} else {
				choixActuel = Choix.C;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
