/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        // TODO code application logic here
        
        double cpu;
        double teclado;
        double mouse;
        double pantalla;
        double operacional;
        double total;
        double costoAdicional;
        double subtotal;
        String nombre;
        
        operacional = 0.15;
        
        System.out.println("Ingrese su nombre completo: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el costo del CPU/TORRE:");
        cpu = entrada.nextDouble(); 
        System.out.println("Ingrese el costo del teclado:");
        teclado = entrada.nextDouble(); 
        System.out.println("Ingrese el costo del mouse:");
        mouse = entrada.nextDouble(); 
        System.out.println("Ingrese el costo de la pantalla:");
        pantalla = entrada.nextDouble(); 
        
        subtotal = cpu+teclado+mouse+pantalla;
        costoAdicional = subtotal*operacional;
        total = subtotal + costoAdicional;
        
         System.out.printf("Reporte: \nNombres de cliente: %s\n"
                 + "Valores iniciales:\nCPU: %f\nTeclado: %f\nRatón: %f\n"
                 + "Pantalla:%f\n\nCosto base: %f\nCosto adicional del 15%%: %f\n"
                 + "Costo final: %f",
                nombre,
                cpu,
                teclado,
                mouse,
                pantalla,
                subtotal,
                costoAdicional,
                total);
    
               
        
    }
    
}
