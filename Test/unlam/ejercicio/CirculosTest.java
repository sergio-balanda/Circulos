package unlam.ejercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculosTest {

	@Test
	public Void CirculosRadioEsDos() {
		Circulos radio = new Circulos();
		assertEquals(radio.circuloResultado().intValue(),2);
	}

}
