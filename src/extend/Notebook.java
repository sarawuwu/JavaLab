package extend;
//型態: Notebook, Product 繼承完後有子類別也有父類別的型態
public class Notebook extends Product {
	
	//這兩個就不用了
	//public String name;
	//public int price;
	
	public int warranty;
	
	public Notebook(String name, int price, int warranty) {
		//super()；compiler會偷偷幫你放進來
		
		//this.name = name;
		//setName(name); protected
		
		//this.price = price;如果父類別有封裝
		//setPrice(price);
		
		/*呼叫super就會執行product的
		 * public Product(String name, int price) {
		this.name = name;
		this.price = price;}
		=super(name, price);*/
		super(name, price);
		this.warranty = warranty;
	}

	
	
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	} 
	
	@Override //Compile會去檢查這個方法是不是繼承來的
	public String desc() {
		//String info = String.format("商品名稱:%s,價錢:%d元,保固:%d天", this.name,this.price,this.warranty);
		
		//透過 super.可以呼叫父類別的方法 可以連動作更改，很讚
		String info = String.format("%s,保固:%d天", super.desc(),this.warranty);
		
		return info;
	}
	
	
	
}
