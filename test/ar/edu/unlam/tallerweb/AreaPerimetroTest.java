package ar.edu.unlam.tallerweb;

import org.junit.Assert;
import org.junit.Test;

public class AreaPerimetroTest<Perimetro> {

	@Test
	public void testQueCalculaPerimetroDeTriangulo() {
		Triangulo miTriangulo = new Triangulo();
		Double resultadoEsperado = 15.0;
		Double resultadoObtenido = miTriangulo.perimetro(5.0);
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testQueCalculaAreaDeTriangulo() {
		Triangulo miTriangulo = new Triangulo();
		Double resultadoEsperado = 20.0;
		Double resultadoObtenido = miTriangulo.area(5.0,8.0);
		Assert.assertEquals(resultadoEsperado, resultadoObtenido);
	}

}

