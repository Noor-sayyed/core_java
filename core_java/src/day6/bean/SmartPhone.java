package day6.bean;

public class SmartPhone {
	String name;
	int price;
	
	
	public SmartPhone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", price=" + price + "]";
	}

}
