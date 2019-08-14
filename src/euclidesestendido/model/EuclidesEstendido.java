/**
 * Algoritmo de euclides estendido.
 * Sejam a e b numeros inteiros positivos e seja d o maximo
 * divisor comum entre a e b. Existem inteiros x e y tal que
 * Aa + Bb = d, assim se os valores que satisfazem o teorema de Bezout e aplicado 
 * o calculo de euclides estendido, tal que A e o inverso modular de a e B e inverso modular 
 * de b, usando isso pra calcular a chave privada.
 * 
 **/
package euclidesestendido.model;
 

 
/**
 * Classe responsavel pelo calculo do Algoritmo de Euclides Estendido
 * Inicia as variaveis x e y pra que tenha igualdades validas, e x2 e y2 suas
 * inversões , a variavel temp guarda os valores para a troca , usando long aqui como o tipo por causa
 * da possibilidade dos valores serem muito grandes.
 */
public class EuclidesEstendido{

     long x = 0, y = 1, x2 = 1, y2 = 0, temp;
    
    /** 
     * Metodo que usa os valores que satisfazem as condições do teorema de bezout e a
     * estensao do euclides pra calcular a chave privada.
     * 
     * @param a o expoente publico escolhido e
     * @param b o modulo n apos o uso da função totiente.
     * @return x2 que o d sendo este o valor da chave privada.
     * 
     */    
    public long calculo(long a, long b){
        //enquanto o b for diferente de 0 o laço ira continuar
        while (b != 0){
            long q = a / b; // o resultado da divisao de a por b 
            long r = a % b;// ira fazer o mod 
            a = b;
            b = r;
            temp = x;//guarda o valor de x antes de iniciar um novo laço
            x = x2 - q * x;//faz o calculo guardando dentro da variavel
            x2 = temp;//ao final do calculo pega o valor antes guardado 
            temp = y;//faz o mesmo com o y guarda antes de iniciar um novo calculo dentro do  laço
            y = y2 - q * y;
            y2 = temp;//ao final do calculo pega o valor antes guardado,  
            //ao final temos os valores pra por na formula Aa+Bb = mdc(a,b), sendo o A o valor pro d nossa chave privada
        }
        //System.out.println("Sua Chave privada: "+ x2);
        return x2;
    }

}
 

