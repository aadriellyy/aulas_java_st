import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int dia = s.nextInt();

        switch(dia){
            case 1:
                System.out.println("Você escolheu o Domingo!");
                break;
            case 2:
                System.out.println("Você escolheu a Segunda-Feira!");
                break;
            case 3:
                System.out.println("Você escolheu a Terça-feira!");
                break;
            case 4:
                System.out.println("Você escolheu a Quarta-feira!");
                break;
            case 5:
                System.out.println("Você escolheu a Quinta-feira!");
                break;
            case 6:
                System.out.println("Você escolheu a Sexta-Feira! Uhul!");
                break;
            case 7:
                System.out.println("Você escolheu o Sábado!");
                break;
            default:
                System.out.println("O valor digitado é inválido. Digite um número entre 1 e 7");
        }

        s.close();
    }
}
