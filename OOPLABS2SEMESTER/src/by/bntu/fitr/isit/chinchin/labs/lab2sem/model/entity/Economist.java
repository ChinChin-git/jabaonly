package by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity;

public abstract class Economist {

	private static double money;

	public static void profit(double profit) {
		money += profit;
	}

	public static void costs(double costs) {
		money -= costs;
	}

	public static double getMoney() {
		return money;
	}

	public static void setMoney(double money) {
		Economist.money = money;
	}
}