import java.util.Random;

public class arrayOrdenado {
    public static void main(String[] args){
         Random rand = new Random();
        int total = 100;
        int[] aleatorios = new int[10];
        int size = aleatorios.length;       
     
        for(int i=0; i < size; i++){
            int totalAleatorios = rand.nextInt(total);
            aleatorios[i] = totalAleatorios;
        }

        for (int i = 0; i < size-1; i ++){
            for (int j = 0; j < size-1; j ++){
                if(aleatorios[j] > aleatorios[j+1]){
                    aleatorios[j] = aleatorios[j+1];
                    aleatorios[j+1] =  aleatorios[j];
                }
            }
            if(aleatorios[i] > aleatorios[i+1]){
                aleatorios[i] = aleatorios[i+1];
                aleatorios[i+1] =  aleatorios[i];
            }
        }

        for (int i = 0; i < size; i++){
            System.out.println(aleatorios[i] + " ");
        }

    }
}
