package Strategie;

public class StrategieDonnantDonnant extends StrategieComplexe {
	@Override
	public String getName() {
		return "Donnant-Donnant";
	}
	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else {
			choixActuel = dernierChoixAdv;
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}
}
