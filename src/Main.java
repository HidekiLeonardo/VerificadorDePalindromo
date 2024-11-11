import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============ Bem-Vindo(a) ao verificador de Palíndormos ============");
        System.out.println("\nUm palíndromo é uma palavra, frase ou número que se lê da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda." +
                "\n" +
                "\nExemplos:" +
                "\n" +
                "Palavras: ovo, osso, rotor, radar, reviver\n" +
                "Frases: A roça não tem cão, não tem gato, não tem rato. / Ana, lava lana.");
        System.out.println("\n====================================================================");

        System.out.print("Digite uma palavra ou frase: ");
        String input = scanner.nextLine();

        if (Palindromo(input)) {
            System.out.println("\nA palavra " + input + " é um Palíndromo.");
        } else {
            System.out.println("\nA palavra " + input + " não é um Palíndromo.");
        }


        scanner.close();
    }

    public static boolean Palindromo(String input) {
        String textoLimpo = input.replaceAll("[\\W]", "").toLowerCase();
        String textoReverso = new StringBuilder(textoLimpo).reverse().toString();
        return textoLimpo.equals(textoReverso);
    }

}

