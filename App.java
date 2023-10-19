public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 9;
        numeros[2] = 4;
        numeros[3] = 10;
        numeros[4] = 14;
        int soma = 0;
        int size = numeros.length;
        
        for (int i = 0; i < size; i++){
            soma += numeros[i];
        }

        System.out.println("A soma total de todos os elementos do array é: " + soma);


    }
}
