package commands;
import Prison.Jeu;

public class DefinirNbTour implements Commande {
	Jeu jeu;
	public DefinirNbTour(Jeu jeu) {
		this.jeu = jeu;
	}
	@Override
	public void execute() {
		this.jeu.definirNbTour();
	}

}
