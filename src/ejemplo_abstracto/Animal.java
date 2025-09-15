/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_abstracto;

/**
 *
 * @author patriciaortiz
 */
public abstract class Animal {
    private String nombre;
    Animal(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public void imprimirNombre(){
    System.out.println("Mi nombre es: " + this.nombre);
    }
    
    public abstract void sonido();
}
