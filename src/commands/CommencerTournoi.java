package commands;
import Prison.Jeu;

public class CommencerTournoi implements Commande {
	Jeu jeu;
	public CommencerTournoi(Jeu jeu) {
		this.jeu = jeu;
	}
	@Override
	public void execute() {
		this.jeu.commencerTournoi();
	}

}
