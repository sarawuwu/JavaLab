
public class TestString {

	public static void main(String[] args) {

		String name = "Vincent"; //from pool:0800
		String name1 = "Vincent"; //from pool:0800
		System.out.println(name==name1); //true, 0800=0800
		
		// new String 不會在pool區內
		String name2 = new String("Vincent");//新指定了一個0900
		System.out.println(name == name2); //false,0800 == 0900
		
		//equals
		System.out.println(name.equals(name2));
		
		//string常用方法
		//1. 字串長度
		System.out.println("length="+ "名字Vincent".length());//有幾個字 字數 中英都算一個字
		//2. 找裡面有沒有字
		System.out.println("IndexOf=" + "Vincent305".indexOf("30")); //找到印出位置(0開始)
		System.out.println("IndexOf=" + "Vincent305".indexOf("77")); //找不到印出-1
		//3. 切文字 substring後加你想要截的起始位置 從0起算，頭算尾不算
		System.out.println("substring=" + "Vincent305".substring(3));
		System.out.println("substring=" + "Vincent305".substring(3,7));
		
		double price = 123.456;
		System.out.println(price);
		System.out.println(String.format("水果%.1f元,賣給%s,總共%d元", price,name,100));
		System.out.printf("水果%.1f元,賣給%s,總共%d元%n", price,name,100);
		System.out.println("Hello");
		System.out.println();
		System.out.printf("%n");
		System.out.printf("%n");
		System.out.printf("%n");
		
		
		
		
	}

}
