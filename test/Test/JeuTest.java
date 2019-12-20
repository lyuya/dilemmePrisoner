package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Prison.Jeu;
import Strategie.Choix;
import Strategie.PointCalculatrice;
import Strategie.Strategie;
import Strategie.StrategieDonnantDonnant;
import Strategie.StrategieDur;

public class JeuTest {
	
	@Test
	public void resetStrategiesTest() {
		Jeu jeu = new Jeu();
		Strategie s1 = new StrategieDonnantDonnant();
		Strategie s2 = new StrategieDur();
		jeu.addStrategies(s1);
		jeu.addStrategies(s2);
		Assertions.assertEquals(2, jeu.getStrategies().size());
		jeu.resetStrategies();
		Assertions.assertEquals(0, jeu.getStrategies().size());
	}
}
