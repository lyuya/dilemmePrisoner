package exception;

public class NombreStrategiesException extends Exception {
	public NombreStrategiesException() {
		super("Au moins deux joueur pour un jeu!");
	}
}
