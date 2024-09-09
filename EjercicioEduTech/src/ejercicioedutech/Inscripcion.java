/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioedutech;

/**
 *
 * @author pulie
 */
public class Inscripcion {
    //01 declarar atributos (caracteristicas)
    private String rutEstudiante;
    private int numInscripcion, numAsignaturas;
    private Asignatura asignatura;
    
    //02 declarar constructor con o sin argumentos
    //Es una buena práctica inicializar tus atributos en el constructor 
    //para garantizar un estado consistente del objeto.
    public Inscripcion(){
        
    }
    
    public Inscripcion(Asignatura asignatura,String rutEstudiante, int numInscripcion, int numAsignaturas){
        this.asignatura = asignatura;        
        this.numInscripcion = numInscripcion;
        this.rutEstudiante = rutEstudiante;
        this.numAsignaturas = numAsignaturas;
    }
    
    //03 getter and setter
    public Asignatura getAsignatura() {
        return asignatura;
    }
    
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    public int getNumInscripcion(){
        return numInscripcion;
    }
    
    public void setNumInscripcion(int numInscripcion) {
        this.numInscripcion = numInscripcion;
    }
    
    public String getRutEstudiante(){
        return rutEstudiante;
    }
    
    public void setRutEstudiante(String rutEstudiante) {
        this.rutEstudiante = rutEstudiante;
    }
    
    public int getNumAsignaturas(){
        return numAsignaturas;
    }
    
    public void setNumAsignaturas(int numAsignaturas) {
        this.numAsignaturas = numAsignaturas;
    }
    
    //04 Metodos
    public void mostrarAtributos(){
       System.out.println("Inscripciones");
       System.out.println(this.asignatura);
       System.out.println(this.numInscripcion);
       System.out.println(this.rutEstudiante);
       System.out.println(this.numAsignaturas);
    
   }
    
    public void listarInscripcion(){
        System.out.println("Nº Inscripción:" + this.numInscripcion);
        System.out.println("Asignatura: " + this.asignatura.getNombre());
        System.out.println("Estudiante:" + this.rutEstudiante);
        System.out.println("Créditos:" + this.asignatura.getCreditos());
    }
    
    public boolean validarInscripcion(int numInscrip, String rutEstud){
        boolean flag = false;
        if (numInscrip ==  this.numInscripcion && this.rutEstudiante.equals(rutEstud)) {
            flag = true;
        } 
           return flag;
    }
    
    public int calcularPago(){
        int montoBruto = this.asignatura.getCosto() * this.asignatura.getCreditos();
        return montoBruto;
    }
    
    public double aplicarDescuento(){
        double montoDesc = 0;
        if (this.asignatura.getCreditos() > 6) {
            montoDesc =  calcularPago() * 0.15;
        }
        return montoDesc;
    }
    
    public void imprimirEstadoInscripcion(){
        this.listarInscripcion();
        System.out.println("Costo por crédito: $" + calcularPago());
        System.out.println("Total a pagar: $" + (calcularPago() - aplicarDescuento()) );
    }
}
