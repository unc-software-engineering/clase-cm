package main.java;

public class Calculadora {

	public int divisionEntera(int i, int j) throws RuntimeException {
		int result;
		try {
			result = i / j;
		} catch (ArithmeticException e) {
			RuntimeException exception = new RuntimeException("Se dividio por cero");
			throw exception;
		}
		return result;
	}
        
        public double potencia(double base, double exp){
            double pot= Math.pow(base, exp);
            return pot;
        }
        public int multiplicacion(int a, int b){
        int m = a*b;
        return m;
        }
        
}
