import java.util.Scanner;

public class Conversor{
    public static void main (String [] args){
        leitor Scanner = new Scanner(System.in);

        System.out.println("Digite o valor que deseja converter para fahrenheit: ");
        float celcius = leitor.nextFloat();

        float fahrenheit = (celcius * 9/5.0f) + 32;
        System.out.println("A conversão de " + celcius + "para fahrenheit e de " + fahrenheit);
        leitor.close();
    }
}

celcius = float(input("Digite os celcius que deseja converter para Fahrenheit: "))
fahrenheit = (celcius * 9/5) + 32
print(f"A conversão de {celcius} para fahrenheit e de {fahrenheit}")
