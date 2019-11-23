package Strategie;

public interface Strategie {
	public String getName();
	public Choix getNextChoix(Choix dernierChoixAdv);
}
