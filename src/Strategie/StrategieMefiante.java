package Strategie;

public class StrategieMefiante extends StrategieComplexe {

	@Override
	public String getName() {
		return "Méfiante";
	}
	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		if (dernierChoixAdv == null) {
			choixActuel = Choix.T;
			this.addHistoryChoix(choixActuel);
		} else {
			choixActuel = dernierChoixAdv;
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}
}
