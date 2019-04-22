package by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity;

public class Product {
	private String name;
	private double cost;
	private double weight;
	private double volume;
	private int amount;

	public Product() {
		name = "No product";
		cost = 0;
		weight = 0;
		volume = 0;
		amount = 0;
	}

	public Product(String name, double cost, double weight, double volume,
			int amount) {
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.volume = volume;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != "") {
			this.name = name;
		}
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		if (cost >= 0) {
			this.cost = cost;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight >= 0) {
			this.weight = weight;
		}
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		if (volume >= 0) {
			this.volume = volume;
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if (amount >= 0) {
			this.amount = amount;
		}
	}

	public void incAmount(int amount) {
		if (amount > 0) {
			this.amount += amount;
		}
	}

	public void decAmount(int amount) {
		if (amount > 0) {
			this.amount -= amount;
		}
	}

	@Override
	public String toString() {
		return name;
	}

}
