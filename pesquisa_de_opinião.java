
package javatestes;

import java.util.Scanner;

/**Cada espectador de um cinema respondeu a
um questionário no qual 
constava sua idade e a sua opinião em relação ao filme: 
ótimo - 3,          bom - 2,            regular - 1.
 Faça um Programa que receba a idade e a opinião de 10 
espectadores, calcule e imprima:
a) a média das idades das pessoas que responderam ótimo;
b) a quantidade de pessoas que responderam regular;
c) a porcentagem de pessoas que responderam bom entre
todos os espectadores analisados.
LIVRE – FOR OU WHILE**/
public class pesquisa_de_opinião {
    public static void main(String [] args){
    Scanner novo = new Scanner(System.in);
    int idade;
    int contador = 0;
    byte otimo = 0;
    byte bom = 0;
    byte regular = 0;
    String opiniao;
    float media_otimo = 0;
    float porcentagem;   
        while (contador <= 4) {
            System.out.println("Olá, poderia informar sua idade?");
            idade = novo.nextInt();           
            System.out.println("Qual a sua opinião sobre o filme?");
            System.out.println("Otimo//Bom//Regular");
            opiniao = novo.next();
            opiniao = opiniao.toLowerCase();
                if (opiniao.equals("otimo")){
                    media_otimo += idade;
                    otimo ++;
                }

                if (opiniao.equals("bom")){
                    bom ++;
                }  
            contador ++;
}
    System.out.println("Idade que respondeu ótimo: "+ (media_otimo/otimo));
    porcentagem = (bom*100)/contador ;
    System.out.println("Pessoas que responderam regular: "+ regular);
    System.out.println("Percentual de disseram bom: "+ porcentagem);
}
}
