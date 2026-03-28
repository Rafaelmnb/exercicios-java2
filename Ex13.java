import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();

        int letras = 0, espacos = 0, numeros = 0, outros = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (c == ' ') {
                espacos++;
            } else {
                outros++;
            }
        }

        System.out.println("Letras:  " + letras);
        System.out.println("Espacos: " + espacos);
        System.out.println("Numeros: " + numeros);
        System.out.println("Outros:  " + outros);

        sc.close();
    }
}
