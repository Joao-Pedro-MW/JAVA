/**
O programa lê 5 valores e diz qual deles é o maior
 **/
package javatestes;
import java.util.Scanner;
public class Maior5 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int v1;
        int x = 0;
        for (int cont = 1;cont <=5;cont++){
            System.out.println("Infome o valor");
            v1 = valor.nextInt();
            if (v1>x){
                x = v1;    
            }  
        }
    System.out.println("O maior valor é "+x);
    }
}
