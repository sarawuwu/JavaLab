package array;

import java.util.Iterator;

public class TestEmployeeArray {

	public static void main(String[] args) {

		Employee[] emps= new Employee[2];
		
		Employee emp1 = new Employee();
		emp1.empno = 1;
		emp1.name = "Vincent";
		emps[0] = emp1; //放到陣列中，0800[0]=0900
		
		
		emps[0] = new Employee();
		emps[0].empno=1;
		emps[0].name="Vincent";

		System.out.println(emps[0].name); //0800[0]name => 0900.name
		
		emps[1] = new Employee();
		emps[1].empno=2;
		emps[1].name="David";
		
		//i=0,i<2 =>所以i只有 0,1
		for (int i = 0; i < emps.length; i++) {
			System.out.printf("編號:%d，名字:%s%n",emps[i].empno,emps[i].name);
			
		}
		
		
		
		
		
	}

}
