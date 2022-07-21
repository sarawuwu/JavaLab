package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class TestMap {

	public static void main(String[] args) {

		//像python dic
		Map<String,Integer> map = new HashMap<>();
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Tom", 5000);
		
		//放進去的時候輸入key value 取值的時候用key就可以取
		System.out.println("Tom's薪水="+map.get("Tom"));
		
		//輸入兩次key值會被蓋掉
		map.put("Tom", 2500);
		System.out.println("Tom's薪水="+map.get("Tom"));
		
		Set<String> keySet = map.keySet(); //shift+alt+l
		int sum = 0;
		for( Object key :keySet) {
			//key = John David Tom
			System.out.println("name="+key+"，薪水="+map.get(key));
			Object value = map.get(key);
			Integer salary = (Integer)value;
			sum += salary;
		
		}
		System.out.println("總和="+sum);
		
		
		
		
		
		
		
		
		
		
	}

}
