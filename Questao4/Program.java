package Questao4;

public class Program {
    public int numero1;
    public int numero2;

    public String verificaDivisao(){
        if (numero1 % numero2 == 0){
            return " é";
        } else {
            return " não é";
        }
    }
}
