/**
 * Chave publica dentro do RSA e feita escolhendo dois numeros primos de preferencia
 * grandes, que seram identificados por p e q na implementação
 * Apos escolhidos os numeros os multiplica na formula: N= p*q em seguida e aplicada a
 * função tontiente , (p-1)*(q-1).
 * 
 *
 **/
package euclidesestendido.model;


public class ChavePublica {

    long n;
    long x;
    /**
     * Faz o calculo da chave publica usado dois parametros passados pelo 
     * usuario, e retorna o numero calculado.
     * @param q 
     * @param p
     * @return x 
     */
    public long chavePublica(long q, long p){
        n = p*q;
        return n;
    }
     /**
     * Faz o calculo da função totiente usado dois parametros passados pelo 
     * usuario,e retorna o numero calculado.
     * @param q 
     * @param p
     * @return x
     */   
    public long funcaoTotiente(long q, long p){
        x =(p-1)*(q-1);
        return x;
    }

    public long getN() {
        return n;
    }

    public void setN(long n) {
        this.n = n;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }    
    
}
