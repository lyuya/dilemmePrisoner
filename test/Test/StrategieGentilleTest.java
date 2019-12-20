package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieGentille;

public class StrategieGentilleTest {
	@Test
	public void testGetName() {
		StrategieGentille s = new StrategieGentille();
		Assertions.assertEquals("Gentille", s.getName());
		Assertions.assertEquals("Gentille", s.getName());
	}
	@Test
	public void testGetNextChoixNul() {
		StrategieGentille s = new StrategieGentille();
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
		Assertions.assertEquals(Choix.C, s.getNextChoix(null));
	}
	@Test
	public void testGetNextChoixC() {
		StrategieGentille s = new StrategieGentille();

		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.C));
	}
	@Test
	public void testGetNextChoixT() {
		StrategieGentille s = new StrategieGentille();
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.T));
		Assertions.assertEquals(Choix.C, s.getNextChoix(Choix.T));
	}
}
