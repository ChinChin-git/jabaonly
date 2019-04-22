package by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity;

import by.bntu.fitr.isit.chinchin.labs.lab2sem.model.entity.Product;

public class Storage {
	private String name;
	private double capacity;
	private double rentPrice;
	private int countOfProducts;
	private Product[] products;

	public Storage() {
		name = "no name";
		rentPrice = 0;
		countOfProducts = 0;
		capacity = 0;
		products = new Product[countOfProducts];
		for (int i = 0; i < countOfProducts; i++) {
			products[i] = new Product();
		}
	}

	public Storage(String name, double rentPrice, int countOfProducts) {
		this.name = name;
		this.rentPrice = rentPrice;
		this.countOfProducts = countOfProducts;
		capacity = 0;
		products = new Product[countOfProducts];
		for (int i = 0; i < countOfProducts; i++) {
			products[i] = new Product();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != "") {
			this.name = name;
		}
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		if (capacity >= 0) {
			this.capacity = capacity;
		}
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		if (rentPrice >= 0) {
			this.rentPrice = rentPrice;
		}
	}

	public int getCountOfProducts() {
		return countOfProducts;
	}

	public void setCountOfProducts(int countOfProducts) {
		if (countOfProducts >= 0) {
			this.countOfProducts = countOfProducts;
		}
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		if (products != null) {
			this.products = products;
		}
	}

	public Product getProduct(int index) {
		return products[index];
	}

	public void download(int volume) {
		if (volume > 0) {
			capacity += volume;
		}
	}

	public void upload(int volume) {
		if (volume > 0) {
			capacity -= volume;
		}
	}

	@Override
	public String toString() {
		String productNames = "";
		for (int i = 0; i < products.length; i++)
			productNames += products[i].getName() + "\n";
		return "Name: " + name + "\nRent price: " + rentPrice + "\nProducts:\n"
				+ productNames;
	}

}
