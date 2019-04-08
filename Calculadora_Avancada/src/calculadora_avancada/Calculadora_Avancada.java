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
        String strTexto;
        char[] chTexto;
        String strnumeros1, strnumeros2;
        double dnumeros1, dnumeros2;
        
        strTexto = "2524 + 2000";
        chTexto = strTexto.toCharArray();
        
        int limite1=0, limite2=0, guardar;
        boolean segundo = false;
        
        int i=0;
        while(i<strTexto.length()){
            System.out.println( i + "  " + chTexto[i] + " ");
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
            JOptionPane.showMessageDialog(null, "Não são doubles");
            return;
        }
        
        
        
        
        System.out.println("Limite1 : " + limite1 + "\nLimite2: " + limite2);
        System.out.println("Numeros1 : " + strnumeros1 + "\nNumeros2: " + strnumeros2);
        
        switch(chTexto[(limite1+1)]){
            case '+':
                //System.out.println("Resultado da soma: " + Adicao.somar(dnumeros1);
                break;
            case '-':
                break;
            case '*':
                break;
            case '/':
                break;
            default: 
                break;             
        }
        
    }
    
}
