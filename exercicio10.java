import java.util.Scanner;

public class Contas{
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o seu primeiro numero: ");
        int numero1 = leitor.nextInt();

        System.out.println("Digite seu segundo numero: ");
        int numero2 = leitor.nextInt();

        System.out.println("Digite um numero real: ");
        float numero3 = leitor.nextFloat();

        soma = (numero1 * 2) + (numero2 / 2);
        triplo = (numero1 * 3) + numero3;
        quadrado = numero3 ** 2;

        System.out.println("O produto do dobro do primeiro com metade do segundo é " + soma);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + triplo.2f);
        System.out.println("O terceiro elecado ao cubo é " + quadrado.2f);
    }
}

numerointeiro = int(input("Escreva seu primeiro numero: "))
segundointeiro = int(input("Escreva seu segundo numero: "))
numeroreal= float(input("Escreva seu numero real: "))
soma = (numerointeiro * 2) + (segundointeiro / 2)
triplo = (numerointeiro * 3) + numeroreal
quadrado = numeroreal ** 2
print(f"O produto do dobro do primeiro com metade do segundo e: {soma}")
print(f"A soma do triplo do primeiro com o terceiro é: {triplo}")
print(f"O terceiro elevado ao cubo é: {quadrado}")
