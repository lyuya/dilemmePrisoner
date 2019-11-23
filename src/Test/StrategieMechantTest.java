package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieMechante;
public class StrategieMechantTest {
	@Test
	public void testGetName() {
		StrategieMechante s = new StrategieMechante();
		Assertions.assertEquals("MyMechante", s.getName());
		Assertions.assertEquals("MyMechante", s.getName());
	}
	@Test
	public void testGetNextChoix() {
		StrategieMechante s = new StrategieMechante();
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));
		Assertions.assertEquals(Choix.T, s.getNextChoix(null));

		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.C));

		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.T, s.getNextChoix(Choix.T));
	}
	
}
