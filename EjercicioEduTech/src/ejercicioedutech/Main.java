/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioedutech;

import java.util.Scanner;

/**
 *
 * @author pulie
 */
public class Main {

    /**
     * @param args the command line ar   guments
     */
    public static void main(String[] args) {
        Asignatura asign = new Asignatura();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese codigo de asignatura: ");
        asign.setCodigoAsignatura(scan.nextInt());
        scan.nextLine();
        System.out.println("Ingrese nombre de asignatura: ");
        asign.setNombre(scan.next());
        
        System.out.println("Ingrese nombre de profesor: ");
        asign.setProfesor(scan.next());
        
        System.out.println("Ingrese numero de creditos: ");
        asign.setCreditos(scan.nextInt());
        
        System.out.println("Ingrese costo de creditos: ");
        asign.setCosto(scan.nextInt());
        scan.close();
        
        Inscripcion insc = new Inscripcion(asign, "18.628.405-4", 6, 18938);
        insc.listarInscripcion();
        System.out.println("Validar inscripcion " + insc.validarInscripcion(insc.getNumInscripcion(), insc.getRutEstudiante()));
        System.out.println("Calcular pago $" + insc.calcularPago());
        System.out.println("Aplicar descuento " + insc.aplicarDescuento());
        insc.imprimirEstadoInscripcion();
    }
    
}
