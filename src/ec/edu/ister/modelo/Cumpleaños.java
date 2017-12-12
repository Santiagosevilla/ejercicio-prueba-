package ec.edu.ister.modelo;
import java.io.*;


class DiaAnyo{ //Iniciamos una clase llamada "diaAnyo".
    private int mes; //Declaramos el atributo mes del tipo private(restringuido).
    private int dia; //Declaramos el atributo dia del tipo private (restringuido).
	 
    public DiaAnyo(int d, int m){ //Inicializamos un constructor de enteros. 
        dia=d; // Añadimos  los valores de la variable "d" a la variable dia.
        mes=m; //Añadimos  los valores de la variable "m" a la variable mes.
    } // Finalizacion  del constructor.
    public boolean igual(DiaAnyo d){ // Metodo de tipo boolean despliega  en pantalla el mes y el dia.
        if((dia == d.dia) && (mes == d.mes)) //En este if se realiza comparaciones de las variables ingresadas  
            return true;//Devuelve un valor si cumple 
        else // Salto de linea 
            return false;//retorna  un valor falso o negativo  si la condicion no se cumple.
	} //Termino  del metodo igual
    public void visualizar(){ //Este metodo nos permite visualizar en consola los datos de las variables
	System.out.println("mes= " + mes + " , dia= " + dia);//Lo que imprimira las siguientes variables 
    } // Termino  del metodo visualizar
} // Termino  de la clase DiaAnyo

public class Cumpleaños{ //En el main esta ubicada esta clase principal 
	public static void main(String[] ar) throws IOException{ //El main permite iniciar el programa
		DiaAnyo hoy; //Declaramos una variable del tipo DiaAnyo con el nombre hoy actual 
		DiaAnyo cumpleanyos; //Declaramos una variable del tipo DiaAnyo con el nombre cumpleanyos
		int d,m; //declaramos dos variables del tipo entero "d""m"
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); //Por la clase BufferedReader podemos ingresar datos por consola y lo almacenamos en una variable llamada "entrada"
		System.out.print("Introduzca fecha de hoy, dia: "); //Añadimos  el dia de hoy
		d=Integer.parseInt(entrada.readLine()); //Almacenamos el valor a ingresar en la variable "d" mediante un casting que nos permite hace un cambio de tipo de variables 
		System.out.print("Introduzca el numero del mes: "); //Ingresamos el mes en que estamos
		m=Integer.parseInt(entrada.readLine()); //Almacenamos el valor a ingresar en la variable m mediante un casting que nos permite hace un cambio de tipo de variables
		
		hoy = new DiaAnyo(d,m); //  Llamado a la variable hoy
		
		System.out.print("Introduzca la fecha de nacimiento, dia: "); // Introducimos la fecha de nacimiento 
		d=Integer.parseInt(entrada.readLine());
		System.out.print("Introduzca el numero del mes: "); // Introducimos el mes
		m=Integer.parseInt(entrada.readLine());
		
                cumpleanyos = new DiaAnyo(d,m); // Hacemos un llamado a la variable cumpleanyos 
		
		System.out.print(" La fecha de hoy es: "); 
		hoy.visualizar(); // Visualizar los datos contenidos en la variable hoy mediante el metodo visualizar
		System.out.print(" Su fecha de nacimiento es: ");//su fecha de nacimiento 
		cumpleanyos.visualizar(); //  Visualizar los datos contenidos en la variable hoy mediante el metodo visualizar
		
		if(hoy.igual(cumpleanyos)) //Realiza una comparacion si la fecha ingresada es igual a la fecha del cumpleaños
			System.out.println(" Feliz Cumpleaños ! "); //Si es igual se despliega un mensaje de feliz cumpleaños
		else
			System.out.print(" Feliz dia ! "); // Si es falso se desplegara un mensaje de Feliz dia
	} //Termino  del metodo principal
} //Termino de la class
