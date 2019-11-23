package Strategie;

public class StrategiePeriodiqueMechante extends StrategieComplexe {

	@Override
	public String getName() {
		return "Périodique-Méchante";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		int sizeRes = this.getHistoryChoix().size();
		if (dernierChoixAdv == null) {
			choixActuel = Choix.T;
			this.addHistoryChoix(choixActuel);
		}else {
			if (sizeRes % 3 == 2) {
			choixActuel = Choix.C;
			} else {
				choixActuel = Choix.T;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
			
	}
}
