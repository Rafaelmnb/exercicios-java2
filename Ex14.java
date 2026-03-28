import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final char RESPOSTA_CORRETA = 'c';
        int tentativas = 0;
        boolean acertou = false;

        do {
            tentativas++;

            System.out.println("\n╔══════════════════════════════════════════════════════╗");
            System.out.println("║         QUESTAO DE MULTIPLA ESCOLHA - IHC/UX        ║");
            System.out.println("╚══════════════════════════════════════════════════════╝");
            System.out.println();
            System.out.println("Qual principio de usabilidade se preocupa em manter o");
            System.out.println("usuario sempre informado sobre o que esta acontecendo");
            System.out.println("no sistema por meio de feedback adequado e em tempo real?");
            System.out.println();
            System.out.println("  (a) Controle e liberdade do usuário");
            System.out.println("  (b) Consistência e padrões");
            System.out.println("  (c) Visibilidade do status do sistema");
            System.out.println("  (d) Prevenção de erros");
            System.out.println("  (e) Reconhecimento em vez de memorização");
            System.out.println();
            System.out.print("Tentativa " + tentativas + "/3 - Sua resposta (a/b/c/d/e): ");

            char resposta = sc.next().toLowerCase().charAt(0);

            switch (resposta) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                    if (resposta == RESPOSTA_CORRETA) {
                        acertou = true;
                        System.out.println("\n✔ Resposta correta! (Tentativa " + tentativas + ")");
                    } else {
                        System.out.println("\n✘ Resposta incorreta.");
                    }
                    break;
                default:
                    System.out.println("\nOpcao invalida! Digite apenas a, b, c, d ou e.");
                    tentativas--; // não conta tentativa inválida
            }

        } while (!acertou && tentativas < 3);

        if (!acertou) {
            System.out.println("\nResposta incorreta nas 3 tentativas.");
            System.out.println("A resposta correta era: (c) Visibilidade do status do sistema.");
        }

        sc.close();
    }
}
