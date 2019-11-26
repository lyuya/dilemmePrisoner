package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategiePeriodiqueGentille;

public class StrategiePeriodiqueGentilleTest {
	@Test
	public void testGetName() {
		StrategiePeriodiqueGentille s = new StrategiePeriodiqueGentille();
		Assertions.assertEquals("Périodique-Gentille", s.getName());
		Assertions.assertEquals("Périodique-Gentille", s.getName());
	}
	
	@Test
	public void testGetNextChoixPremierTour() {
		StrategiePeriodiqueGentille s = new StrategiePeriodiqueGentille();
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
	}
	
	@Test
	public void testGetNextChoix2emeTour() {
		StrategiePeriodiqueGentille s = new StrategiePeriodiqueGentille();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.addHistoryChoix(c2);
		Assertions.assertEquals(c1, s.getNextChoix(c2));
		Assertions.assertEquals(c2, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoix12emeTour() {
		StrategiePeriodiqueGentille s = new StrategiePeriodiqueGentille();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c2);
		s.addHistoryChoix(c1);
		s.addHistoryChoix(c1);
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.T));
	}
}
