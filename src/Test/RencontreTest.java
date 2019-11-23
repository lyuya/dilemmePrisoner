package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Prison.Rencontre;
import Strategie.Strategie;
import Strategie.StrategieGentille;
import Strategie.StrategieMechante;

public class RencontreTest {
	@Test
	public void rencontreConstructionTest_G_VS_M() {
		Strategie s1 = new StrategieGentille();
		Strategie s2 = new StrategieMechante();
		Rencontre r = new Rencontre(s1, s2, 0);
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 1);
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 30);
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
	}
	@Test
	public void rencontreConstructionTest_M_VS_G() {
		Strategie s1 = new StrategieMechante();
		Strategie s2 = new StrategieGentille();
		Rencontre r = new Rencontre(s1, s2, 0);
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 1);
		Assertions.assertEquals(5, r.getPointsTotalJoueur1());
		Assertions.assertEquals(5, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 234);
		Assertions.assertEquals(1170, r.getPointsTotalJoueur1());
		Assertions.assertEquals(1170, r.getPointsTotalJoueur1());
	}
	@Test
	public void rencontreConstructionTest_G_VS_G() {
		Strategie s1 = new StrategieGentille();
		Strategie s2 = new StrategieGentille();
		Rencontre r = new Rencontre(s1, s2, 0);
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 1);
		Assertions.assertEquals(3, r.getPointsTotalJoueur1());
		Assertions.assertEquals(3, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 90);
		Assertions.assertEquals(270, r.getPointsTotalJoueur1());
		Assertions.assertEquals(270, r.getPointsTotalJoueur1());
	}
	
	@Test
	public void rencontreConstructionTest_M_VS_M() {
		Strategie s1 = new StrategieMechante();
		Strategie s2 = new StrategieMechante();
		Rencontre r = new Rencontre(s1, s2, 0);
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 1);
		Assertions.assertEquals(1, r.getPointsTotalJoueur1());
		Assertions.assertEquals(1, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 2);
		Assertions.assertEquals(2, r.getPointsTotalJoueur1());
		Assertions.assertEquals(2, r.getPointsTotalJoueur1());
	}

}
