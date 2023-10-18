import java.util.Scanner;

public class conversorF {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double Celsius = s.nextDouble();
        double Fahrenheit = (Celsius*1.8) + 32;

        System.out.println(Fahrenheit);

        s.close();

    }
}
