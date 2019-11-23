package Strategie;

public class StrategiePeriodiqueGentille extends StrategieComplexe {

	@Override
	public String getName() {
		return "Périodique-Gentille";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		int sizeRes = this.getHistoryChoix().size();
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		}else {
			if (sizeRes % 3 == 2) {
			choixActuel = Choix.T;
			} else {
				choixActuel = Choix.C;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
