package by.bntu.fitr.isit.chinchin.labs.lab2sem.viewer;

public abstract class Output {

	public static String menu = "1 - ������� ���������� � ������\n"
			+ "2 - �������� ���������� � ���������\n"
			+ "3 - �������� ���������\n"
			+ "4 - ������� ���������\n"
			+ "0 - ����� �� ���������\n";

	public static String strorageName = "��� ���������: ";
	public static String rentCost = "���� ������ ������ �� ������� ��ܸ��: ";
	public static String capital = "�������: ";
	public static String capacity = "������ ��������� �� ������: ";
	public static String productName = "��� ��������: ";
	public static String mass = "����� �� �������: ";
	public static String value = "����� �� �������: ";
	public static String amount = "���������� ������: ";

	public static String strorageNameInput = "������� ��� ���������: ";
	public static String rentCostInput = "������ ���� �� ������ ������� ������ ������: ";
	public static String capitalInput = "������ ��������� �������: ";
	public static String productNameInput = "������ ��� ��������: ";
	public static String costInput = "������� ���� �� �������: ";
	public static String massInput = "������� ����� �� �������: ";
	public static String valueInput = "������� ����� �� �������: ";
	public static String amountInput = "������� ���������� ������: ";
	public static String buyAmountInput = "������� ���������� ��������� ��� �������: ";
	public static String sellAmountInput = "������� ���������� ��������� ��� �������: ";
	public static String input = "����: ";
	public static String amountOfProductsInput = "���������� ����� ���������: ";

	public static String spent = "���������: ";
	public static String received = "��������: ";
	public static String currentCapital = "������� ������: ";

	public static String tableHead = String.format(
			"%3s %25s %15s %15s %15s %15s\n", "###", "��� ��������",
			"����(�� ��)", "�����(�� ��)", "�����(�� ��)", "���-�� ������");
	public static String tableFormat = "%03d %25s %15f %15f %15f %15d\n";
	public static String tableUpper = "------------------------------------------INFO-----------------------------------------------\n";
	public static String tableBottom = "---------------------------------------------------------------------------------------------\n";
	public static String uiNewLine = "\n";

}
