package array;

import java.util.Iterator;

public class TestArray {
	
	public static void main(String[] args) {
	
		//int[] ages = new int[10];
		int[] ages = {1,1,1,4}; //直接給預設值，沒給預設值就是0
		ages[0] =1; //給值，利用位置
		ages[1] =2;
		ages[2] =3;

		System.out.printf("ages[0]=%d%n",ages[0]); //取值，也是利用位置
		System.out.printf("長度:%d%n",ages.length);
		//System.out.printf("ages[10]=%d%n",ages[10]);超過範圍
		System.out.printf("ages[3]=%d%n",ages[3]); 
		
		//int[][]x = new int[5][4];
		int[][]x = {{1,2,3},{4,5,6},{7,8,9}};
		
		x[0][0]=1;//第一排第一個
		x[1][1]=2;//第二排第二個
		x[2][2]=3;
		System.out.println("x[2][2]="+x[2][2]);
		System.out.printf("陣列有幾排:x.length=%d%n",x.length); //有幾排 =5
		System.out.printf("第二排有%d個%n",x[1].length);
		
		
		//int i=0; //i表示第幾排
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.printf("x[%d][%d]=%d%n",i,j,x[i][j]);
				}
		}
		
		//要先知道ages[0]是什麼型態，int
		for( int value :ages) {
			//1. int value = ages[0]
			//2. int value = ages[1]
			System.out.println(value);
		}
		
		System.out.println("--------------------------");
		//x[0]是什麼型態? int的陣列
		for(int[] row  :x) {
			//row[0]是什麼型態?  int
			for(int value :row) {
				System.out.println(value);
				
			}
				
				
		}
		
		
		
	}
	
	

}
