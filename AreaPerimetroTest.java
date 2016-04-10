package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AreaPerimetroTest<Perimetro> {

	@Test
	public void testQueCalculaPerimetroDeTriangulo() {
		Triangulo miTriangulo = new Triangulo;
		Double resultadoEsperado = 15.0;
		Double resultadoObtenido = miTriangulo.perimetro;
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testQueCalculaAreaDeTriangulo() {
		Triangulo miTriangulo = new Triangulo;
		Double resultadoEsperado = 10.82;
		Double resultadoObtenido = miTriangulo.area;
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
