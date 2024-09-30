public class ValorNegativoException extends Exception {
    public ValorNegativoException() {
        super();
    }

    @Override
    public String toString() {
        return "Nao eh possivel realizar um saque ou deposito de valor negativo.";
    }
}
