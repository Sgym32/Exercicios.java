import java.util.Scanner;

public class Conversor {
    public static void main (String []args) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o valor que deseja a conversão");
        int metro = leitor.nextInt();
        int centimetro = metro * 100;
        System.out.println ("A conversão de " + metro + "para centimetro ficou, " + centimetro);
        leitor.close();
    }
}



metro = int(input("Digite quantos metros serão convertidos para centimentros: "))
centimetro = metro * 100
print(f"A conversão de {metro}, para centimetros ficou {centimetro}!")
