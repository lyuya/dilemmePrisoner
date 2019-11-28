package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieMajoriteDur;
import Strategie.StrategieRancuniere;

public class StrategieMajoriteDurTest {
	@Test
	public void testGetName() {
		StrategieMajoriteDur s = new StrategieMajoriteDur();
		Assertions.assertEquals("Majorité-Dur", s.getName());
		Assertions.assertEquals("Majorité-Dur", s.getName());
	}
	
	@Test
	public void testGetNextChoixPremierTour() {
		StrategieMajoriteDur s = new StrategieMajoriteDur();
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));
	}
	@Test
	public void testGetNextChoixEgal() {
		StrategieMajoriteDur s = new StrategieMajoriteDur();
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.T);
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
	}
	@Test
	public void testGetNextChoixMajC() {
		StrategieMajoriteDur s = new StrategieMajoriteDur();
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.C);
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoixMajT() {
		StrategieMajoriteDur s = new StrategieMajoriteDur();
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.N);
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoixMajN() {
		StrategieMajoriteDur s = new StrategieMajoriteDur();
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.C);
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.N));
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.T));
	}
}
