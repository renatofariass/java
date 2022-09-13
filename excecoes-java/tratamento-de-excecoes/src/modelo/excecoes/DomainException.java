package modelo.excecoes;

public class DomainException extends RuntimeException {
    private static final long seialVersionUID = 1L;
    public DomainException(String msg) {
        super(msg);
    }
}
