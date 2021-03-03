import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoMRMMTest {

	@Test
	void testArea1() {
		CirculoMRMM circulo = new CirculoMRMM(7, "Circulo");
		assertTrue(circulo.area() == 153.9384);
	}
	
	@Test
	void testArea2() {
		CirculoMRMM circulo = new CirculoMRMM(0, "Circulo");
		assertTrue(circulo.area() == 0.0);
	}
	
	@Test
	void testArea3() {
		CirculoMRMM circulo = new CirculoMRMM(-3, "Circulo");
		// Debería dar 0
		assertTrue(circulo.area() == 0.0);
	}

	@Test
	void testPerimetro1() {
		CirculoMRMM circulo = new CirculoMRMM(7, "Circulo");
		assertTrue(circulo.perimetro() == 43.9824);
	}
	@Test
	void testPerimetro2() {
		CirculoMRMM circulo = new CirculoMRMM(0, "Circulo");
		assertTrue(circulo.perimetro() == 0.0);
	}
	@Test
	void testPerimetro3() {
		CirculoMRMM circulo = new CirculoMRMM(-3, "Circulo");
		// Debería dar 0
		assertTrue(circulo.perimetro() == 0.0);
	}
	
}
