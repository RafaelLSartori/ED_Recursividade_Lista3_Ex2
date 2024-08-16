package controller;

public class Ex2 {
    public Ex2(){
        super();
    }
    public int freccontador(int n1, int n2, int cta){
        //A condição de para foi pensada no resultado da divisão, quando chegar a 0, retorna o contador.
        if (n1 == 0){
            return cta;
        }
        //Se o primeiro digitado divido por 10 for igual ao segundo número, o contador aumenta.
        if (n1 % 10 == n2){
            cta++;
        }
        //A chamada da recursiva divide o número por 10 até que ele entre no ponto de parada.
        return freccontador(n1 / 10, n2, cta);
    }
}
