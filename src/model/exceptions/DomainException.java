package model.exceptions;
//pode estender RuntimeException ou apenas Exception
//RuntimeException é um tipo de exceção que o compilador NÃO OBRIGA tratar
//Exception o compilador TE OBRIGA a tratar(igual a ParseException
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L; 

	public DomainException(String msg) {
		super(msg);
	}

	
}
