public class arrayCores {
    public static void main(String[] args){
        String[] cores = new String[5];

        cores[0] = "Amarelo";
        cores[1] = "Rosa";
        cores[2] = "Púrpura";
        cores[3] = "Azul Turquesa";
        cores[4] = "Lilás";

        int size = cores.length;

        for(int i = 0; i < size; i++){
            System.out.println("A cor na posição "+ i+ " é: " + cores[i]);
        }

    }
}
