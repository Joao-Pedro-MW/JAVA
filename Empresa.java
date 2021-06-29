/**
Os funcionários da empresa  “dois irmãos” receberão 
um reajuste de salário. Construa uma aplicação  que:
a) Informe a quantidade de funcionários 
b) Informe o valor do reajuste (porcentagem) 
c) Informe o valor total de todos os salários 
com reajuste.
 **/
package javatestes;

/**
 *
 * @author JP
 */
import java.util.Scanner;
public class Empresa {
    public static void main(String [] args){
        Scanner novo = new Scanner (System.in);
        int funcionarios;
        int salario;
        int reajuste;
        float salario_reajuste = 0f;
        System.out.println("Quantos funcionários sua empresa possui? ");
        funcionarios = novo.nextInt();
        System.out.println("Informe a porcentagem de reajuste do salario: ");
        reajuste = novo.nextInt();
            for (int cont = 0; cont != funcionarios;cont++){
                System.out.println("Digite o salario do funcionario");
                salario = novo.nextInt();
                salario_reajuste += salario;
             
            }
    salario_reajuste = salario_reajuste + (salario_reajuste * reajuste )/100;
    System.out.println("O salário da empresa com o reajuste é de: ");
    System.out.println(salario_reajuste);
    }
}

