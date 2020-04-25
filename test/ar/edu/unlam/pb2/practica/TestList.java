package ar.edu.unlam.pb2.practica;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestList {

	

	@Test
	public void testList() {
		
		
		List<Integer> miLista = new LinkedList<>();
		
		miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        
        
        Integer actual = miLista.size();
        Integer esperado = 8;
        assertEquals(esperado, actual);
	}

}
