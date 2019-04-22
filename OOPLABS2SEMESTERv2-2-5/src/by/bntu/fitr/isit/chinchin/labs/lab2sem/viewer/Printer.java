package by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer;

public abstract class Printer {
	public static Interfaces interfaceType;

	public static void print(Object object) {
		switch (interfaceType) {
		case CONSOLE:
			System.out.print(object);
		default:
			break;
		}
	}

}
