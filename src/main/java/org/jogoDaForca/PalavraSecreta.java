package org.jogoDaForca;

import java.util.Random;

public class PalavraSecreta {
    private final String[] palavras = {
            "computador", "java", "programacao", "teclado", "monitor",
            "internet", "codigo", "algoritmo", "desenvolvedor", "sistema",
            "software", "hardware", "rede", "banco", "dados",
            "memoria", "processador", "tecnologia", "conexao", "usuario",
            "senha", "robotica", "inteligencia", "artificial", "nuvem",
            "seguranca", "criptografia", "login", "servidor", "terminal",
            "interface", "bug", "erro", "depuracao", "execucao",
            "objeto", "classe", "método", "variavel", "estrutura",
            "forca", "string", "vetor", "array", "loop",
            "condicao", "while", "switch", "case", "return"
    };

    private String palavra;

    public PalavraSecreta() {
        Random rand = new Random();
        palavra = palavras[rand.nextInt(palavras.length)];
    }

    public String getPalavra() {
        return palavra;
    }
}