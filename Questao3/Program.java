package Questao3;

public class Program {
    public int numero;

    public char verificaGrupo(){
        if (numero > 0 && numero <= 10){
            return 'A';
        } else if (numero > 10 && numero <= 20) {
            return 'B';
        } else if (numero > 20 && numero <= 30){
            return 'C';
        } else {
            return 0;
        }
    }
}
