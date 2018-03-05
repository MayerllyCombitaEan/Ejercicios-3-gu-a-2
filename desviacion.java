import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class desviacion
{
    // instance variables - replace the example below with your own
    private String cadena;
    private double desviacion;
    private double sumatoria; 
    private double multiplica;
    /**
     * Constructor for objects of class desviacion
     */
    public desviacion()
    {
       cadena = "";
       desviacion=0;
       sumatoria=0;
       multiplica=0;
       
       Scanner teclado = new Scanner(System.in);
       System.out.print("Ingrese Números separados por coma:\n ");
       cadena = teclado.nextLine();
       String[] elementos = cadena.split(",");
       double [] numeros = new double[elementos.length];
       
       //Let's transform that elements from String to double in order to calculate 
       for(int i=0; i<elementos.length; i++){
           numeros[i] = Double.parseDouble(elementos[i]);
       }
       
       //make summations 
       for(int i=0;i<numeros.length;i++){
           sumatoria=sumatoria+Math.pow((numeros[i]-promedio(numeros)),2);
       }
       
       double dividendo = numeros.length;
       multiplica = 1/(dividendo-1);
       desviacion = multiplica*sumatoria;
       desviacion = Math.sqrt(desviacion);
       
       System.out.print("Tamaño de la muestra:\n "+dividendo +"\n");
       System.out.print("Media Aritmetica:\n "+promedio(numeros)+"\n");
       System.out.print("Desviación Estandar:\n "+desviacion+"\n");
       
       
    }
    public double promedio(double[] base){
        double promedio = 0;
        for(int i=0;i< base.length; i++){

            promedio = promedio+base[i];
        } 
        promedio = (promedio/base.length);
        return promedio;
    }
}