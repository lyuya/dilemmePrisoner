package Strategie;

public class StrategieMechante implements Strategie {

	@Override
	public String getName() {
		return "MyMechante";
	}

	@Override
	public Choix getNextChoix(Choix c) {
		return Choix.T;
	}
}
