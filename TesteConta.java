public class TesteConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jeremias", "Antunes");
        Conta conta1 = new Conta(3954, 8000, 2000, cliente1);
        
        try {
            conta1.saca(-100);
        } catch (ValorNegativoException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println("Saldo insuficiente!");
        }

        try {
            conta1.deposita(-500);  
        } catch (ValorNegativoException e) {
            System.out.println(e);
        }

        System.out.println("Dados da conta1: \n" + conta1.toString());
    }
}
