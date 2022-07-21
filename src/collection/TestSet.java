package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		set.add("Hello");
		boolean success= set.add("Hello");//加入失敗，重複了

		//size
		System.out.println("size="+set.size());
		System.out.println("第二次加Hello="+success);
		
		set.add("World");
		System.out.println("size="+set.size());
		
		//contains
		boolean helloExist = set.contains("Hello");
		System.out.println(helloExist);
		
		//set 不管順序
		//set.add(3);
		
		for(Object item :set) {
			System.out.println(item);
		}
		
		
		
		
		
		
		
	}

}
