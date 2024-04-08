package com.company;

class DivisionZeroException extends Exception{
	@Override
	public String toString() {
		return "You can not take zero as a number";
	}
	@Override
	public String getMessage() {
		return "We can not divide any number with zero";
	}
}
class Custom_Calculator{
	
	double addition(double a, double b) {return (a+b);}
	double subtraction(double a, double b) {return (a-b);}
	double division(double a, double b) throws DivisionZeroException {
		if(b==0) {
			throw new DivisionZeroException();
		}
		return (a/b);
		}
	double multiplication(double a, double b) {return (a*b);}
}
public class Program_43 {

	public static void main(String[] args) throws DivisionZeroException {
		Custom_Calculator C1 = new Custom_Calculator();
		C1.division(8, 0);

	}

}
