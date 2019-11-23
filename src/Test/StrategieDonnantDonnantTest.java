package Test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Prison.Rencontre;
import Strategie.Choix;
import Strategie.Strategie;
import Strategie.StrategieDonnantDonnant;
import Strategie.StrategieGentille;
import Strategie.StrategieMechante;
import exception.NombreStrategiesException;

public class StrategieDonnantDonnantTest {
	@Test
	public void testGetName() {
		StrategieDonnantDonnant s = new StrategieDonnantDonnant();
		Assertions.assertEquals("Donnant-Donnant", s.getName());
		Assertions.assertEquals("Donnant-Donnant", s.getName());
	}
	@Test
	public void testGetNextChoixPremierTour() {
		StrategieDonnantDonnant s = new StrategieDonnantDonnant();
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
	}
	
	@Test
	public void testGetNextChoixAdvC() {
		StrategieDonnantDonnant s = new StrategieDonnantDonnant();

		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoixAdvT() {
		StrategieDonnantDonnant s = new StrategieDonnantDonnant();

		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
	}
	@Test
	public void StrategieComplexeTestGetResultat() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		Strategie sts[] = new Strategie[2];
		sts[0] = new StrategieGentille();
		sts[1] = new StrategieDonnantDonnant();
		new Rencontre(sts[0], sts[1], 5);
		ArrayList<Choix> res = new ArrayList<Choix>();
		res.add(Choix.C);
		res.add(Choix.C);
		res.add(Choix.C);
		res.add(Choix.C);
		res.add(Choix.C);
		Assertions.assertEquals(res, ((StrategieDonnantDonnant) sts[1]).getHistoryChoix());
		Assertions.assertEquals(res, ((StrategieDonnantDonnant) sts[1]).getHistoryChoix());
	}
	
	@Test
	public void StrategieComplexeTestGetResultatAdversaire() throws NombreStrategiesException, InstantiationException, IllegalAccessException {
		Strategie sts[] = new Strategie[2];
		sts[0] = new StrategieMechante();
		sts[1] = new StrategieDonnantDonnant();
		new Rencontre(sts[0], sts[1], 6);
		ArrayList<Choix> res = new ArrayList<Choix>();
		res.add(Choix.T);
		res.add(Choix.T);
		res.add(Choix.T);
		res.add(Choix.T);
		res.add(Choix.T);
		Assertions.assertEquals(res, ((StrategieDonnantDonnant) sts[1]).getHistoryChoixAdv());
		Assertions.assertEquals(res, ((StrategieDonnantDonnant) sts[1]).getHistoryChoixAdv());
	}
}
