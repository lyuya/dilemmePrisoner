package exception;

public class EnumChoixNullException extends Exception {
	public EnumChoixNullException() {
		super("Au moins un Choix valide!");
	}
}
