package com.xworkz.tv;

public class Tv {
	private String name;
	private String brand;
	private double price;
	private Display display;
	private Remote remote;
	private SetUpBox box;
	private Stand stand;
	
	
	
	public Tv(String name, String brand, double price, Display display, Remote remote, SetUpBox box, Stand stand) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.display = display;
		this.remote = remote;
		this.box = box;
		this.stand = stand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Remote getRemote() {
		return remote;
	}

	public void setRemote(Remote remote) {
		this.remote = remote;
	}

	public SetUpBox getBox() {
		return box;
	}

	public void setBox(SetUpBox box) {
		this.box = box;
	}

	public Stand getStand() {
		return stand;
	}

	public void setStand(Stand stand) {
		this.stand = stand;
	}

	@Override
	public String toString() {
		return "Tv [name=" + name + ", brand=" + brand + ", price=" + price + ", display=" + display + ", remote="
				+ remote + ", box=" + box + ", stand=" + stand + "]";
	}


}
