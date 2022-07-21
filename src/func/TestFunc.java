package func;

public class TestFunc {

	public static void main(String[] args) {
		
		//定義有回傳直才能設一個變數接
		//shift+alt+l(local variable) 游標停在分號前，改變數名稱
		int s = add(1, 3);
		System.out.println("done="+s);
	}
	
	//方法定義
	// 公開                  回傳型態        方法名稱    參數(型態 變數名稱) 也是區域變數
	//                (output void沒有回傳值)             (input)
	   public  static        int         add      (int a, int b) {
		   int sum = a+b;
		   System.out.println("Sum="+sum);
		   return sum;
	}

}
