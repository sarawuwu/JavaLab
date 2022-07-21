
public class TestIf {

	public static void main(String[] args) {

		int age = 46;
		if (age >= 30) {
			// 條件成立才執行block，最多只會進去其中一段
			System.out.println("壯年");
		} else if (age >= 18) {
			System.out.println("成年");
		} else {
			System.out.println("未成年");
		}

		// 巢狀式if
		if (age >= 18) {
			if (age >= 30) {
				System.out.println("壯年");
			} else {
				System.out.println("成年");
			}
		} else {
			System.out.println("未成年");
		}

		//switch
		int classroom = 204;
		// tab:往下一個框， shift+tab:往上一個
		switch (classroom) {
		case 204: 
			System.out.println("人數>=30人");
			break; //每一個case都要有一個break;結尾，不然會往下繼續執行
		case 305:
			System.out.println("人數<=30人,>=20");
			break;
		default:
			System.out.println("其他eles情況");
			break;
			
		//case 204: 不寫break不輸出結果，代表if(classroom=204||classroom ==305)有人用這個方式代替or
		//case 305:
			//System.out.println("人數<=30人,>=20");
			//break;
		}
	}
	

}
