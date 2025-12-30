import java.util.Scanner;

public class calculoSalario{
    public static void main (String []args){
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o valor que voce ganha por hora:");
        float hora = leitor.nextFloat();

        System.out.println("Digite as horas trabalhadas no mes: ");
        float mes = leitor.nextFloat();

        float soma = hora * mes;
        System.out.println("O valor ganho no mes foi de " + soma);
        leitor.close();
    }
}


hora = float (input("Digite o valor que voce ganha por hora: "))
mes = float (input("Digite as horas trabalhadas no mês: "))
soma = hora * mes
print(f"O valor que voce ganhar por mês e de {soma}")
