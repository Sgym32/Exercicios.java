import java.util.Scanner;

public class Conversor{
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);

        System.out.println("Escreva os gigabytes que deseja converter: ");
        float gigabytes = leitor.nextFloat();
        float megabytes = gigabytes * 1024;
        System.out.println("A conversão de " + gigabytes + "Para megabytes e de " + megabytes);
        leitor.close();
    }
}

gigabytes = float(input("Digite o tamanho do arquivo em gigabytes para converter em megabytes: "))
megabytes = gigabytes * 1024
print(f"{gigabytes} convertido em megabytes fica {megabytes}!")
