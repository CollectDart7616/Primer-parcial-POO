/*

Hacer un programa que pida 5 numeros enteros positivos,
esto quiere decir que no se pueden almacenar numeros negativos,
a continuacion se realizaran las siguientes operaciones,
1. se calculara la multiplicacion de los primeros 3 numeros 
2. se elevara el cuarto numero a la potencia del 5to
3. se calculara el promedio de los ultimos 3 numeros.


los resultados de cada operacion, se mostraran en un solo mensaje
mediante un JOptionpanel
 */
package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PreExamen {
    public static void main(String[] args) {
    byte n1,n2,n3,n4,n5;
    int Pro;
    double Pot;
    float prom; 
    Scanner leer = new Scanner(System.in);
    BufferedReader escribir = new BufferedReader (new InputStreamReader(System.in));

    System.out.println("Escribe el primer numero: ");
    n1 = leer.nextByte();
    n2 = leer.nextByte();
    n3 = leer.nextByte();
    n4 = leer.nextByte();
    n5 = leer.nextByte();    
    }
    
}
