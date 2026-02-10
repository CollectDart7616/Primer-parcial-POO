/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author israe
 */
public class PreExamen_Solucion {
    public static void main(String[] args) {
    int n1,n2,n3,n4,n5;
    int Pro;
    double Pot;
    float prom; 
    Scanner leer = new Scanner(System.in);

    System.out.println("Escribe 5 numeros: ");
    n1 = leer.nextInt();
    n2 = leer.nextByte();
    n3 = leer.nextByte();
    n4 = leer.nextByte();
    n5 = leer.nextByte();
    Pro = n1*n2*n3;
    Pot = Math.pow(n4, 5);
    prom = (n5+n4+n3);
    JOptionPane.showMessageDialog(null,"Producto: " + Pro + "\n" + "Potencia " + Pot + "\n" + "Promedio: " + prom);
    }
}
