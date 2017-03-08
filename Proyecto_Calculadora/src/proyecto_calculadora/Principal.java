/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_calculadora;

import java.util.Scanner;

/**
 *
 * @author Zeizz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora miCalculadora=new Calculadora();
        
        
        Terminal miTerminal=new Terminal();
        miTerminal.calculadoraTerminal=miCalculadora;
        
        Scanner miEscaner=new Scanner(System.in);
        System.out.println("Seleccione la operacion");
        miTerminal.imprimir();
        miTerminal.op=miEscaner.nextInt();        
        System.out.println("digite el primer numero");
        miCalculadora.numero1=miEscaner.nextDouble();
        System.out.println("digite el segundo numero");
        miCalculadora.numero2=miEscaner.nextDouble();
        miTerminal.calcular();
        
    }
        
    
}
