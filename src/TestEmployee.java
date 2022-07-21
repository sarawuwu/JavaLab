
public class TestEmployee {

	public static void main(String[] args) {
	//宣告: 型態   變數名稱
		Employee emp = new Employee(); //產生物件0800，有new就會在記憶體中產生Employee，有兩格可以放資料
		emp.empno = 1; //設定值用.跟=
		emp.name = "Apple";
		
		System.out.println("員工編號="+emp.empno+"，名字:"+emp.name); //取值直接.
		
		Employee emp2= new Employee();//0900
		emp2.empno=2;
		emp2.name="David";
		System.out.println("員工編號="+emp2.empno+"，名字:"+emp2.name);
		
		
		System.out.println(emp==emp2); //0800 == 0900 F
		
		emp2= emp; //把emp2裡面指向的物件換成emp 所以這時emp2變成0800
		System.out.println("員工編號="+emp2.empno+"，名字:"+emp2.name); //變成emp的值
		System.out.println(emp==emp2); //T
		
		//null
		// null清空存放的記憶體位置，只有物件形式變數可以使用null。
		// heap區的如果沒有被指巷道就會被GC
		emp2=null;
		emp=null;
		//a=null; 不能這樣!!
		// 如果該變數為 null，則不能再被使用，否則會有錯誤發生(NullPointerException)
		System.out.println(emp2.name);
		
		
		
	}

}
