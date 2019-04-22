package by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer;

public abstract class Output {

	public static String menu = "1 - Вывести информацию о складе\n"
			+ "2 - Изменить информацию о продукции\n"
			+ "3 - Закупить продукцию\n"
			+ "4 - Продать продукцию\n"
			+ "0 - Выход из программы\n";

	public static String strorageName = "Имя хранилища: ";
	public static String rentCost = "Цена аренды склада за еденицу обЬёма: ";
	public static String capital = "Капитал: ";
	public static String capacity = "Объёмы продукции на складе: ";
	public static String productName = "Имя продукта: ";
	public static String mass = "Масса за единицу: ";
	public static String value = "Объём за единицу: ";
	public static String amount = "Количество единиц: ";

	public static String strorageNameInput = "Введите имя хранилища: ";
	public static String rentCostInput = "Введие цену за аренду единицы объёма склада: ";
	public static String capitalInput = "Введие начальный капитал: ";
	public static String productNameInput = "Введие имя продукта: ";
	public static String costInput = "Введите цену за еденицу: ";
	public static String massInput = "Введите массу за единицу: ";
	public static String valueInput = "Введите объём за единицу: ";
	public static String amountInput = "Введите количество единиц: ";
	public static String buyAmountInput = "Введите количество продукции для закупки: ";
	public static String sellAmountInput = "Введите количество продукции для продажи: ";
	public static String input = "Ввод: ";
	public static String amountOfProductsInput = "Количество видов продукции: ";

	public static String spent = "Потрачено: ";
	public static String received = "Получено: ";
	public static String currentCapital = "Текущий баланс: ";

	public static String tableHead = String.format(
			"%3s %25s %15s %15s %15s %15s\n", "###", "Имя продукта",
			"Цена(за ед)", "масса(за ед)", "объём(за ед)", "кол-во единиц");
	public static String tableFormat = "%03d %25s %15f %15f %15f %15d\n";
	public static String tableUpper = "------------------------------------------INFO-----------------------------------------------\n";
	public static String tableBottom = "---------------------------------------------------------------------------------------------\n";
	public static String uiNewLine = "\n";

}
