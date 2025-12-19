import java.util.Scanner;

public class Soma {
    public static void main (String [] args){
        
        Scanner leitor = new Scanner (System.in);
       
        System.out.println("Digite o primeiro numero: ");
        int numero1 = leitor.nextInt();

        System.out.println ("Digite o segundo numero: ");
        int numero2 = leitor.nextInt();

        int soma = numero1 + numero2;
        System.out.println("A soma dos numeros e igual a " + soma);
        leito.close();
    }
}
