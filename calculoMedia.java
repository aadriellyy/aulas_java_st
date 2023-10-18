import java.util.Scanner;

public class calculoMedia {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        
        System.out.println(media);
        
        s.close();
    }
}
