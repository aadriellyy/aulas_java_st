import java.util.Scanner; 

public class concatenaString {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String nome = s.nextLine();
        String sobrenome = s.nextLine();
        String concatena = nome + ' ' + sobrenome;
        System.out.println(concatena);


        s.close();
    }
}
