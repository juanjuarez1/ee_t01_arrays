/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t01_arrays;

/**
 *
 * @author Juan Antonio Juarez Olivera
 */
import java.io.*;
public class Ee_t01_arrays {
	static int num[];
	public static void orden(int []a){
    	int aux;
     for(int i=0; i<num.length; i++){
    	 for(int j=i+1; j<num.length; j++){
    		if(num[i]<num[j]){
    			aux=num[i];
    			num[i]=num[j];
    			num[j]=aux;
    		}
    	 }
     }
     for(int y=0; y<num.length; y++){
    	 System.out.println(num[y]);
     }
    }
	 public static void main(String [] args)throws FileNotFoundException, IOException{
	      String texto;
		  String archivo=("C://Users//JUAREZ//Desktop//ee_t01_arrays//src//Documentos//Numeros.txt"); //crea un txt con los numeros del 6 al 1(6,5,4,3,2,1 vertical) mi ruta fue el escritorio por eso dice desktop en mi disco c mete el txt dentro de tu proyecto donde esta tu clase we y copias la ruta para que lo lea
		  
                         // "C://Users//JUAREZ//Desktop//ee_t01_arrays//src//Documentos//Numeros.txt"
                  System.out.println("Entrada\n");
		  FileReader f=new FileReader(archivo);
		  BufferedReader b=new BufferedReader(f);
		  texto=b.readLine();
		  System.out.println(texto);
		  Integer tamano=Integer.parseInt(texto);
		  num=new int[tamano];
		    Integer a=0;
		  while((texto=b.readLine())!=null){
			  System.out.println(texto);
			 int dato=Integer.parseInt(texto);  
			  if(num[a]<tamano){
				  num[a]=dato;
			 }
			  a++;	 
		  } 		  
		  b.close();
		 
		  
		  System.out.println("\nSalida\n");
		  orden(num);
	 }
}