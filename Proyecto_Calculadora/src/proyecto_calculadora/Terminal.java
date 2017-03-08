/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_calculadora;

/**
 *
 * @author Estudiantes
 */
public class Terminal {
    Calculadora calculadoraTerminal;
    int op=0;
    public void imprimir(){
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
    }
    public void calcular(){    
     switch(op){
         
        case 1:{
            System.out.println("El resultado es:");
            System.out.println(calculadoraTerminal.sumar());       
        }
        break;
        case 2: 
            System.out.println("El resultado es:");
        System.out.println(calculadoraTerminal.restar());
        break;
        case 3:        
        System.out.println("El resultado es:");
        System.out.println(calculadoraTerminal.multiplicar());
        break;
        case 4:
            System.out.println("El resultado es:");
        System.out.println(calculadoraTerminal.dividir());
        break;
    default:
    
    }
    
}
    
}
