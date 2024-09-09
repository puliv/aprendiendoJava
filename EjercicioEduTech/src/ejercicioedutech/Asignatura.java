/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioedutech;

/**
 *
 * @author pulie
 */
public class Asignatura {
    //01 declarar atributos (caracteristicas)
    private String nombre, profesor;
    private int codigoAsignatura, creditos, costo;
    
    //02 declarar constructor con o sin argumentos
    //Es una buena práctica inicializar tus atributos en el constructor 
    //para garantizar un estado consistente del objeto.
    public Asignatura(){
        
    }
    
    public Asignatura(String nombre, String profesor, int codigoAsignatura, int creditos, int costo){
        this.nombre = nombre;        
        this.profesor = profesor;
        this.codigoAsignatura = codigoAsignatura;
        this.creditos = creditos;
        this.costo = costo;
    }
    
    //03 getter and setter
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getProfesor() {
        return profesor;
    }
    
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    public int getCodigoAsignatura(){
        return codigoAsignatura;
    }
    
    public void setCodigoAsignatura(int codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }
    
    public int getCreditos(){
        return creditos;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public int getCosto(){
        return costo;
    }
    
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    //04 Metodos
    public void mostrarAtributos(){
       System.out.println("Asignatura");
       System.out.println(this.nombre);
       System.out.println(this.profesor);
       System.out.println(this.codigoAsignatura);
       System.out.println(this.creditos);
       System.out.println(this.costo);
   }
}
