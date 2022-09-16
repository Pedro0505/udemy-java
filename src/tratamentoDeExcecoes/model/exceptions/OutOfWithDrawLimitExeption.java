package tratamentoDeExcecoes.model.exceptions;

public class OutOfWithDrawLimitExeption extends Exception {
    private static final long serialVersionUID = 1L;

    public OutOfWithDrawLimitExeption(String msg) {
        super(msg);
    }
}
