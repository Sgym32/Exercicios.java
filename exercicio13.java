import java.util.Scanner;

public class contadorCalorias{
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        float [] calorias = new float [7];

        float total = 0; 

        for ( int i = 0; i < 7; i++){
          System.out.println("Digite a quantidade de calorias: " + i + 1 + ":" );
          calorias[i] = leitor.nextFloat();
          total += calorias[i];
        }
        System.out.println("A quantidade total de calorias durante a semana foi de : " + total);    
    }
}

calorias = [0] * 7
total = 0;

for i in range (7):
  calorias[i] = int(input(f"Digite a quantidade de calorias consumidas durante a semana: {i + 1}"))
  total += calorias[i]
print(f"A quantidade total de calorias consumidas durante a semana foram de: {total}")  
