package exceptions;

public class ParametrosInvalidosException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException() {
        super("Parâmetros inválidos fornecidos.");
    }

}
