import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MetodosLista {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie uma lista e adicione as sete notas: ");
        
        
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);



        System.out.println(notas.toString());
        

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        
        
        System.out.println("Exiba a terceira nota adicionada " + notas.get(2));
        System.out.println(notas.toString());
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        
        System.out.println("Remova a nota 0: ");
        notas.remove(0d); 
        System.out.println(notas);
        
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);
        
        System.out.println("Remova as notas menoras que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);
        
        /* System.out.println("Apague toda a lista");
        notas.clear(); */
        
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
         for (Double nota : notas) System.out.println(nota);

    
   List<Double> notas2 = new LinkedList<>(notas);

   System.out.println("Notas 2 = " + notas2.toString());

   System.out.println("Primeira Nota da Lista Notas2 = " + notas2.get(0));

   notas2.remove(0);

   System.out.println("Remova a primeira nota: " + notas2.toString());

    }
    
}
