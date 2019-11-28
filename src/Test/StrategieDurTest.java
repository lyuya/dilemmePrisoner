package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import Strategie.Choix;
import Strategie.StrategieDur;
import Strategie.StrategieMajoriteDur;

public class StrategieDurTest {
	@Test
	public void testGetName() {
		StrategieDur s = new StrategieDur();
		Assertions.assertEquals("Dur", s.getName());
		Assertions.assertEquals("Dur", s.getName());
	}
	@Test
	public void testGetNextChoixPremierTour() {
		StrategieDur s = new StrategieDur();
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getHistoryChoix().get(0));
		Assertions.assertEquals(Choix.C, s.getHistoryChoix().get(0));
	}
	@Test
	public void testGetNextChoixAdvC() {
		StrategieDur s = new StrategieDur();
		// commence le premier tour
		s.getNextChoix(null);
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoixAdvT() {
		StrategieDur s = new StrategieDur();
		s.getNextChoix(null);
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.T));
	}
	
	@Test
	public void testGetNextChoixAdvN() {
		StrategieDur s = new StrategieDur();
		s.getNextChoix(null);
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.N));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.N));
	}
	
	@Test
	public void testGetNextChoixRenonceDefinitif() {
		StrategieDur s = new StrategieDur();
		s.getNextChoix(null);
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.N));
	}
}
