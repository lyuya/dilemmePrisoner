package Strategie;

public class StrategieGentille implements Strategie {
	
	@Override
	public String getName() {
		return "MyGentille";
	}

	@Override
	public Choix getNextChoix(Choix c) {
		return Choix.C;
	}
}
