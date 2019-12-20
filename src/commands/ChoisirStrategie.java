package commands;
import Prison.Jeu;

public class ChoisirStrategie implements Commande {
	Jeu jeu;
	public ChoisirStrategie(Jeu jeu) {
		this.jeu = jeu;
	}
	@Override
	public void execute() {
		this.jeu.choisirStrategie();
	}

}
