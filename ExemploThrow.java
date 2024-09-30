public class ExemploThrow{
    public static void main(String[] args){
        try{
            System.out.println("antes de usar throw.");
            throw new ArithmeticException();
        }
        catch(ArithmeticException exc){
            System.out.println("Exceção capturada.");
        }
        System.out.println("Depois do bloco try/catch.");
    }
}
