/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn7ej1;

/**
 *
 * @author yo125
 */
public class Tpn7Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      // TODO code application logic here
      
      
      Cliente cl1 = new Cliente("Jorge","Torres","San Luis" ,"san juan 2020","2664505590","24557963");
      Cliente cl2 = new Cliente("Antonio","Jofre","San Juan" ,"Rivadavia 1650","2664482071","36551963");
      Cliente cl3 = new Cliente("Jose","Tano","Buenos Aires" ,"San Martin 5010","2664205787","10578365");
      Cliente cl4 = new Cliente("Analia","Rodriguez","Buenos Aires" ,"La Merced 3076","2664385491","23527952");
      Cliente cl5 = new Cliente("Marta","Torres","Cordoba" ,"Lujan 1498","2664793156","7563198");
      Cliente cl6 = new Cliente("Javier","Torres","Rio Negro" ,"Las heras 1178","2664741157","15563198");
      
      Directorio dir1 = new Directorio();
      
      
      dir1.agregarCliente("2664505590", cl1);
      dir1.agregarCliente("2664482071", cl2);
      dir1.agregarCliente("2664205787", cl3);
      dir1.agregarCliente("2664385491", cl4);
      dir1.agregarCliente("2664793156", cl5);
      dir1.agregarCliente("2664793157", cl6);
      
      
      dir1.buscarCliente("2664505590");
      
      
      dir1.borrarCliente("24557963");
      dir1.mostrar();
      
      dir1.buscarTelefono("Torres");
     
      dir1.buscarClientes("Buenos Aires");
      
      
    }
    
    
}
