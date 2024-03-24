package testes;

import main.Calculadora;
/**
 * @author Jose Gustavo
 * @version 1.0
 * @since release 1.0 da aplicação
 */

public class SubtracaoTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        /**
         * 1º Cenário subtração: dois numeros inteiros
         */
        int substracao = calc.subtrair(3, 7);
        System.out.println(substracao);

        /**
         * 2º Cenário subtração: dois numeros sendo um deles negativo
         */
        substracao = calc.subtrair(5, -4);
        System.out.println(substracao);

        /**
         * 3º Cenário subtração: dois numeros sendo um deles igual a zero
         */
        substracao = calc.subtrair(3,0);
        System.out.println(substracao);

        /**
         * 4º Cenário subtração: dois numeros iguais a zero
         */
        substracao = calc.subtrair(0,0);
        System.out.println(substracao);

        /**
         * 5º Cenário subtração: dois numeros negativos
         */
        substracao= calc.subtrair(-3,-3);
        System.out.println(substracao);
    }
}
