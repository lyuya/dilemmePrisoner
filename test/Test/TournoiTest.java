package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import Prison.Tournoi;
import Strategie.Strategie;
import Strategie.StrategieGentille;
import Strategie.StrategieMechante;
import exception.NombreStrategiesException;

public class TournoiTest {

	@Test
	public void ConstructionExceptionZeroStrategieTest() {
		ArrayList<Strategie> sts = new ArrayList<Strategie>();
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
		ArrayList<Strategie> sts = new ArrayList<Strategie>();
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
		ArrayList<Strategie> sts = new ArrayList<Strategie>();
		sts.add(new StrategieMechante());
		sts.add(new StrategieMechante());
		Tournoi t = new Tournoi(sts, 10);
		t.organiser();

		Assertions.assertEquals(20, t.getTotal(0));
		Assertions.assertEquals(20, t.getTotal(0));
		Assertions.assertEquals(20, t.getTotal(1));
		Assertions.assertEquals(20, t.getTotal(1));
	}

	@Test
	public void organiserTestGG() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		ArrayList<Strategie> sts = new ArrayList<Strategie>();
		sts.add(new StrategieGentille());
		sts.add(new StrategieGentille());
		Tournoi t = new Tournoi(sts, 20);
		t.organiser();

		Assertions.assertEquals(120, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(1));
		Assertions.assertEquals(120, t.getTotal(1));
	}

	@Test
	public void organiserTestGM() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		ArrayList<Strategie> sts = new ArrayList<Strategie>();
		sts.add(new StrategieGentille());
		sts.add(new StrategieMechante());
		Tournoi t = new Tournoi(sts, 20);
		t.organiser();

		Assertions.assertEquals(60, t.getTotal(0));
		Assertions.assertEquals(60, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(1));
		Assertions.assertEquals(120, t.getTotal(1));
	}

	@Test
	public void organiserTestMG() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		ArrayList<Strategie> sts = new ArrayList<Strategie>();
		sts.add(new StrategieMechante());
		sts.add(new StrategieGentille());
		Tournoi t = new Tournoi(sts, 20);
		t.organiser();

		Assertions.assertEquals(60, t.getTotal(1));
		Assertions.assertEquals(60, t.getTotal(1));
		Assertions.assertEquals(120, t.getTotal(0));
		Assertions.assertEquals(120, t.getTotal(0));
	}

}
