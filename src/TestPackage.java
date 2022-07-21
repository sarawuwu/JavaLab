import category.Item; //引用，不過在下面選對，就不用自己key
import java.lang.*; //java會自動引用 不需要寫


public class TestPackage {

	public static void main(String[] args) {
		//使用時要用全名，包含package.class name
		Item item= new Item();
		item.name = "Asus notebook";
		System.out.println("TestPackage's main : "+item.name);
		
		String name="Vincent";
	}

}
