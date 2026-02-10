package Clases;

import javax.swing.JOptionPane;

public class Programa3 {
    private static String nombre = "120";//Cadena de caracteres
    private static float estatura;
    private static char sexo;
    private static int edad;
    
    public static void main(String[] args) {
    // 3 formas de leer datos
   nombre = JOptionPane.showInputDialog("Escribe el nombre");
   //casting conversion implicita y/o Explicita
   estatura = Float.parseFloat(JOptionPane.showInputDialog("Escribe la estatura"));
   sexo = JOptionPane.showInputDialog("Escribe el sexo de la persona").charAt(0);
   edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad de la persona"));
   
   JOptionPane.showMessageDialog(null, "El nombre es: " +nombre+"\n" + "Y su estatura es:" + estatura + "\n" + "el sexo es:" + sexo + "\n" + "y su edad es:" + edad);
    }
}
