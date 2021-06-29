
package javatestes;
import java.util.Scanner;
public class RANDON {
  public static void main(String[] args) {
      Scanner valor = new Scanner(System.in);
      String nome;
      String sobrenome;
      String nome_completo;
      System.out.println("Informe seu nome: ");
      nome = valor.next();
      System.out.println("E o seu sobrenome: ");
      sobrenome = valor.next();
      nome_completo = nome + " " + sobrenome;
      System.out.println(nome_completo);
    }
}


