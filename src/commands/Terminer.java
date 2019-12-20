package commands;

import Prison.Jeu;

public class Terminer implements Commande {
	Jeu jeu;
	public Terminer(Jeu jeu) {
		this.jeu = jeu;
	}
	@Override
	public void execute() {
		this.jeu.terminer();
	}

}
