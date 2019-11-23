package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;
import Prison.Tournoi;
import Strategie.Strategie;
import Strategie.StrategieDonnantDonnant;
import Strategie.StrategieGentille;
import Strategie.StrategieMechante;
import exception.NombreStrategiesException;

public class TournoiTest {

	@Test
	public void ConstructionExceptionZeroStrategieTest() {
		Strategie[] sts = new Strategie[0];
		NombreStrategiesException exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 0);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));

		exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 0);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));

		exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 100);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));

		exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 100);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));
	}

	@Test
	public void ConstructionExceptionUnStrategieTest() {
		Strategie[] sts = new Strategie[1];
		NombreStrategiesException exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 0);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));

		exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 0);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));

		exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 100);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));

		exceptionThrown = assertThrows(NombreStrategiesException.class, () -> {
			new Tournoi(sts, 100);
		});
		Assertions.assertTrue(exceptionThrown.getMessage().contains("Au moins deux joueur pour un jeu!"));
	}

	@Test
	public void organiserTestMM() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		Strategie sts[] = new Strategie[2];
		sts[0] = new StrategieMechante();
		sts[1] = new StrategieMechante();
		Tournoi t = new Tournoi(sts, 10);
		t.organiser();

		Assertions.assertEquals(20, t.getTotal(0));
		Assertions.assertEquals(20, t.getTotal(0));
		Assertions.assertEquals(20, t.getTotal(1));
		Assertions.assertEquals(20, t.getTotal(1));
	}

	@Test
	public void organiserTestGG() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		Strategie sts[] = new Strategie[2];
		sts[0] = new StrategieGentille();
		sts[1] = new StrategieGentille();
		Tournoi t = new Tournoi(sts, 20);
		t.organiser();

		Assertions.assertEquals(120, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(1));
		Assertions.assertEquals(120, t.getTotal(1));
	}

	@Test
	public void organiserTestGM() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		Strategie sts[] = new Strategie[2];
		sts[0] = new StrategieGentille();
		sts[1] = new StrategieMechante();
		Tournoi t = new Tournoi(sts, 20);
		t.organiser();

		Assertions.assertEquals(60, t.getTotal(0));
		Assertions.assertEquals(60, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(1));
		Assertions.assertEquals(120, t.getTotal(1));
	}

	@Test
	public void organiserTestMG() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		Strategie sts[] = new Strategie[2];
		sts[0] = new StrategieMechante();
		sts[1] = new StrategieGentille();
		Tournoi t = new Tournoi(sts, 20);
		t.organiser();

		Assertions.assertEquals(60, t.getTotal(1));
		Assertions.assertEquals(60, t.getTotal(1));
		Assertions.assertEquals(120, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(0));
	}

}
