package org.jogoDaForca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            PalavraSecreta palavraSecreta = new PalavraSecreta();
            String palavra = palavraSecreta.getPalavra();
            char[] exibicao = new char[palavra.length()];
            for (int i = 0; i < exibicao.length; i++) {
                exibicao[i] = '_';
            }

            int erros = 0;
            final int MAX_ERROS = 6;
            boolean venceu = false;

            while (erros < MAX_ERROS && !venceu) {
                System.out.println("====================================");
                System.out.println(" Jogo Da Forca ");
                System.out.println("====================================");
                System.out.println("\nPalavra: " + String.valueOf(exibicao));
                System.out.print("Digite uma letra: ");
                String entrada = scanner.nextLine().toLowerCase();

                try {
                    if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                        throw new ExcecaoLetraInvalida("Entrada inválida. Digite apenas uma letra.");
                    }

                    char letra = entrada.charAt(0);
                    boolean acertou = false;

                    for (int i = 0; i < palavra.length(); i++) {
                        if (palavra.charAt(i) == letra && exibicao[i] == '_') {
                            exibicao[i] = letra;
                            acertou = true;
                        }
                    }

                    if (!acertou) {
                        erros++;
                        ForcaGrafico.mostrar(erros);
                    }

                    venceu = String.valueOf(exibicao).equals(palavra);

                } catch (ExcecaoLetraInvalida e) {
                    System.out.println(e.getMessage());
                }
            }

            if (venceu) {
                System.out.println("Parabéns! Você acertou: " + palavra);
            } else {
                System.out.println("Você perdeu! A palavra era: " + palavra);
            }

            System.out.print("\nDeseja jogar novamente? (s/n): ");
            String resposta = scanner.nextLine().toLowerCase();
            jogarNovamente = resposta.equals("s");
        }

        scanner.close();
        System.out.println("Obrigado por jogar!");
    }
}