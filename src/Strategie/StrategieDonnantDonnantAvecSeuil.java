package Strategie;

public class StrategieDonnantDonnantAvecSeuil extends StrategieComplexe {

	@Override
	public String getName() {
		return "DonnantDonnantAvecSeuil";
	}
	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else {
			int sizeRes = this.getHistoryChoix().size();
			Choix dernierChoix = this.getHistoryChoix().get(sizeRes - 1);
			choixActuel = dernierChoixAdv;
			if (dernierChoix == Choix.N) {
				choixActuel = Choix.N;
			} else if (sizeRes >= 4 && sizeRes % 5 == 0) {
				int dernierResultat = PointCalculatrice.getPoint(this.getHistoryChoix().get(this.getHistoryChoix().size()-1), dernierChoixAdv);
				double moyenne5Coups = (dernierResultat + this.getHistoryPoint().get(sizeRes - 2) + this.getHistoryPoint().get(sizeRes - 3)
						+ this.getHistoryPoint().get(sizeRes - 4) + this.getHistoryPoint().get(sizeRes - 5)) / 5;
				if (moyenne5Coups < 2) {
					choixActuel = Choix.N;
				}
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
