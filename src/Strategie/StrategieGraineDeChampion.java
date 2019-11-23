package Strategie;

public class StrategieGraineDeChampion extends StrategieComplexe {
	private boolean dansPhasePunition;
	private int nbPhasePunitionReste;

	@Override
	public String getName() {
		return "Graine-de-champion";
	}

	@Override
	public Choix getNextChoix(Choix dernierChoixAdv) {
		Choix choixActuel;
		// premier tour
		if (dernierChoixAdv == null) {
			choixActuel = Choix.C;
			this.addHistoryChoix(choixActuel);
			return choixActuel;
		} else {
			int sizeRes = this.getHistoryPoint().size();
			int pointTotal20Coups = 0;
			// Tous les 20 coups, j’évalue mon score
			if (sizeRes > 20 && sizeRes % 20 == 0) {
				for (int i = sizeRes - 20; i < sizeRes; i++) {
					pointTotal20Coups = pointTotal20Coups + this.getHistoryPoint().get(i);
				}
				if (pointTotal20Coups / 20 < 1.5) {
					choixActuel = Choix.N;
					this.updateHistory(choixActuel, dernierChoixAdv);
					return choixActuel;
				}
			}

			// trahis dans phase de punition
			if (dansPhasePunition) {
				if (nbPhasePunitionReste == 1) {
					// dernier tour est cooperer + sortir phase de punition
					choixActuel = Choix.C;
					setDansPhasePunition(!dansPhasePunition);
				} else if (nbPhasePunitionReste == 2) {
					// dernier 2eme tour est cooperer
					choixActuel = Choix.C;
				} else {
					choixActuel = Choix.T;
				}
				this.setNbPhasePunitionReste(nbPhasePunitionReste - 1);
			} else if (dernierChoixAdv == Choix.T) {
				// detecter s'il faut entrer dans une phase de punition
				int n = 0;
				for (int i = 0; i < sizeRes - 1; i++) {
					if (this.getHistoryChoixAdv().get(i).equals(Choix.T)
							&& this.getHistoryChoixAdv().get(i) != this.getHistoryChoix().get(i)) {
						n++;
					}
				}
				this.setDansPhasePunition(true);
				this.setNbPhasePunitionReste(n * (n + 1) / 2 + 1);
				choixActuel = Choix.T;
			} else {
				choixActuel = Choix.C;
			}
		}

		this.updateHistory(choixActuel, dernierChoixAdv);

		return choixActuel;
	}

	public boolean isDansPhasePunition() {
		return dansPhasePunition;
	}

	public void setDansPhasePunition(boolean dansPhasePunition) {
		this.dansPhasePunition = dansPhasePunition;
	}

	public int getNbPhasePunitionReste() {
		return nbPhasePunitionReste;
	}

	public void setNbPhasePunitionReste(int nbPhasePunitionReste) {
		this.nbPhasePunitionReste = nbPhasePunitionReste;
	}

}
