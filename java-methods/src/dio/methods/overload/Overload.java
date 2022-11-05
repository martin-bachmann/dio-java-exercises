package dio.methods.overload;

public class Overload {
	public static void main(String[] args) {
		float f = 10.5f;
		double d = 10.5;
		
		int i1 = converterParaInteiro(f);
		int i2 = converterParaInteiro(d);
		
		System.out.println(i1);
		System.out.println(i2);
		
		Quadrilatero.area(10);
		Quadrilatero.area(10, 20);
		Quadrilatero.area(20, 10, 10);
	}
	
	public static int converterParaInteiro(float f) {
		return (int) f;
	}
	
	public static int converterParaInteiro(double d) {
		return (int) d;
	}
}
