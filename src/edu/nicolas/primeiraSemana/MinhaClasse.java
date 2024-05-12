package edu.nicolas.primeiraSemana;

public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Nicolas";
        String segundoNome = "Kenzo";
        String [] nomes = {"nicolas", "nkenzo"};
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

