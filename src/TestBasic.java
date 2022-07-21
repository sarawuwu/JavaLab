
public class TestBasic {

	public static void main(String[] args) {
		// 宣告:有形態、有變數名稱
		{ // 區域變數{}內
			long salary; // 劃8bytes的區塊，名字叫做salary
			salary = 2000; // 變數必須要給值才能使用
			System.out.println("薪水=" + salary);
			// 相同變數名稱不能重複使用 int salary;
		}

		int i = 0, j = 1, k = 2;

		// 變數命名規則(小寫開頭/後字以大寫開頭/第一個字不能為數字)
		int salaryOfMary;

		// 只要key數字，java會自動幫你認為是int，所以下面會抱錯，
		// 所以後面要加一個L，告訴他是long
		long a = 2200000000L;

		int b = 2100000000 + 2100000000; // 42e,overflow,int+int=int 不會報錯但算出來是錯的
		System.out.println(b);

		long b1 = 2100000000L + 2100000000; // Long+int=Long
		System.out.println(b1);

		char c = '中'; // 只能單一一個字，稱為字元，單引號
		System.out.println(c);

		boolean paid = true; // true or false
		System.out.println(paid);

		System.out.println("\"");
		System.out.println("Hello\r\nWorld"); // \r or \n換行符號
		System.out.println("c:\\java"); // 反斜線也要兩個

		float x = 10;
		int y = 3;
		double z = x / y; // 1.除/ 3.333 or 3 int/int=int 2.%餘數
		System.out.println("z=" + z);// +不是數字的加，是文字的串接

		int x1 = 10;
		double y1 = 3.5;
		int z1 = (int) (x / y);
		System.out.println("z=" + z1);// casting 強制轉型
		
		//int age=18;
		//boolean isAdult = (age >= 18); // ==,!=
		//System.out.println(isAdult);
		
		System.out.println(12^6);
		
		//age++; //age=age+1 ; python裡的 +=
		//System.out.println("age="+age);
		
		
		int age=18;
		// 單獨一行無所謂 跟別人寫在一起才會有問題
		//age++; //age=age+1
		System.out.println("age="+age); //age=18
		System.out.println("age1="+age++); //先運作前面印出來的部分 age=18
		System.out.println("age2="+ ++age); //age=20(18+1沒印出來的再+1)

		int d=3;
		age=age+d;
		age += x; // age=age+x //age(int) = age(int) + x(double) = (int)double 自動幫你換算成int
		age = (int)(age+x);
		
		System.out.println(age);
		System.out.println(age>=18 ? "成年":"未成年"); //if else ?成立 傳回成年 不成立則傳回未成年
		System.out.println(age>=18 ?(age>30 ?"壯年":"成年"): "未成年" );
		
	
	}

}
