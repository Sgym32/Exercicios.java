import java.util.Scanner;
public class Media {
    public static void main (String [] args){
     Scanner leito = new Scaner (System.in);

     System.out.println ("Escreva sua nota: ");
     float nota1 = leito.nextFloat();

     System.out.println ("Escreva sua segunda nota: ");
     float nota2 = leito.nextFloat();

     System.out.println ("Escreva sua terceira nota: ");
     float nota3 = leito.nextFloat();

     System.out.println ("Escreva sua terceira nota: ");
     float nota4 = leito.nextFloat();

     float media = (nota1 + nota2 + nota3 + nota4)/4
     System.out.println("A media da sua notas e de: " + media);
     leito.close();
    }
}
