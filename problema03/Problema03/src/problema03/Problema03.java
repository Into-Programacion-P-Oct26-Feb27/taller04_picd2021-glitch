/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        // TODO code application logic here
        
        String nombre;
        String direccion;
        double costoPorMinuto;
        int minutosConsumidos;
        double totalPagar;
        
        System.out.println("Ingrese su nombre completo");
        nombre = entrada.nextLine();   
         System.out.println("Ingrese su dirección");
        direccion = entrada.nextLine(); 
        
        System.out.println("Ingrese el valor de su tarifa:");
        costoPorMinuto = entrada.nextDouble();
        System.out.println("Ingrese los minutos consumidos");
        minutosConsumidos = entrada.nextInt();        
        
        totalPagar = costoPorMinuto*minutosConsumidos;
        
        System.out.printf("PLANILLA DE SERVICIO TELEFÓNICO\nTitular: %s\n"
                + "Dirección: %s\nCosto por minuto:%s\nMinutos consumidos: %s\n"
                + "Valor total a pagar %s",
                nombre,
                direccion,
                costoPorMinuto,
                minutosConsumidos,
                totalPagar);

                
        
    }
    
}
