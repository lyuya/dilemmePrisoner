package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieMajoriteDur;
import Strategie.StrategieMajoriteMou;

public class StrategieMajoriteMouTest {
	@Test
	public void testGetName() {
		StrategieMajoriteMou s = new StrategieMajoriteMou();
		Assertions.assertEquals("Majorité-Mou", s.getName());
		Assertions.assertEquals("Majorité-Mou", s.getName());
	}
	
	@Test
	public void testGetNextChoixPremierTour() {
		StrategieMajoriteMou s = new StrategieMajoriteMou();
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
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
	public void testGetNextChoixMajT() {
		StrategieMajoriteMou s = new StrategieMajoriteMou();
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.C);
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
	}
	
	@Test
	public void testGetNextChoixMajC() {
		StrategieMajoriteMou s = new StrategieMajoriteMou();
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.C);
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.T));
	}
	@Test
	public void testGetNextChoixMajN() {
		StrategieMajoriteMou s = new StrategieMajoriteMou();
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.T);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.N);
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.C);
		s.addHistoryChoixAdv(Choix.C);
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.N));
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.T));
	}
}
