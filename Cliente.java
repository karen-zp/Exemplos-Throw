public class Cliente {
    String nome;
    String sobrenome;


    public Cliente(String oNome, String oSobrenome){
        nome = oNome;
        sobrenome = oSobrenome;
    }
    @Override
    public String toString(){
        return nome + " " + sobrenome;
    }
}
