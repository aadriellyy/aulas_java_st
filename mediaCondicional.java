import java.util.Scanner;

public class mediaCondicional {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();
        double nota3 = s.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        String resultado = String.format("%.2f", media);
        
        if(media >= 5){
            System.out.println("Parabéns, você foi aprovado! Sua média foi: " + resultado);
        }else{
            System.out.println("Que pena, você reprovou! Sua média foi: " + resultado);
        }
        
        
        s.close();
    }
}
