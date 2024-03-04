package view;

import java.util.Scanner;

import controller.FibonacciController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FibonacciController fc = new FibonacciController();
		
		int position = 0;
		
		do {
			position = sc.nextInt();
		} while(position > 20);
		
		System.out.println(fc.fibonacciPositionValue(position, 0, 1));
		
		sc.close();

	}

}
