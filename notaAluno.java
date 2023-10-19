import java.util.Scanner;

public class notaAluno {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        double[][] alunos = {{231018973, 10, 7, 8},{231018974, 6, 4.3, 5}, {231018945, 5, 6, 2}};
        System.out.println("Informe a sua matrícula para obter a média final:");
        int matricula = s.nextInt();
        int size = alunos.length;
        double total = 0;

        for(int i = 0; i < size; i++){
            if(alunos[i][0] == matricula){
                for(int j = 1; j <= size; j++){
                    total += alunos[i][j];
                }
            }
        }

         double media = (total/3);
         String resultado = String.format("%.2f", media);
         if(media >= 5){
            System.out.println("Parabéns, vocÊ foi aprovado! Sua média final foi: " + resultado);
         }else{
            System.out.println("Poxa, você reprovou! Sua média final foi: " + resultado);
         }

    }
}
