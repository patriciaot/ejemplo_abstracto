/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_abstracto;

/**
 *
 * @author patriciaortiz
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Perro perro = new Perro("Snoopy");
    Gato gato = new Gato ("Cheto");
    
    perro.imprimirNombre();
    perro.sonido();
    
    gato.imprimirNombre();
    gato.sonido();
    
    }
    
}//Test
