package by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity;

import java.util.Scanner;

public abstract class Input {
	private static Scanner input = new Scanner(System.in);

	public static int inputInt() {
		int integer = input.nextInt();
		input.nextLine();
		return integer;
	}

	public static double inputDouble() {
		if (input.hasNextDouble()) {
			return input.nextDouble();
		}
		input.next();
		return 0;
	}

	public static String inputString() {
		return input.nextLine();
	}

}
