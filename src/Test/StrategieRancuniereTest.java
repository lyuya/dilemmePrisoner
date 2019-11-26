package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieRancuniere;

public class StrategieRancuniereTest {
	@Test
	public void testGetName() {
		StrategieRancuniere s = new StrategieRancuniere();
		Assertions.assertEquals("Rancunière", s.getName());
		Assertions.assertEquals("Rancunière", s.getName());
	}
	
	@Test
	public void testGetNextChoixPremierTour() {
		StrategieRancuniere s = new StrategieRancuniere();
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
	}
	
	@Test
	public void testGetNextChoixAdvN() {
		StrategieRancuniere s = new StrategieRancuniere();
		s.updateHistory(Choix.C, Choix.C);
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.N));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoixAdvT() {
		StrategieRancuniere s = new StrategieRancuniere();
		s.addHistoryChoix(Choix.C);
		s.updateHistory(Choix.C, Choix.C);
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
	}
}
