/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_abstracto;

/**
 *
 * @author patriciaortiz
 */
public class Gato extends Animal {
    Gato (String nombre){
    super (nombre);
    }
    
    @Override
    public void sonido(){
    System.out.println("Miauuuu!");
    }
    
}
