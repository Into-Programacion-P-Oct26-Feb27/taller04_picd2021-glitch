/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        // TODO code application logic here
        
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double preciospotify;
        double precioNetflixd;
        double precioYoutubed;
        double precioDropboxd;
        double preciospotifyd;
        double costoMensual;
        double ahorroMensual;
        double pagar;
        
        int descuentoN;
        int descuentoY;
        int descuentoD;
        int descuentoS;
        
        descuentoN = 23;
        descuentoY= 23;
        descuentoD = 45;
        descuentoS = 0;
        
        String nombre;
        
        System.out.println("Ingrese su nombre completo: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el costo de netflix");
        precioNetflix = entrada.nextDouble(); 
        System.out.println("Ingrese el costo de Youtube");
        precioYoutube = entrada.nextDouble();
        System.out.println("Ingrese el costo de DropBox");
        precioDropbox = entrada.nextDouble();
        System.out.println("Ingrese el costo de Spotify");
        preciospotify = entrada.nextDouble();
        
        costoMensual = precioNetflix + precioYoutube+ 
                precioDropbox +preciospotify;
        
        precioNetflixd = precioNetflix *(descuentoN)/100;
        precioYoutubed = precioYoutube *(descuentoY)/100;
        precioDropboxd = precioDropbox*(descuentoD)/100;
        preciospotifyd = preciospotify*(descuentoS/100);
        
        ahorroMensual = precioNetflixd + precioYoutubed + precioDropboxd +
                                preciospotifyd;
        pagar = costoMensual - ahorroMensual;
        
        System.out.printf("Nombre del cliente: %s\nPrecio netflix: %f\n"
                + "Precio Youtube: %.2f\nPrecio Dropbox: %.2f\n"
                + "Precio Spotify: %.2f\nDESCUENTOS SERVICIOS\n"
                + "netflix: %.2f\n"
                + "Youtube: %.2f\nDropbox: %.2f\n"
                + "Spotify: %.2f\n"
                + "Costo mensual sin descuentos: %.2f\nAhorro mensual: %.2f\n"
                + "Precio con descuentos: %.2f",
                nombre,
                precioNetflix,
                precioYoutube,
                precioDropbox,
                preciospotify,
                precioNetflixd,
                precioYoutubed,
                precioDropboxd,
                preciospotifyd,
                costoMensual,
                ahorroMensual,
                pagar);
        
        
    }
    
}
