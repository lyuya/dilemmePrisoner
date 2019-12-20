package Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.PointCalculatrice;

public class PointCalculatriceTest {
	@Test
	public void getPointTestNullNull() {
		assertThrows(NullPointerException.class, () -> {
			PointCalculatrice.getPoint(null, null);
		});
	}
	
	@Test
	public void getPointTestC_T() {
		Assertions.assertEquals(0, PointCalculatrice.getPoint(Choix.C, Choix.T));
	}
	@Test
	public void getPointTestC_C() {
		Assertions.assertEquals(3, PointCalculatrice.getPoint(Choix.C, Choix.C));
	}
	@Test
	public void getPointTestT_T() {
		Assertions.assertEquals(1, PointCalculatrice.getPoint(Choix.T, Choix.T));
	}
	@Test
	public void getPointTestT_C() {
		Assertions.assertEquals(5, PointCalculatrice.getPoint(Choix.T, Choix.C));
	}
	
	@Test
	public void getPointTestN_C() {
		Assertions.assertEquals(2, PointCalculatrice.getPoint(Choix.N, Choix.C));
	}
	
	@Test
	public void getPointTestC_N() {
		Assertions.assertEquals(2, PointCalculatrice.getPoint(Choix.C, Choix.N));
	}
	@Test
	public void getPointTestT_N() {
		Assertions.assertEquals(2, PointCalculatrice.getPoint(Choix.T, Choix.N));
	}
	@Test
	public void getPointTestN_T() {
		Assertions.assertEquals(2, PointCalculatrice.getPoint(Choix.N, Choix.T));
	}
}
