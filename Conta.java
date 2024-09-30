public class Conta {
    private int num;
    private double saldo, limite;
    private Cliente cliente;

    public Conta(int num, double saldo, double limite, Cliente cliente){
        this.num = num;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void saca(double saque) throws ValorNegativoException {
        if (saque < 0) {
            throw new ValorNegativoException();
        }
        if (saque > saldo + limite) {
            throw new IllegalArgumentException();
        }
        saldo -= saque;
    }

    public void deposita(double deposito) throws ValorNegativoException {
        if (deposito < 0) {
            throw new ValorNegativoException();
        }
        saldo += deposito;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + "\nNumero conta: " + num + "\nSaldo: " + saldo + "\nLimite: " + limite;
    }
}
