import java.util.Scanner;
public class enquantoPar {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número INTEIRO: ");
        int n = s.nextInt();
        int contador = 1;

        do{
            int resto = contador  % 2;
            if(resto == 0){
                System.out.println(contador + " é par!");
            } 
            contador += 1;
        } while (contador <= n);

        for (int i = 1; i <= n; i++ ){
            int par = i  % 2;
            if(par == 0){
                System.out.println(i + " é par!");}
        }     

        s.close();
    }
}
