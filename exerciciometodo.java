import java.util.Scanner;

public class Calculadora {
    public static float somar (float a, float b){
        return a + b;
    } 

    public static void main {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o primeiro numero: ");
        float num1 = leitor.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float num2 = leitor.nextFloat();

        float  resultado = somar(num1, num2);

        System.out.println("O resultado e: " + resultado);
        leitor.close();
    }
}

// função python 

def somar (a, b):
  return a + b

def subtrair (a, b):
  return a - b

def multiplicar (a, b):
  return a * b

def dividir (a, b):
  return a / b 
 
