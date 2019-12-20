package commands;

import Prison.Jeu;

public class ViderStrategies implements Commande {
	Jeu jeu;
	public ViderStrategies(Jeu jeu) {
		this.jeu = jeu;
	}

	@Override
	public void execute() {
		this.jeu.resetStrategies();
	}

}
