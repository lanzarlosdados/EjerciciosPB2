package ar.edu.unlam.pb2.practica;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestString {

	 @Test
       public void usandoString() {

		          //1.A 
		        //Usando el metodo reverse de proba que el string palindromo se lee igual al derecho que al reves
		        String palindromo = "anitalavalatina";
		        StringBuilder builder= new StringBuilder(palindromo);
		        String palindromoAlReves =builder.reverse().toString(); 


		        assertEquals(palindromo, palindromoAlReves);
		
		        
		      //1.B  
		        String frase = "Do, or do not. There is no try";
		        String contiene = "There";
		        String noContiene = "Yoda";

		        //Existe un metodo que sirve para que lo siguiente de verde. ¿Cuál es?
		        assertTrue(frase.contains(contiene));
		        assertFalse(frase.contains(noContiene));
		        
		      //1.C 
		        //E String indiana tiene 18 posiciones, con que metodo podes comprobarlo?
		        String indiana = "Henry Jones Junior";
		        assertEquals(18, indiana.length());
		        
		        //Comproba que 6 es la posicion de la primer i
		        String palabra = "Otorrinolaringólogo";
		        assertEquals(5, palabra.indexOf('i'));

		        // Y que 12 es de la segunda
		        assertEquals(11, palabra.indexOf('i', 6));
	}

}
