import java.util.Scanner;
import java.io.*;
public class Generator {

	public static void main(String args[]) {
		 String benpress = "bench";
		 String squpress = "squat";
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'bench' for bench pyramid or 'squat' for squat pyramid");
		String userinp = sc.next();
		System.out.println("Enter your one rep max for either bench or squat to calculate the pyramid");
		double oneRep = sc.nextInt();
		
		if (userinp.equals(benpress) ) {
		generateBenchPyramid(oneRep);
		}
	
		if (userinp.equals(squpress)) {
		generateSquatPyramid(oneRep);
		}
	}
		public static void generateBenchPyramid(double i) {
	
		System.out.println("enter your 1 rep max for bench for a pyramid calculation");
		System.out.println("Your 8's are " + (5*(Math.round((i * 0.70)/5))));
		System.out.println("Your 6's are " + (5*(Math.round(i * 0.80)/5)));
		System.out.println("Your 4's are " + (5*(Math.round(i * 0.90)/5)));
		System.out.println("Your 1's are " + (5*(Math.round(i * 0.99)/5)));
		System.out.println("Then do them in reverse order! EX: 8s-6s-4s-1s-4s-6s-8s");
	}
		public static void generateSquatPyramid(double i) {
	 
		System.out.println("enter your 1 rep max for squat for a pyramid calculation");
		System.out.println("Your 6's are " + (5*(Math.round((i * 0.55)/5))));
		System.out.println("Your next set of 6's are " + (5*(Math.round(i * 0.75)/5)));
		System.out.println("Your 4's are " + (5*(Math.round(i * 0.85)/5)));
		System.out.println("Your 2's are " + (5*(Math.round(i * 0.93)/5)));
		System.out.println("Then do them in reverse order! EX: 6s-6s-4s-2s-4s-6s-6s");
	 }
		}	
		
