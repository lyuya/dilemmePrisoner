package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Prison.Tour;
import Strategie.Choix;

public class TourTest {
	@Test
	public void tourConstructionTest_C_VS_C() throws Exception {
		Tour t = new Tour(Choix.C, Choix.C);
		Assertions.assertEquals(3, t.getScoreJoueur1());
		Assertions.assertEquals(3, t.getScoreJoueur1());
	}
	@Test
	public void tourConstructionTest_C_VS_T() throws Exception {
		Tour t = new Tour(Choix.C, Choix.T);
		Assertions.assertEquals(0, t.getScoreJoueur1());
		Assertions.assertEquals(0, t.getScoreJoueur1());
	}
	@Test
	public void tourConstructionTest_T_VS_C() throws Exception {
		Tour t = new Tour(Choix.T, Choix.C);
		Assertions.assertEquals(5, t.getScoreJoueur1());
		Assertions.assertEquals(5, t.getScoreJoueur1());
	}
	@Test
	public void tourConstructionTest_T_VS_T() throws Exception {
		Tour t = new Tour(Choix.T, Choix.T);
		Assertions.assertEquals(1, t.getScoreJoueur1());
		Assertions.assertEquals(1, t.getScoreJoueur1());
	}
	
}
