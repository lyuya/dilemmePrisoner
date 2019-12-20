package Test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Strategie.StrategieType;
import factory.StrategieFactory;

public class StrategieFactoryTest {
	@Test
	public void testGetStrategieGentille() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Gentille", sf.getStrategie(StrategieType.GENTILLE.name()).getName());
		Assertions.assertEquals("Gentille", sf.getStrategie(StrategieType.GENTILLE.name()).getName());
	}
	@Test
	public void testGetStrategieMechante() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Mechante", sf.getStrategie(StrategieType.MECHANTE.name()).getName());
		Assertions.assertEquals("Mechante", sf.getStrategie(StrategieType.MECHANTE.name()).getName());
	}
	@Test
	public void testGetStrategieDonnant() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Donnant-Donnant", sf.getStrategie(StrategieType.DONNANT.name()).getName());
		Assertions.assertEquals("Donnant-Donnant", sf.getStrategie(StrategieType.DONNANT.name()).getName());
	}
	@Test
	public void testGetStrategieDonnantDur() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("DonnantDonnantDur", sf.getStrategie(StrategieType.DONNANTDUR.name()).getName());
		Assertions.assertEquals("DonnantDonnantDur", sf.getStrategie(StrategieType.DONNANTDUR.name()).getName());
	}
	@Test
	public void testGetStrategieDonnantAvecSeuil() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("DonnantDonnantAvecSeuil", sf.getStrategie(StrategieType.DONNANTSEUIL.name()).getName());
		Assertions.assertEquals("DonnantDonnantAvecSeuil", sf.getStrategie(StrategieType.DONNANTSEUIL.name()).getName());
	}
	@Test
	public void testGetStrategieDur() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Dur", sf.getStrategie(StrategieType.DUR.name()).getName());
		Assertions.assertEquals("Dur", sf.getStrategie(StrategieType.DUR.name()).getName());
	}
	@Test
	public void testGetStrategieMajoDur() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Majorité-Dur", sf.getStrategie(StrategieType.MAJODUR.name()).getName());
		Assertions.assertEquals("Majorité-Dur", sf.getStrategie(StrategieType.MAJODUR.name()).getName());
	}
	@Test
	public void testGetStrategieMajoMou() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Majorité-Mou", sf.getStrategie(StrategieType.MAJOMOU.name()).getName());
		Assertions.assertEquals("Majorité-Mou", sf.getStrategie(StrategieType.MAJOMOU.name()).getName());
	}
	@Test
	public void testGetStrategieMefiante() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Méfiante", sf.getStrategie(StrategieType.MEFIANTE.name()).getName());
		Assertions.assertEquals("Méfiante", sf.getStrategie(StrategieType.MEFIANTE.name()).getName());
	}
	@Test
	public void testGetStrategiePerioGentille() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Périodique-Gentille", sf.getStrategie(StrategieType.PERIOGENTILLE.name()).getName());
		Assertions.assertEquals("Périodique-Gentille", sf.getStrategie(StrategieType.PERIOGENTILLE.name()).getName());
	}
	@Test
	public void testGetStrategiePerioMechante() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Périodique-Méchante", sf.getStrategie(StrategieType.PERIOMECHANTE.name()).getName());
		Assertions.assertEquals("Périodique-Méchante", sf.getStrategie(StrategieType.PERIOMECHANTE.name()).getName());
	}
	@Test
	public void testGetStrategieRancuniere() {
		StrategieFactory sf = new StrategieFactory();
		Assertions.assertEquals("Rancunière", sf.getStrategie(StrategieType.RANCUNIERE.name()).getName());
		Assertions.assertEquals("Rancunière", sf.getStrategie(StrategieType.RANCUNIERE.name()).getName());
	}
	
	
}
