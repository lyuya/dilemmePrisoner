package Prison;

import java.util.Scanner;
import commands.ChoisirStrategie;
import commands.CommencerTournoi;
import commands.DefinirNbTour;
import commands.Terminer;
import commands.ViderStrategies;


public class JeuDemo {
	static Jeu jeu = new Jeu();
	static JeuControl control = new JeuControl();

	public static void main(String[] args) {
		int selection = -1;
		control.addCommande(new ChoisirStrategie(jeu), "Choisir les strategies");
		control.addCommande(new CommencerTournoi(jeu), "Commencer un tournoi");
		control.addCommande(new DefinirNbTour(jeu), "Definir le nombre de tour");
		control.addCommande(new Terminer(jeu), "Terminer le jeu");
		control.addCommande(new ViderStrategies(jeu), "Vider les strategies");
		System.out.println("/***************************************************/");
		System.out.println("Bienvenue au jeu dilemme prisoner:");
		System.out.println("/***************************************************/");
		do {
			afficherMenu();
			Scanner input = new Scanner(System.in);
			selection = input.nextInt();
			switch (selection) {
				case 1:
					control.execute("Choisir les strategies");
					break;
				case 2:
					control.execute("Definir le nombre de tour");
					break;
				case 3:
					if (jeu.getNbTours() < 1) {
						control.execute("Definir le nombre de tour");
						control.execute("Commencer un tournoi");
					}else {
						control.execute("Commencer un tournoi");
					}
					break;
				case 4:
					control.execute("Vider les strategies");
				case 0:
					control.execute("Terminer le jeu");
					break;
			}
		} while(selection != 0);
		
	}

	public static void afficherMenu() {
		System.out.println("/***************************************************/");
		System.out.println("Veuillez choisir une commande");
		System.out.println("-------------------------\n");
		System.out.println("0 - Quitter le jeu");
		System.out.println("1 - Choisir les strategies");
		System.out.println("2 - Definir le nombre de tour");
		System.out.println("3 - Commencer un tournoi");
		System.out.println("4 - Vider les strategies choisis");
		System.out.println("/***************************************************/");
	}
}
