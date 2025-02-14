package Questao5;

public class Program {
    public String palavraP;
    public String palavraS;

    public String verifica(){
        if (palavraP.equalsIgnoreCase(palavraS)) {
            return " são";
        } else {
            return " não são";
        }
    }

}
