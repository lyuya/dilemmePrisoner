package Strategie;

public class StrategieMajoriteDur extends StrategieComplexe {

	@Override
	public String getName() {
		return "Majorité-Dur";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		if (dernierChoixAdv == null) {
			choixActuel = Choix.T;
			this.addHistoryChoix(choixActuel);
		} else {
			int countC = 0;
			int countT = 0;
			int countN = 0;
			for (int i = 0; i < this.getHistoryChoixAdv().size(); i++) {
				if (this.getHistoryChoixAdv().get(i).equals(Choix.T)) {
					countT++;
				}
				if (this.getHistoryChoixAdv().get(i).equals(Choix.C)) {
					countC++;
				}
				if (this.getHistoryChoixAdv().get(i).equals(Choix.N)) {
					countN++;
				}
			}
			System.out.println("countC" + countC);
			System.out.println("countT" + countT);
			System.out.println("countN" + countN);

			if (countC > countT && countC > countN) {
				choixActuel = Choix.C;
			} else if (countT > countC && countT > countN) {
				choixActuel = Choix.T;
			}else if (countN > countC && countN > countT) {
				choixActuel = Choix.N;
			} else {
				choixActuel = Choix.T;
			}
			this.updateHistory(choixActuel, dernierChoixAdv);
		}
		return choixActuel;
	}

}
