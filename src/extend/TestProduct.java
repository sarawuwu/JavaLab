package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.print.attribute.TextSyntax;

public class TestProduct {

	public static void main(String[] args) {
	
		Notebook nb = new Notebook("Asus",20000,365);//0800
		System.out.printf("名稱:%s,價錢:%d%n",nb.getName(),nb.getPrice());
		System.out.println(nb.name);  //overloading
		System.out.println(nb.desc());
		System.out.println(Product.TAX);
		
		
		
		Product item =nb; //item = 0800
		System.out.println(item.desc()); //父類別的型態(Product),父類別的方法，操作子類型的物件(Notebook上的desc)
		Notebook item3=(Notebook)item;  //請問Product(item是product)是不是一個Notebook? (有可能是Food) 所以要用強制轉型
		if (item instanceof Food) {  //false
			//如果item指向的物件是Food的一種，或是說具備Food的型態，才會做強制轉型(Food),才不會發生錯誤
			Food item5 = (Food)item; //Product(item)是不是一個Food? (有可能是Notebook) 保證是食物結果是notebook就會當掉!!!
		}

		
		//先知道是什麼日曆，才能指定日期
		GregorianCalendar calendar = new GregorianCalendar(2022, 3, 18);//西元曆2022.04.18 但月份從0起算
		GregorianCalendar calendar1 = new GregorianCalendar(2022,Calendar.APRIL, 18);//直接顯示正確月份
		//日曆要轉日期,用java.util.Date not jave.sql.Date
		Date expireDate = calendar.getTime(); //Alt+Shift+l
		Food food = new Food("肉鬆",100,expireDate);
		System.out.println(food.desc());
		
		Product[] ps = {nb, food};
		buy(ps);
		
		/*buy(nb);
		buy(food);*/
	}
	/*
	public static void buy(Notebook nb) {
		System.out.println("買入"+nb.desc());
	}
	public static void buy(Food food) {
		System.out.println("買入"+food.desc());
	}*/
	public static void buy(Product[] products) {
		//products[0]
		int sum = 0;
		for(Product item : products) {
			System.out.println("買入"+item.desc());
			sum+=item.getPrice();
		}
		System.out.println("總金額="+sum);
	}
	

}
