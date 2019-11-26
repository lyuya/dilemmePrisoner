package Strategie;

public class StrategieRancuniere extends StrategieComplexe {

	@Override
	public String getName() {
		return "Rancunière";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else {
			if (this.getHistoryChoixAdv().contains(Choix.T) || dernierChoixAdv == Choix.T) {
				choixActuel = Choix.T;
			} else {
				choixActuel = Choix.C;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
