import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {

		int sum=0;
		for( int i = 1 ; i <= 100 ; i++ ) { 
			System.out.println(i);
			sum=sum+i;
			//i=1,sum=0+1=1
			//i=2,sum=1+2=3
			//i=3,sum=3+3=6 ...
		}
			//System.out.println("final i="+ i); 會報錯，因為for迴圈中的宣告是唯一例外，只有後面的{}能用	
			System.out.println("總和="+sum);
		
			
		//奇數相加	
		//for(int i=1; i<=100;i+=2)
		int sum1=0;
		for(int i1=1; i1 <= 100 ; i1++) {
			System.out.println(i1);
			if(i1%2==1) {
			 sum1=sum1+i1;
			}
		}
		System.out.println("總和="+sum1);
	
		
		int sum2=0;
		for(int i2=1;i2<=100; i2++) {
			//System.out.println(i2);
			if(i2%2==0)//判斷是偶數 跳過這次迴圈
				continue;
			if (i2>=50) {
				break;//迴圈中斷
				//System.out.println(i2);
		}
			sum2=sum2+i2;
		}
		System.out.println("總和="+sum2);
		
		//while 迴圈
		int counter=0;
		int sumOfWhile=0;
		while(counter<= 100) {
			sumOfWhile += counter;
			counter++; //計數器要記得自己加
		}
		System.out.println("While總和="+sumOfWhile);
		
		//do while迴圈
		int i=101;
		sum=0; //重複利用同樣的變數，值先設為零
		do {
			sum+=i; //sum= sum(0)+101=101
			i++;//i=102
		} while (i<=100);
		System.out.println("DoWhile總和="+sum);
		System.out.println("i="+i);
		
		

		
	}

}
