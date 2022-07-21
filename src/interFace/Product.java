package interFace;

import java.util.Stack;

public abstract class Product {
	
	public static final double TAX = 0.05;
	static {
		System.out.println("只會執行一次");
	}
	
	//抽象方法
	//public abstract void calc();
	

	
	//子類別可以看的見，同一個package也可以看的見 
	protected String name;
	protected int price;
	
	public Product() {
	}
	
	public Product(String name, int price) {
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
	
	public String desc() {
		String info = String.format("商品名稱:%s,價錢:%d元", this.name,this.price);
		return info;
	}
	

}
