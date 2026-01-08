import java.util.Scanner;

public class contadorCalorias {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        float [] caloras = new float [5];
        
        float total = 0;
        float menor = 0;
        float maior = 0;

        for (float i = 0; i < 5; i++){
            System.out.println("Digite a quantidade de calorias: " + i + 1 + ":");
            calorias[i] = leitor.nextFloat();
            total += calorias[i];

            if (i == 0){
                menor = calorias[i];
                maior = calorias[i];
            } else {
                if (calorias[i] > maior){
                    maior = calorias[i];
                } 
                if (calorias[i] < menor){
                    menor = calorias[i];
                }
            }
        }
        System.out.println("A quantidade total de calorias consumidas no total foram " + total +);
        System.out.println("A maior quantidade de calorias consumidas foi de " + maior +);
        System.out.println("A menor quantidade de calorias consumidas foi de " + menor +);
        leitor.close();
    }
}


calorias = [0] * 5
total = 0;
menor = 0;
maior = 0;

for i in range (5): 
  calorias[i] = float(input(f"Digite a quantidade de calorias: {i + 1}"))
  total += calorias[i]

  if i == 0:
    maior = calorias[i]
    menor = calorias[i]
  else:
    if calorias[i] > maior:
      maior = calorias[i]

    if calorias[i] < menor:
      menor = calorias[i]

print(f"A quantida total de calorias foi de: {total}")
print(f"A menor quantidade de calorias foi de: {menor}")
print(f"A maior quantidade de calorias foi de: {maior}") 
