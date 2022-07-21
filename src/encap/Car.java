package encap;

public class Car {
	
	private String model; //null
	private int price; //0
	private String color;
	
	//建構方法
	//public Car() {
		//this.color = "白色";//初始化屬性預設值
	//}
	public Car(String color) {
		this("Yaris", color);
		//this.color= color; 下面有了
	}
	
	//overload 方法名稱都一樣 後面參數不一樣
	public Car(String model,String color) {
		//this.model = model; 下面setModel裡面已經有了
		this.color = color;
		setModel(model); //剛剛沒有呼叫到下方的程式
	}
	
	
	
	
	//設定model的方法,setXXXX (開一個新的方法讓別人把型號射進來)
	//public void setModel(String m) {通常 裡面的m會跟上面屬性的一樣為model
	// 在方法裡如果有變數名稱與屬性名稱一樣，他都會認為是區域變數(參數裡的model)
	//參數擁有優先權 會把屬性蓋掉 要在屬性前方加上this. 可以明確表達變數是屬性
	
	public void setModel(String model) {
		//自己設定model=傳進來的m
		//model = m;
		this.model = model;
		if(model.equals("Prius")) {
			price = 1000000;
	}else if (model.equals("Yaris")) {
		price = 575000;
	}else {
		this.model = "Error";
		System.out.println("型號只能Prius或Yaris");
	}
	}
	
	//取得model的方法，getXXXX
	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
