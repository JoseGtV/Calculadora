package testes;

import main.Calculadora;

/**
 * @author Jose Gustavo
 * @version 1.0
 * @since release 1.0 da aplicação
 */

public class SomaTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        /**
         *1º Cenário soma: dois numeros inteiros
         */
        int somar = calc.somar(3, 7);
        System.out.println(somar);


        /**
         * 2º Cenário soma: dois numeros sendo um deles negativo
         */
        somar = calc.somar(5, -4);
        System.out.println(somar);

        /**
         * 3º Cenário soma: dois numeros sendo um deles igual a zero
         */
        somar = calc.somar(3,0);
        System.out.println(somar);

        /**
         * 4º Cenário soma: dois numeros iguais a zero
         */
        somar = calc.somar(0,0);
        System.out.println(somar);

        /**
         * 5º Cenário soma: dois numeros negativos
         */
        somar= calc.somar(-3,-3);
        System.out.println(somar);
    }
}