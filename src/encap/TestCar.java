package encap;

public class TestCar {

	public static void main(String[] args) {

		Car c =new Car("Prius","紅色");
		//Car c = new Car("紅色");
		//Car c = new Car();//會報錯，因為在car前面寫了建構方法，就要按照你的建構方法放參數進去
		// 這個被封裝了 c.model="Prius";
		//c.setModel("P");
		//c.price=1000000;
		System.out.printf("車子型號:%s,價錢:%d,顏色:%s%n",c.getModel(),c.getPrice(),c.getColor());
		
		
	}

}
