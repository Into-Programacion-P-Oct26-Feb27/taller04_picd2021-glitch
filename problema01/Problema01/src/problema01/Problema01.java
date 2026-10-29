/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        // TODO code application logic here
        
        String gasto1;
        String gasto2;
        String gasto3;
        double valor1;
        double valor2;
        double valor3;
        double gastoMensual;
        
        System.out.println("Ingrese el nombre del proyecto 1:");
        gasto1 = entrada.nextLine();
        System.out.println("ingrese el gasto mensual");
        valor1 = entrada.nextDouble();
        
        System.out.println("Ingrese el nombre de proyecto 2:");
        entrada.nextLine();
        gasto2 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        valor2 = entrada.nextDouble();
        System.out.println("Ingrese el nombre de proyecto 3:");
        entrada.nextLine();
        gasto3 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        valor3 = entrada.nextDouble();
        
        gastoMensual = valor1+valor2+valor3;
        
        System.out.printf("CONTROL DE GASTOS DE PROYECTOS \n%s %.2f\n%s %.2f\n%s"
                + " %.2f\nGASTO MENSUAL TOTAL:\n%s",
                gasto1,
                valor1,
                gasto2,
                valor2,
                gasto3,
                valor3,
                gastoMensual);
               
        
        
    }
    
}
