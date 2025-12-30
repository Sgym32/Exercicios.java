import java.util.Scanner;

public class Conversor{
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite a temperatura que deseja realizar a conversão: ");
        float fahrenheit = leitor.nextFloat();

        float celcius = (fahrenheit - 32) * 5/9.0f;
        System.out.println("A conversão " + fahrenheit + "para celcius e de " + celcius);
    }
}

fahrenheit = float(input("Digite a temperatura que deseja que seja convertido em celcius: "))
celcius = (fahrenheit - 32) * 5/9
print(f"{fahrenheit} convertido em celcius e de {celcius:.1f}C")
