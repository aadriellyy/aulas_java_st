import java.util.Scanner;
public class mostraString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String[] palavra = {"a","b","a","c","a","t","e"};
        int size = palavra.length;

        for(int i=0; i < size; i++){
            System.out.println(palavra[i]);
        }

        s.close();
    }
}
