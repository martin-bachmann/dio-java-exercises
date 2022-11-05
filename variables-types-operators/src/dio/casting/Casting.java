package dio.casting;

public class Casting {
	public static void main(String[] args) {
		// int to long
		// Upcast
		long l;
		int i = 10;
		l = i;
		
		// Downcast		
		i = (int) l;
		
		// float to double
		// Upcast
		double d;
		float f = 10.5f;
		d = f;
		
		// Downcast		
		f = (float) d;
		
		// int to double
		// Upcast
		double d2;
		int i2 = 10;
		d2 = i2;
		
		// Downcast		
		d2 = 10.5;
		i = (int) d2;
	}
}
