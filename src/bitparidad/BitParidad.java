
package bitparidad;

import java.util.ArrayList;
import java.util.Scanner;




public class BitParidad {

      
   
    public static void main(String[] args) {
        
        StringBuilder a;        
        String cadenaIngresado;
        

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingese un num booleano");
        
        cadenaIngresado = teclado.nextLine();                       
        
        a = paridad(cadenaIngresado);
       
        System.out.println(a);
                     
    }  


    public static StringBuilder paridad(String r){
        
       int i = 0; 
       StringBuilder p;
       
       char[] aCaracteres = r.toCharArray();     
            
       
       if (esBoolean(aCaracteres)){           
            String q = new String(aCaracteres); 
                     
           for (char x: aCaracteres){               
               if(x == '1'){
                        i++;
               }              
           }
           
           if(i%2==0){
                            
               p = new StringBuilder(q);
               
               return  p.append('0');
               
           }else 
                              
               p = new StringBuilder(q);
               
                    return  p.append('1');       
           
       }else {
           
           
           return new StringBuilder("No es un num Booleano");
                     
       }
   
    }
    
    public static boolean esBoolean(char[] ingresado){
            
     boolean check = true;    
          
        for (char x: ingresado){
            if(x != '0' && x != '1') { 
                check =  false;                                           
            }
        }
        
    return check;
    }
    
}
