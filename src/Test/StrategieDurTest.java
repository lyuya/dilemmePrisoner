package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieDur;

public class StrategieDurTest {
	@Test
	public void testGetName() {
		StrategieDur s = new StrategieDur();
		Assertions.assertEquals("Dur", s.getName());
		Assertions.assertEquals("Dur", s.getName());
	}
	
	@Test
	public void testGetNextChoixTrahir() {
		StrategieDur s = new StrategieDur();
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
	}
	
	@Test
	public void testGetNextChoixRenoncer() {
		StrategieDur s = new StrategieDur();
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.N, s.getNextChoix(Choix.T));
	}
}
