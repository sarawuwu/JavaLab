package equals;

public class TestEquals {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("001"); //0800
		Employee e2 = new Employee("001"); //0900
		
		System.out.println(e1==e2); //false 0800 == 0900   ==:比較記憶體位置
		System.out.println(e1.equals(e2)); //false F3
		
		/* 拿車子比employee 無法比較
		 * Car c =new Car("B");
		 * System.out.println(e1.equals(c));
		 */
		 
		e1 = null;
		System.gc();

	}

}
