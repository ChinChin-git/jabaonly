package by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer;

import java.util.Locale;

public abstract class Output {

	public static String menu;

	public static String strorageName;
	public static String rentCost;
	public static String capital;
	public static String capacity;
	public static String productName;
	public static String mass;
	public static String value;
	public static String amount;

	public static String strorageNameInput;
	public static String rentCostInput;
	public static String capitalInput;
	public static String productNameInput;
	public static String costInput;
	public static String massInput;
	public static String valueInput;
	public static String amountInput;
	public static String buyAmountInput;
	public static String sellAmountInput;
	public static String input = "Ввод: ";
	public static String amountOfProductsInput;

	public static String spent;
	public static String received;
	public static String currentCapital;

	public static String tableHead;
	public static String tableUpper;
	public static String tableBottom = "---------------------------------------------------------------------------------------------\n";
	public static String tableFormat = "%03d %25s %15f %15f %15f %15d\n";
	public static String uiNewLine = "\n";

	static {
		switch (Locale.getDefault().toString()) {
		case "ru_RU":

			menu = "1 - Вывести информацию о складе\n"
					+ "2 - Изменить информацию о продукции\n"
					+ "3 - Закупить продукцию\n" + "4 - Продать продукцию\n"
					+ "0 - Выход из программы\n";

			strorageName = "Имя хранилища: ";
			rentCost = "Цена аренды склада за еденицу обЬёма: ";
			capital = "Капитал: ";
			capacity = "Объёмы продукции на складе: ";
			productName = "Имя продукта: ";
			mass = "Масса за единицу: ";
			value = "Объём за единицу: ";
			amount = "Количество единиц: ";

			strorageNameInput = "Введите имя хранилища: ";
			rentCostInput = "Введие цену за аренду единицы объёма склада: ";
			capitalInput = "Введие начальный капитал: ";
			productNameInput = "Введие имя продукта: ";
			costInput = "Введите цену за еденицу: ";
			massInput = "Введите массу за единицу: ";
			valueInput = "Введите объём за единицу: ";
			amountInput = "Введите количество единиц: ";
			buyAmountInput = "Введите количество продукции для закупки: ";
			sellAmountInput = "Введите количество продукции для продажи: ";
			input = "Ввод: ";
			amountOfProductsInput = "Количество видов продукции: ";

			spent = "Потрачено: ";
			received = "Получено: ";
			currentCapital = "Текущий баланс: ";

			tableHead = String.format("%3s %25s %15s %15s %15s %15s\n", "###",
					"Имя продукта", "Цена(за ед)", "масса(за ед)",
					"объём(за ед)", "кол-во единиц");

			tableUpper = "---------------------------------------ИНФОРМАЦИЯ--------------------------------------------\n";

			break;
			
		case "en-us":
		default:

			menu = "1 - Show storage info\n" + "2 - Change production info\n"
					+ "3 - Buy production\n" + "4 - Sell production\n"
					+ "0 - Exit\n";

			strorageName = "Storage name: ";
			rentCost = "Storage rent cost(per volume unit): ";
			capital = "Capital: ";
			capacity = "Storage capacity: ";
			productName = "Product name: ";
			mass = "Mass per unit: ";
			value = "Volume per unit: ";
			amount = "Amount of units: ";

			strorageNameInput = "Enter storage name: ";
			rentCostInput = "Enter storage rent cost(per volume unit): ";
			capitalInput = "Enter capital: ";
			productNameInput = "Enter product name: ";
			costInput = "Enter cost per unit: ";
			massInput = "Enter mass per unit: ";
			valueInput = "Enter volume per unit: ";
			amountInput = "Enter amount of units: ";
			buyAmountInput = "Enter amount of products to be purchased: ";
			sellAmountInput = "Enter amount of products to be sold: ";
			input = "Enter: ";
			amountOfProductsInput = "Numer of (types)products: ";

			spent = "Spent: ";
			received = "Received: ";
			currentCapital = "Current capital: ";

			tableHead = String.format("%3s %25s %15s %15s %15s %15s\n", "###",
					"Product name", "price", "mass",
					"volume", "amount");

			tableUpper = "------------------------------------------INFO-----------------------------------------------\n";
			
			break;

		}
	}

}
