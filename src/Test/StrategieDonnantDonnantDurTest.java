package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieDonnantDonnantDur;

public class StrategieDonnantDonnantDurTest {
	@Test
	public void testGetName() {
		StrategieDonnantDonnantDur s = new StrategieDonnantDonnantDur();
		Assertions.assertEquals("DonnantDonnantDur", s.getName());
		Assertions.assertEquals("DonnantDonnantDur", s.getName());
	}
	
	@Test
	public void testGetNextChoixPremierTour() {
		StrategieDonnantDonnantDur s = new StrategieDonnantDonnantDur();
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
	}
	
	@Test
	public void testGetNextChoixAdvTrahisDernierTour() {
		StrategieDonnantDonnantDur s = new StrategieDonnantDonnantDur();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.updateHistory(c1, c2);
		Assertions.assertEquals(Choix.T, s.getNextChoix(c2));
		Assertions.assertEquals(Choix.T, s.getNextChoix(c2));
	}
	@Test
	public void testGetNextChoixAdvTrahisDernier2Tour() {
		StrategieDonnantDonnantDur s = new StrategieDonnantDonnantDur();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.updateHistory(c1, c1);
		s.updateHistory(c1, c2);
		Assertions.assertEquals(Choix.T, s.getNextChoix(c2));
		Assertions.assertEquals(Choix.T, s.getNextChoix(c2));
	}
	@Test
	public void testGetNextChoixAdvTrahisJamais() {
		StrategieDonnantDonnantDur s = new StrategieDonnantDonnantDur();
		Choix c1 = Choix.C;
		s.updateHistory(c1, c1);
		s.updateHistory(c1, c1);
		s.updateHistory(c1, c1);
		Assertions.assertEquals(Choix.C, s.getNextChoix(c1));
		Assertions.assertEquals(Choix.C, s.getNextChoix(c1));
	}
}
