package array;

public class ChristmasTreeLab1 {

	public static void main(String[] args) {

		int n=4; //假設4行
		int max=2*n-1; // 每一行要有幾顆*
		
		//總長是2*-1
		
		
		for(int i=0; i<n;i++) {
			
			for (int h = 0; h < (max-(2*i+1))/2; h++) {
				System.out.printf(" ");
		}
			for (int j = 0; j < 2*i+1; j++ ) {
				System.out.printf("*");
			}
					
			System.out.println();
		}
			
		
		
		
		
	}

}
