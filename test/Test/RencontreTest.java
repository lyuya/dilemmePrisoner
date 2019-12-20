package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Prison.Rencontre;
import Strategie.Strategie;
import Strategie.StrategieGentille;
import Strategie.StrategieMechante;

public class RencontreTest {
	/** For the Observable,
	 * you can test: if the observer is well attach
	 * (count the number of observers and check if the one attach is the good one),
	 * and after if the observer is well detach.
	 */
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
		r.jouer();
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 1);
		r.jouer();
		Assertions.assertEquals(5, r.getPointsTotalJoueur1());
		Assertions.assertEquals(5, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 234);
		r.jouer();
		Assertions.assertEquals(1170, r.getPointsTotalJoueur1());
		Assertions.assertEquals(1170, r.getPointsTotalJoueur1());
	}
	@Test
	public void rencontreConstructionTest_G_VS_G() {
		Strategie s1 = new StrategieGentille();
		Strategie s2 = new StrategieGentille();
		Rencontre r = new Rencontre(s1, s2, 0);
		r.jouer();
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 1);
		r.jouer();
		Assertions.assertEquals(3, r.getPointsTotalJoueur1());
		Assertions.assertEquals(3, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 90);
		r.jouer();
		Assertions.assertEquals(270, r.getPointsTotalJoueur1());
		Assertions.assertEquals(270, r.getPointsTotalJoueur1());
	}
	
	@Test
	public void rencontreConstructionTest_M_VS_M() {
		Strategie s1 = new StrategieMechante();
		Strategie s2 = new StrategieMechante();
		Rencontre r = new Rencontre(s1, s2, 0);
		r.jouer();
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		Assertions.assertEquals(0, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 1);
		r.jouer();
		Assertions.assertEquals(1, r.getPointsTotalJoueur1());
		Assertions.assertEquals(1, r.getPointsTotalJoueur1());
		
		r = new Rencontre(s1, s2, 2);
		r.jouer();
		Assertions.assertEquals(2, r.getPointsTotalJoueur1());
		Assertions.assertEquals(2, r.getPointsTotalJoueur1());
	}

}
