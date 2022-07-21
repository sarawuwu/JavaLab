package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		//ArrayList list = new ArrayList();
		//大家比較常這樣用
		List<String> list = new ArrayList<>();
		//add(Object)
		list.add("Hello"); //index:0
		list.add("World"); //index:1
		Integer a = new Integer(3); //Boxing 
		int x = a.intValue(); //Unboxing
		//list.add(new Integer(3)); //autoboxing
		// 因為上面是string 所以會有錯
		//list.add(3); //index:2  3是int 基本型態,class(x),物件(x)
		
		System.out.println("0="+ list.get(0));
		System.out.println("1="+ list.get(1));
		
		//size
		System.out.println("目前大小"+list.size());
		
		// i=0,1,2 <3
		for(int i=0;i<list.size();i++) {
			System.out.printf("位置%d,value=%s%n",i,list.get(i));
		}
		
		
		/*String s = "3";
		System.out.println(s+1);
		int sint = Integer.parseInt(s); //文字轉成基本型別*/

		Iterator<String> it = list.iterator(); //shift+alt+l
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		// -- 跟上面是一樣的概念
		//for each loop
		//list.get(0)
	
		for(Object item : list) {
			System.out.println(item);
		}
		
		
	}

}
