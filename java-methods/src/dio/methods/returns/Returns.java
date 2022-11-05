package dio.methods.returns;

import dio.methods.returns.Quadrilatero;

public class Returns {
	public static void main(String[] args) {
		double areaQuadrado = Quadrilatero.area(10);
		double areaRetangulo = Quadrilatero.area(10, 20);
		double areaTrapezio = Quadrilatero.area(20, 10, 10);
		
		System.out.println("Área do quadrado: " + areaQuadrado);
		System.out.println("Área do retângulo: " + areaRetangulo);
		System.out.println("Área do trapézio: " + areaTrapezio);
	}
}
