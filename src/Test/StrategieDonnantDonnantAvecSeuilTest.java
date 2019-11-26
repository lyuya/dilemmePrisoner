package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.Choix;
import Strategie.StrategieDonnantDonnantAvecSeuil;

public class StrategieDonnantDonnantAvecSeuilTest {
	@Test
	public void testGetName() {
		StrategieDonnantDonnantAvecSeuil s = new StrategieDonnantDonnantAvecSeuil();
		Assertions.assertEquals("DonnantDonnantAvecSeuil", s.getName());
		Assertions.assertEquals("DonnantDonnantAvecSeuil", s.getName());
	}
	
	@Test
	public void testGetNextChoixRenonce() {
		StrategieDonnantDonnantAvecSeuil s = new StrategieDonnantDonnantAvecSeuil();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.addHistoryChoix(Choix.C);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		Assertions.assertEquals(Choix.N, s.getNextChoix(c1));
		s.updateHistory(c2, c2);
		s.updateHistory(c2, c2);
		s.updateHistory(c2, c2);
		s.updateHistory(c2, c2);
		Assertions.assertEquals(Choix.N, s.getNextChoix(c1));
	}
	@Test
	public void testGetNextChoixNonRenonce() {
		StrategieDonnantDonnantAvecSeuil s = new StrategieDonnantDonnantAvecSeuil();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.addHistoryChoix(Choix.C);
		s.updateHistory(c1, c1);
		s.updateHistory(c1, c1);
		s.updateHistory(c1, c1);
		s.updateHistory(c1, c2);
		s.updateHistory(c2, c1);
		Assertions.assertEquals(c1, s.getNextChoix(c1));
		s.updateHistory(c2, c2);
		s.updateHistory(c2, c2);
		s.updateHistory(c2, c1);
		s.updateHistory(c2, c1);
		Assertions.assertEquals(c1, s.getNextChoix(c1));
	}
	
	@Test
	public void testGetNextChoixRenoncePuisNonRenonce() {
		StrategieDonnantDonnantAvecSeuil s = new StrategieDonnantDonnantAvecSeuil();
		Choix c1 = Choix.C;
		Choix c2 = Choix.T;
		s.addHistoryChoix(Choix.C);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		s.updateHistory(c1, c2);
		Assertions.assertEquals(Choix.N, s.getNextChoix(c1));
		s.updateHistory(c2, c2);
		s.updateHistory(c2, c2);
		s.updateHistory(c2, c1);
		s.updateHistory(c2, c1);
		Assertions.assertEquals(c1, s.getNextChoix(c1));
	}
}
