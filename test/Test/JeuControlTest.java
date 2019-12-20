package Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Prison.Jeu;
import Prison.JeuControl;
import Prison.Tournoi;
import commands.DefinirNbTour;
import commands.Terminer;
import exception.NombreStrategiesException;

public class JeuControlTest {
	@Test
	public void resetTest() {
		Jeu jeu = new Jeu();
		JeuControl jc = new JeuControl();
		jc.addCommande(new Terminer(jeu), "test1");
		jc.addCommande(new DefinirNbTour(jeu), "test2");
		jc.reset();
		Assertions.assertEquals(0, jc.getCommandes().size());
		Assertions.assertEquals(0, jc.getCommandes().size());
	}
	
	@Test
	public void addCommandeTest() {
		Jeu jeu = new Jeu();
		JeuControl jc = new JeuControl();
		jc.addCommande(new Terminer(jeu), "test1");
		Assertions.assertEquals(1, jc.getCommandes().size());
		jc.addCommande(new DefinirNbTour(jeu), "test2");
		Assertions.assertEquals(2, jc.getCommandes().size());
		
	}
	
	@Test
	public void executeExeceptionTest() {
		Jeu jeu = new Jeu();
		JeuControl jc = new JeuControl();
		jc.addCommande(new Terminer(jeu), "test1");
		jc.addCommande(new DefinirNbTour(jeu), "test2");
		IllegalStateException exceptionThrown = assertThrows(IllegalStateException.class, () -> {
			jc.execute("test");;
		});
		IllegalStateException _exceptionThrown = assertThrows(IllegalStateException.class, () -> {
			jc.execute("test0");;
		});
	}
}
