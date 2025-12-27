import java.util.Scanner;

public class Quadrado{
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o lado do seu quadrado: ");
        float lado = leito.nextFloat();
        float area = lado * lado;
        System.out.println("A area do seu quadrado e de " + area + "!");
        leitor.close();
    }
}

base = float(input("Digite a base do seu quadrado:"))
area = base * base
dobro = area * 2
print(f"A o dobro da sua area do quadro e de {area}!")
