
package javatestes;
import java.util.Scanner;
public class Compras {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        float compras_mes = 0;
        float compras = 0;
        double soma_compras = 0;
        System.out.println("Quantas compras você fez neste mês? ");
        compras_mes = valor.nextFloat();
        for (int cont = 1;cont <= compras_mes; cont++) {
            System.out.println("Digite o valor da "+ cont +"° compra");
            compras = valor.nextFloat();
            soma_compras = soma_compras + compras;
        } 
            if (soma_compras <= 1000){
            soma_compras = soma_compras - (soma_compras * 0.10);
            System.out.println("O valor das compras do mês é de: "+ soma_compras );
            } else {
            soma_compras = soma_compras + (soma_compras * 0.05);
            System.out.println("O valor das compras do mês é de: "+ soma_compras );
            }
    }  
}
