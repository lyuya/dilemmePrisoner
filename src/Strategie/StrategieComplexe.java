package Strategie;

import java.util.ArrayList;

public abstract class StrategieComplexe implements Strategie{
	public ArrayList<Choix> historyChoix = new ArrayList<Choix>();
	public ArrayList<Choix> historyChoixAdv = new ArrayList<Choix>();
	public ArrayList<Integer> historyPoint = new ArrayList<Integer>();
	public ArrayList<Integer> historyPointAdv = new ArrayList<Integer>();
	public ArrayList<Integer> getHistoryPoint() {
		return historyPoint;
	}
	public void addHistoryPoint(int historyPoint) {
		this.historyPoint.add(historyPoint);
	}
	public ArrayList<Integer> getHistoryPointAdv() {
		return historyPointAdv;
	}
	public void addHistoryPointAdv(int historyPointAdv) {
		this.historyPointAdv.add(historyPointAdv);
	}
	public ArrayList<Choix> getHistoryChoix() {
		return historyChoix;
	}
	public void addHistoryChoix(Choix c) {
		this.historyChoix.add(c);
	}
	public ArrayList<Choix> getHistoryChoixAdv() {
		return historyChoixAdv;
	}
	public void addHistoryChoixAdv(Choix c) {
		this.historyChoixAdv.add(c);
	}
	public void updateHistory(Choix c1, Choix c2) {
		/* chaque tour une strategie complexe sauvagarde 
		 * 1. son nouveau choix, 
		 * 2. le choix d'adversaire de dernier tour
		 * 3. le point qu'il a eu dans le dernier tour
		 * 4. le point qu'son adversaire a eu dans le dernier tour
		 * donc historyChoix = historyChoixAdv / historyPoint/ historyPointAdv .size() + 1
		 */
		this.addHistoryChoix(c1);
		this.addHistoryChoixAdv(c2);
		this.addHistoryPoint(PointCalculatrice.getPoint(this.getHistoryChoix().get(this.getHistoryChoix().size()-1), c2));
		this.addHistoryPointAdv(PointCalculatrice.getPoint(c2, this.getHistoryChoix().get(this.getHistoryChoix().size()-1)));
	}
	
}
