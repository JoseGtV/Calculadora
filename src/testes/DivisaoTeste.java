package testes;

import main.Calculadora;

/**
 * @author Jose Gustavo
 * @version 1.0
 * @since release 1.0 da aplicação
 */

public class DivisaoTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        /**
         * 1º Cenário de divisão: dois numeros inteiros positivos
         */
        int divisao = calc.dividir(3, 7);
        System.out.println(divisao);

        /**
         * 2º Cenário de divisão: dois numeros inteiros
         * 1 positivos
         * 1 negativo
         */
        divisao = calc.dividir(5, -4);
        System.out.println(divisao);

        /**
         * 3º Cenário de divisão: um numero inteiro positivo
         * Um numero igual a zero
         */
        divisao = calc.dividir(3,0);
        System.out.println(divisao);

        /**
         * 4º Cenário de divisão: dois numeros iguais a zero
         */
        divisao = calc.dividir(0,0);
        System.out.println(divisao);

        /**
         * 5º Cenário de divisão: dois numeros inteiros negativos
         */
        divisao= calc.dividir(-3,-3);
        System.out.println(divisao);
    }
}
