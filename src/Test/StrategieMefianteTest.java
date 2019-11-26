package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieDonnantDonnant;
import Strategie.StrategieMefiante;

public class StrategieMefianteTest {
	@Test
	public void testGetName() {
		StrategieMefiante s = new StrategieMefiante();
		Assertions.assertEquals("Méfiante", s.getName());
		Assertions.assertEquals("Méfiante", s.getName());
	}
	
	@Test
	public void testGetNextChoixPremierTour() {
		StrategieMefiante s = new StrategieMefiante();
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));
	}
	
	@Test
	public void testGetNextChoixAdvC() {
		StrategieMefiante s = new StrategieMefiante();

		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoixAdvT() {
		StrategieMefiante s = new StrategieMefiante();

		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
	}
}
