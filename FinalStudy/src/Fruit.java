
public class Fruit {
	private String color;
	private double price;
	private double weight;
	private int date;
	private String name;
	
	public Fruit(String color, double price, double weight, int date, String name){
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.date = date;
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		return color + " " + price + " " + weight + " " + date + " " + name;
	}

}
