package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategiePeriodiqueMechante;

public class StrategiePeriodiqueMechanteTest {
	@Test
	public void testGetName() {
		StrategiePeriodiqueMechante s = new StrategiePeriodiqueMechante();
		Assertions.assertEquals("Périodique-Méchante", s.getName());
		Assertions.assertEquals("Périodique-Méchante", s.getName());
	}
	@Test
	public void testGetNextChoixPremierTour() {
		StrategiePeriodiqueMechante s = new StrategiePeriodiqueMechante();
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));
	}
	
	@Test
	public void testGetNextChoix2emeTour() {
		StrategiePeriodiqueMechante s = new StrategiePeriodiqueMechante();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.addHistoryChoix(c2);
		Assertions.assertEquals(c2, s.getNextChoix(c2));
		Assertions.assertEquals(c1, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoix12emeTour() {
		StrategiePeriodiqueMechante s = new StrategiePeriodiqueMechante();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c2);
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
	}
}
