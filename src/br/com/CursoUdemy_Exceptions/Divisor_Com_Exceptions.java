package br.com.CursoUdemy_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisor_Com_Exceptions {
	
	public static int quotient(int numerator,int denominator)throws ArithmeticException{
		return  numerator / denominator;
	}

	public static void main(String[] args) {
		Scanner enter  = new Scanner (System.in);
		boolean continueLoop = true;
		
		
		do {
			
			try {
				System.out.print("Please! Enter  an integer numerator:");
			    int numerator = enter.nextInt();
			    System.out.print("Please! Enter  an integer denominator:");
			    int denominator = enter.nextInt();
			    
			    int result = quotient(numerator, denominator);
			    System.out.printf("%nResult: %d / %d = %d%n",numerator,denominator,result);
			    continueLoop = false;
			}
			catch (InputMismatchException  e) {
				System.err.printf("%n Exception: %s%n",e);
				enter.nextLine(); //Descartando a entrada para que os dados sejam inceridos novamente
				System.out.println("You must enter integer. Please try again.");
			}
			catch (ArithmeticException e) {
				System.err.printf("");
				System.err.printf("%n Exception: %s%n",e);
				System.out.println("Zero is an invalid denominator. Please try again.");
			}
			
		    
		}
		while(continueLoop);
	}

}
