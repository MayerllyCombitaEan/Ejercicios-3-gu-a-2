/**
 * Write a description of class addTwoNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Vector;

public class Vectores
{
    // instance variables - replace the example below with your own
    private String cadena;
    
    /**
     * Constructor for objects of class desviacion
     */
    public Vectores()
    {
       cadena = "";
       boolean comun = false;
       boolean repetido = false;
       Vector <Integer> vectorC = new Vector(20); 
        
       Scanner teclado = new Scanner(System.in);
       System.out.print("Vector A - Ingrese Números separados por coma:\n ");
       cadena = teclado.nextLine();
       String[] elementosA = cadena.split(",");
       Vector <Integer> vectorA = new Vector(elementosA.length,2);
       
       for(String item : elementosA){
           vectorA.add(Integer.parseInt(item));
        }
       System.out.print("Vector B - Ingrese Números separados por coma:\n ");
       cadena = teclado.nextLine();
       String[] elementosB = cadena.split(",");
       Vector <Integer> vectorB = new Vector(elementosB.length,2);
       for(String item : elementosB){
           vectorB.add(Integer.parseInt(item));
        }
       // int [] b = new int[elementosB.length];
       
       
       for(int i=0; i<vectorA.size(); i++){
           for(int ii=0;ii<vectorB.size();ii++){
               if (vectorA.elementAt(i)==vectorB.elementAt(ii))
               comun = true;
            }
           if(comun==false)
           {
             vectorC.add(vectorA.elementAt(i));
             comun=false;
             repetido=false;
            }
       }
       
       
       //recorriendo vector B
       for(int i=0; i<vectorB.size(); i++){
           for(int ii=0;ii<vectorA.size();ii++){
               if (vectorB.elementAt(i)==vectorA.elementAt(ii))
               comun = true;
                              
            };

            if(comun==false)
               vectorC.add(vectorB.elementAt(i));
            
            comun=false;
            repetido=false;
       
    }
    
    //Order Asc Vector 
    // System.out.print("size c" + vectorC.size());
    // for(int i=0; i<(vectorC.size()-1); i++){
           // for(int ii=0;ii<(vectorC.size()-1);ii++){
               // System.out.print("\nsize c: " + (vectorC.size()-1));
                   // if (vectorC.elementAt(ii)>vectorC.elementAt(ii+1)){
                   // int aux;
                   // aux = vectorC.elementAt(ii);
                   // vectorC.add(ii,vectorC.elementAt(ii+1));
                   // vectorC.add(ii+1, aux);
               // }
            // }       
    // }
    
    System.out.print("\nEl vector C resultante es :\n");
    for(int s=0;s<vectorC.size();s++){
                   System.out.print(vectorC.elementAt(s)+",");
                }
}    
}
