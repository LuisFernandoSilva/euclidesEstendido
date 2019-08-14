/**
 * O RSa consiste de duas chaves uma publica e uma privada.
 * a chave publica usa dois numeros um modulo e um expoente, 
 * Ja a privada usa o mesmo modulo e um expoente privado. 
 * Nessa classe se passara os parametros pra as classes correspondentes
 * fazerem seus calculos
 **/
package eucliedesEstendido.controller;

import euclidesestendido.model.ChavePublica;
import euclidesestendido.model.EuclidesEstendido;
import eucliedesEstendido.view.JFEuclidesEstendido;
import java.util.Scanner;

/**
 * Trabalho de grau A: Criptogradia RSA - uso do Euclides Estendido.
 * Instituição: Ftec faculdades integradas.
 * Disciplina:Segurança em desenvolvimento de sistemas de informação
 * Professor:Carlos Alfredo Weissheimer Junior
 * 
 * 
 * 
 * @author: Luis Fernando da Silva
 * @since : 13/04/2018
 * @version :1.1
 */
public class Main {
    /**
     * Clase que inicia a aplicaçao para o usuario.
     */   
    private static JFEuclidesEstendido tela;
    public static void main (String[] args){ 
        
       tela = new JFEuclidesEstendido();
       tela.setLocationRelativeTo(null);
       tela.setVisible(true);
    

             
    }

}