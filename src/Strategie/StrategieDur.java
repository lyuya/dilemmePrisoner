package Strategie;

public class StrategieDur extends StrategieComplexe {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Dur";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else {
			if (dernierChoixAdv.equals(Choix.T)) {
				choixActuel = Choix.N;
			} else if (dernierChoixAdv.equals(Choix.C)) {
				choixActuel = Choix.T;
			} else {
				choixActuel = Choix.C;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
