package edu.nicolas.primeiraSemana;

public class MinhaClasse {
    public static void main(String[] args) {

        //propiedades
        String primeiroNome = "Nicolas";
        String segundoNome = "Kenzo";
        String[] nomes = {"nicolas", "nkenzo"};
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        float pi = 3.14F;
        double salario = 1277.33;


        //tipagem do java
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // final diz que está variavel não pode ter seu valor alterado
        final double VALOR_DE_PI = 3.14;

        System.out.println(nomeCompleto);
    }

    //falando sobre métodos
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

