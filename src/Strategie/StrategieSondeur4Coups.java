package Strategie;

public class StrategieSondeur4Coups extends StrategieComplexe {

	@Override
	public String getName() {
		return "Sondeur-4-coups";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		int sizeRes = this.getHistoryChoix().size();
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else if (sizeRes == 1) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		}else if (sizeRes == 2) {
			choixActuel = Choix.T;
			this.addHistoryChoix(choixActuel);
		}else if (sizeRes == 3) {
			choixActuel = Choix.T;
			this.addHistoryChoix(choixActuel);
		} else {
			int counter =0;
			for (int i = 0; i < this.getHistoryChoixAdv().size(); i++) {
				if (this.getHistoryChoixAdv().get(i).equals(Choix.T)) {
					counter++;
				}
			}
			if (counter == 3 || counter == 4) {
				choixActuel = Choix.N;
			}else {
				choixActuel = Choix.C;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
