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
			int sizeRes = this.getHistoryPoint().size();
			Choix dernierChoix = this.getHistoryChoix().get(sizeRes);
			if (dernierChoix == Choix.N) {
				choixActuel = Choix.N;
			}
			else if (dernierChoixAdv.equals(Choix.T)) {
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
