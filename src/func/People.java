package func;

public class People {
	
	//類別屬性、靜態屬性，跟著clsaa設計圖跑，產生物件時不會額外產生這個屬性浪費空間
	static double overWeightBMI = 24; //系統常數，不會變的值
	//類別方法or靜態方法 不需要物件就可以呼叫，使用過程中不能用下方物件的屬性，需要的資料都(身高、體重)只能透過參數傳進去
	public static double BMI(double w,double h) {
		return w/(h*h);
		
	}
	
	
	
	//放在類別下為屬性，會有預設值 
	double height;
	double weight;
	
	//方法的定義
	public double getBMI() {
		//結果要算出來 this
		//double bmi= weight / (height*height);
		//呼叫上面的方法，程式不會太亂
		double bmi= People.BMI(weight, height);
		return bmi;
	}
	
	
	
}
