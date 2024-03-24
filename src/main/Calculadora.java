package main;

/**
 * @author Jose Gustavo
 * @version 1.0
 * @since release 1.0 da aplicação
 */
public class Calculadora {
    /**
     *
     * @param a primeiro valor utilizado para soma
     * @param b segundo valor utilizado para soma
     * @return o resultado da soma
     *
     */
    public int somar(int a, int b){
        return a + b;
    }

    /**
     *
     * @param a primeiro valor utilizado para subtrair
     * @param b segundo valor utilizado para subtrair
     * @return resultado da subtração
     */
    public int subtrair(int a, int b){
        return a - b;
    }

    /**
     *
     * @param a primeiro valor utilizado para multiplicar
     * @param b segundo valor utilizado para multiplicar
     * @return resultado da multiplicação
     */
    public int multiplicar(int a, int b){
        return a * b;
    }

    /**
     *
     * @param a primeiro valor utilizado para dividir
     * @param b segundo valor utilizado para dividir
     * @return resultado da divisão
     */
    public int dividir(int a, int b){
        /**
         * verifica se a base da divisão é zero, se for retorna 0
         */
        if(b == 0)
            return 0;
        return a / b;
    }
}
