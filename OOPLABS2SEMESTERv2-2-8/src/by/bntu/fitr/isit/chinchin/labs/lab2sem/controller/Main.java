package by.bntu.fitr.isit.chinchin.labs.lab2sem.controller;

import by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity.Storage;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.model.logic.Manager;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer.Interfaces;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer.Output;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer.Printer;

public class Main {

	public static void main(String[] args) {
		Printer.interfaceType = Interfaces.CONSOLE;
		boolean mainLoop = true;
		Storage storage = Manager.createStorage();

		while (mainLoop) {
			Printer.print(Output.menu);
			int task = Manager.getTask();
			mainLoop = Manager.doTask(task, storage);
		}

	}

}
