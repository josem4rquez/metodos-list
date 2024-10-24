

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MesesETemperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;

        System.out.println("Digite as temperaturas do primeiro semestre do ano");

        do{
            double temperatura = scan.nextInt();

            count++;

        } while(count <= 5);

        List<Meses> primeiroSemestre = new ArrayList<>(){{


        }};

        System.out.println("--\t1 Semestre\t---");

        System.out.print(primeiroSemestre);
        
    }
    
    private static String getMesNome(int mes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        if (mes >= 1 && 6 <= mes) {
            return meses[mes -1];
        }

        return "Mês Invalido";

    }
    
}


class Meses {
    private String nome;
    private double temperatura;

    public Meses(String nome, double temperatura) {
        this.nome = nome;
        this.temperatura = temperatura;
    }

    public String getNome() {
        return nome;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" + 
        "Mês = " + nome + ", temperatura = " + temperatura + "Graus" + "}";

    }

    }

