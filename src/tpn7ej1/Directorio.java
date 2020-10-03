/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpn7ej1;
import java.util.*;
import java.util.Iterator;
/**
 *
 * @author yo125
 */
public class Directorio {
    
    
    
    private Cliente cliente;
    //private String telefono;
  
   
    private TreeMap< String, Cliente > dir= new TreeMap<>();
    
    public void agregarCliente(String telefono, Cliente c){
    
    
   
    
        dir.put(telefono, c);
        
        System.out.println("El cliente ha sido cargado");
        System.out.println(c);
        System.out.println();
        
       
        
        
        
    
    }
    
    
    public void buscarCliente(String telefono){
     
    if(dir.containsKey(telefono)){
    
        
         System.out.println("El cliente buscado es: " + dir.get(telefono));
         System.out.println();
    }
        
    
    //System.out.println(telefono);
    //System.out.println(dir.keySet());
    
    //for(Map.Entry<String,Cliente> clien: dir.entrySet()){
      //    String clave = clien.getKey();
        //  Cliente valor= clien.getValue();
          
          
          
        // System.out.println("Clave " + clave + " " + "Valor " + valor);
        
        
        
        //}
        
        
    
    }
    
    
    public void borrarCliente(String dni){
    
    Set<String> claves=dir.keySet();
    Iterator <String> it=claves.iterator();
    String key;
            
            
    while (it.hasNext()){
    
    key=it.next();
    
    if (dir.get(key).getDni()==dni){
    
    
        it.remove();
    
       
    }
        
        
    }
    
    System.out.println("El cliente deseado ha sido borrado");
    System.out.println();
    
    }
    
    
    public void buscarTelefono (String apellido){
    
    
    Set<String> claves=dir.keySet();
    Iterator <String> it=claves.iterator();
    String key;
            
     System.out.println("Estos son los numeros de telefonos asociados al apellido ingresado:");       
    while (it.hasNext()){
    
    key=it.next();
    
    
    if (dir.get(key).getApellido().equalsIgnoreCase(apellido)){
    
        
        System.out.println(key);
    
       
    }
    }
    System.out.println();
    }
    
        
    public void buscarClientes (String ciudad){
    
    
    Set<String> claves=dir.keySet();
    Iterator <String> it=claves.iterator();
    String key;
            
     System.out.println("Estos son los clientes asociados a la ciudad ingresada:");        
    while (it.hasNext()){
    
    key=it.next();
    
    
    if (dir.get(key).getCiudad().equalsIgnoreCase(ciudad)){
    
    
        System.out.println(dir.get(key));
    
       
    }
    }
    
    }
    
    
    public void mostrar(){
    
    Set<String> claves=dir.keySet();
    Iterator <String> it=claves.iterator();
    String key;
    
    while (it.hasNext()){
    
    key=it.next();
    
    System.out.println(dir.get(key));
    
    }
    
    System.out.println();
    }
    
    
    
    }
    
    

    
    

