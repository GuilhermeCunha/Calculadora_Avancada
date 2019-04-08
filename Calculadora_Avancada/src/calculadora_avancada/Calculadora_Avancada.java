/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_avancada;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Calculadora_Avancada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //Básico:
        Adicao adicao = new Adicao();
        Subtracao subtracao = new subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        //Avançado:
        Raiz raiz = new Raiz();
        Logaritmo logaritmo = new Logaritmo();
        Exponencial exponencial = new Exponencial();
        Porcentagem porcentagem = new Porcentagem();
        */
        
        String strTexto;
        char[] chTexto;
        String strnumeros1, strnumeros2;
        double dnumeros1, dnumeros2;
        strTexto = JOptionPane.showInputDialog("Digite o que pretende calcular: \n");
        chTexto = strTexto.toCharArray();
        
        int limite1=0, limite2=0, guardar;
        boolean segundo = false;
        
        int i=0;
        while(i<strTexto.length()){
            if(chTexto[i] == ' '){
                guardar = i;
                if(!segundo){
                    limite1 = guardar;
                    segundo = true;
                }
                if(segundo && guardar!=limite1){
                    limite2 = guardar;
                }
            }
            i++;
        }
        strnumeros1 = strTexto.substring(0,(limite1));
        strnumeros2 = strTexto.substring((limite1+2),strTexto.length());
        try{
            dnumeros1 = Double.parseDouble(strnumeros1);
            dnumeros2 = Double.parseDouble(strnumeros2);
        }catch(NumberFormatException e){
            return;
        }
        
        
        
        
        //System.out.println("Limite1 : " + limite1 + "\nLimite2: " + limite2);
        //System.out.println("Numeros1 : " + dnumeros1 + "\nNumeros2: " + dnumeros2);
        
       /*
        switch(chTexto[(limite1+1)]){
            case '+':
                System.out.println("Resultado da soma: " + adicao.somar(dnumeros1, dnumeros2));
                break;
            case '-':
                System.out.println("Resultado da subtração: " + subtracao.subtrair(dnumeros1, dnumeros2));
                break;
            case '*':
                System.out.println("Resultado da multiplicação: " + multiplicacao.multiplicar(dnumeros1, dnumeros2));
                break;
            case '/':
                System.out.println("Resultado da divisão: " + divisao.dividir(dnumeros1, dnumeros2));
                break;
            case 'v':
                System.out.println("Resultado da raiz quadrada: " + raiz.raizQuadrada(dnumeros1, dnumeros2));
                break;
            case 'l':
                System.out.println("Resultado desse logaritmo: " + logaritmo.logaritmo(dnumeros1, dnumeros2));
                break;
            case '^':
                System.out.println("Resultado dessa exponenciação: " + exponencial.exponencial(dnumeros1, dnumeros2));
                break;
            case '%':
                System.out.println("Resultado dessa porcentagem: " + porcentagem.porcentagem(dnumeros1, dnumeros2));
                break;
            default: 
                break;             
        }
        */
        
    }
    
}
