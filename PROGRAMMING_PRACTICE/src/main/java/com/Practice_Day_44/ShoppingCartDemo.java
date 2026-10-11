package com.Practice_Day_44;

class ShoppingProduct {

	String name;
	double price;

	ShoppingProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}
}

class ShoppingCart {

	double total = 0;

	void addProduct(ShoppingProduct product) {

		total = total + product.price;

		System.out.println(product.name + " added");
	}

	void displayTotal() {
		System.out.println("Total Amount: " + total);
	}
}

public class ShoppingCartDemo {
	public static void main(String[] args) {

		ShoppingProduct p1 = new ShoppingProduct("Laptop", 50000);

		ShoppingProduct p2 = new ShoppingProduct("Mouse", 1000);

		ShoppingCart cart = new ShoppingCart();

		cart.addProduct(p1);
		cart.addProduct(p2);

		cart.displayTotal();
	}
}
