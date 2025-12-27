import java.util.Scanner;

public class Calculo{
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);

      System.out.println("Digite o raio do circulo:");
        float raio = leito.nextFloat();
        float pi = 3.14f;
        float area = pi * raio * raio;
        System.out.println("A area do seu circulo e de " + area );
        leito.close();
    }
}

raio = float(input("Digite o valor raio a ser calculado: "))
pi = 3.14
calculo = raio * pi 
print (f"A area do circulo e de {calculo}")
