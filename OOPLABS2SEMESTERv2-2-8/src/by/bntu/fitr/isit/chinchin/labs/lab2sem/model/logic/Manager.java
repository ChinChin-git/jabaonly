package by.bntu.fitr.isit.chinchin.labs.lab2sem.model.logic;

import by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity.Economist;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity.Input;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity.Storage;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer.Output;
import by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer.Printer;

public abstract class Manager {
	public static boolean doTask(int task, Storage storage) {
		boolean mainLoop = true;
		switch (task) {
		case 1:
			Printer.print(Manager.viewStorageInfo(storage) + Output.uiNewLine);
			break;
		case 2:
			Manager.changeProductInfo(storage);
			break;
		case 3:
			Manager.buyProduct(storage);
			break;
		case 4:
			Manager.sellProduct(storage);
			break;
		case 0:
			mainLoop = false;
			break;
		default:
			break;
		}
		return mainLoop;
	}

	public static int getTask() {
		Printer.print(Output.input);
		return Input.inputInt();
	}

	public static String viewStorageInfo(Storage storage) {
		double capacity = 0;
		String productsInfo = String.format(Output.tableHead);
		for (int i = 0; i < storage.getCountOfProducts(); i++) {
			capacity += storage.getProduct(i).getVolume()
					* storage.getProduct(i).getAmount();
			productsInfo += String.format(Output.tableFormat, i + 1, storage
					.getProduct(i).getName(), storage.getProduct(i).getCost(),
					storage.getProduct(i).getWeight(), storage.getProduct(i)
							.getVolume(), storage.getProduct(i).getAmount());
		}
		String storageInfo = String.format(Output.tableUpper
				+ Output.strorageName + storage.getName() + Output.uiNewLine
				+ Output.rentCost + storage.getRentPrice() + Output.uiNewLine
				+ Output.capital + Economist.getMoney() + Output.uiNewLine
				+ productsInfo + Output.capacity + capacity + Output.uiNewLine
				+ Output.tableBottom);
		return storageInfo;
	}

	public static Storage createStorage() {
		Printer.print(Output.strorageNameInput);
		String name = Input.inputString();
		Printer.print(Output.rentCostInput);
		double rentPrice = Input.inputDouble();
		Printer.print(Output.amountOfProductsInput);
		int count = Input.inputInt();
		Storage storage = new Storage(name, rentPrice, count);

		Printer.print(Output.capitalInput);
		double capital = Input.inputDouble();
		Economist.setMoney(capital);

		return storage;
	}

	public static void changeProductInfo(Storage storage) {
		for (int i = 0; i < storage.getCountOfProducts(); i++) {
			Printer.print(i + 1 + ". " + storage.getProduct(i).getName()
					+ Output.uiNewLine);
		}
		Printer.print(Output.input);
		int productIndex = Input.inputInt() - 1;

		Printer.print(Output.productNameInput);
		storage.getProduct(productIndex).setName(Input.inputString());
		Printer.print(Output.costInput);
		storage.getProduct(productIndex).setCost(Input.inputDouble());
		Printer.print(Output.massInput);
		storage.getProduct(productIndex).setWeight(Input.inputDouble());
		Printer.print(Output.valueInput);
		storage.getProduct(productIndex).setVolume(Input.inputDouble());
		Printer.print(Output.amountInput);
		storage.getProduct(productIndex).setAmount(Input.inputInt());
	}

	public static int getProductIndex(Storage storage) {
		for (int i = 0; i < storage.getCountOfProducts(); i++) {
			Printer.print(i + 1 + ". " + storage.getProduct(i).getName()
					+ Output.uiNewLine);
		}
		Printer.print(Output.input);
		int index = Input.inputInt() - 1;
		return index;
	}

	public static void buyProduct(Storage storage) {

		int productIndex = getProductIndex(storage);
		Printer.print(Output.buyAmountInput);
		int amount = Input.inputInt();
		double price = amount * storage.getProduct(productIndex).getCost();
		if (price < Economist.getMoney()) {
			storage.getProduct(productIndex).incAmount(amount);
			Economist.costs(price);
		}
		viewCosts(price);
	}

	public static void sellProduct(Storage storage) {
		int productIndex = getProductIndex(storage);
		Printer.print(Output.sellAmountInput);
		int amount = Input.inputInt();
		double profit = 0;
		if (amount <= storage.getProduct(productIndex).getAmount()) {
			profit = amount * storage.getProduct(productIndex).getCost();
			storage.getProduct(productIndex).decAmount(amount);
			Economist.profit(profit);
		}
		viewProfit(profit);

	}

	public static void viewCosts(double costs) {
		Printer.print(Output.spent + costs + Output.uiNewLine);
		Printer.print(Output.currentCapital + Economist.getMoney()
				+ Output.uiNewLine);

	}

	public static void viewProfit(double profit) {
		Printer.print(Output.received + profit + Output.uiNewLine);
		Printer.print(Output.currentCapital + Economist.getMoney()
				+ Output.uiNewLine);
	}

}
