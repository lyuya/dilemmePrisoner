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
		ArrayList<Choix> historyAdv = new ArrayList<Choix>();
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else {
			if (historyAdv.size() > 1 && historyAdv.get(historyAdv.size()-1) == Choix.T) {
				choixActuel = Choix.T;
			} else if ( historyAdv.size() > 2 && historyAdv.get(historyAdv.size()-2) == Choix.T ) {
				choixActuel = Choix.T;
			} else {
				choixActuel = Choix.C;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
