import java.util.Random;

public class arrayAletorios {
    public static void main(String[] args){
        Random rand = new Random();
        int total = 100;
        int[] aleatorios = new int[10];
        int size = aleatorios.length;       
     
        for(int i=0; i < size; i++){
            int totalAleatorios = rand.nextInt(total);
            aleatorios[i] = totalAleatorios;

        }

        int maior = 0;
        int menor = 100;

        for(int i=0; i < size; i++){
            if(aleatorios[i] > maior){
                maior = aleatorios[i];
            }
            if(aleatorios[i] < menor){
                menor = aleatorios[i];
            }
        }

        System.out.println("O maior número da lista é: " + maior);
        System.out.println("O menor número da lista é: " + menor);


    }
}
