package org.formacion;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class TestIntroduccion {

	
	@Test
	public void test_ordenacion_inversa() {
		
		List<String> nombres = Arrays.asList("Juan", "Antonia", "Pedro");

		// asigna a comparadorLongitud un comparador que ordene los strings
		// segun la longitud de MAYOR a MENOR 
		Comparator<String> comparadorLongitud = Comparator.comparing(String::length).reversed();
		//Comparator<String> comparadorLongitud = (o1,o2) -> o2.length() - o1.length();


		assertNotNull("No has creado aun el comparador",comparadorLongitud);
		
		Collections.sort(nombres,comparadorLongitud);
	
	
		assertEquals("El primer elemento deberia ser Antonia", "Antonia", nombres.get(0));
		assertEquals("El segundo elemnento deberia ser Pedro", "Pedro", nombres.get(1));
		assertEquals("El tercer elemento debeia ser Juan", "Juan", nombres.get(2));
	}
}
