package Strategie;

public class StrategieDonnantDonnantAvecSeuil extends StrategieComplexe {

	@Override
	public String getName() {
		return "DonnantDonnantAvecSeuilLP";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
		} else {
			int sizeRes = this.getHistoryPoint().size();
			choixActuel = dernierChoixAdv;
			System.out.println("sizeRes" + sizeRes);
			if (sizeRes > 4 && sizeRes % 5 == 0) {
				 // System.out.println(this.getHistoryPoint().get(sizeRes - 1));
				int moyenne5Coups = (this.getHistoryPoint().get(sizeRes - 1) + this.getHistoryPoint().get(sizeRes - 2)
						+ this.getHistoryPoint().get(sizeRes - 3) + this.getHistoryPoint().get(sizeRes - 4)
						+ this.getHistoryPoint().get(sizeRes - 5)) / 5;
				System.out.println("sizeRes:" + sizeRes);
				System.out.println("moyenne:"+ moyenne5Coups);
				if (moyenne5Coups < 2) {
					choixActuel = Choix.N;
				}
			} 
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}