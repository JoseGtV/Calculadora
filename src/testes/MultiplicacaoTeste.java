package testes;

import main.Calculadora;

/**
 * @author Jose Gustavo
 * @version 1.0
 * @since release 1.0 da aplicação
 */

public class MultiplicacaoTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        /**
         * 1º Cenário multiplicação: dois numeros inteiros
         */
        int multiplicacao = calc.multiplicar(3, 7);
        System.out.println(multiplicacao);

        /**
         * 2º Cenário multiplicação: dois numeros sendo um deles negativo
         */
        multiplicacao = calc.multiplicar(5, -4);
        System.out.println(multiplicacao);

        /**
         * 3º Cenário multiplicação: dois numeros sendo um deles igual a zero
         */
        multiplicacao = calc.multiplicar(3,0);
        System.out.println(multiplicacao);

        /**
         * 4º Cenário multiplicação: dois numeros iguais a zero
         */
        multiplicacao = calc.multiplicar(0,0);
        System.out.println(multiplicacao);

        /**
         *5º Cenário multiplicação: dois numeros negativos
         */
        multiplicacao= calc.multiplicar(-3,-3);
        System.out.println(multiplicacao);
    }
}
