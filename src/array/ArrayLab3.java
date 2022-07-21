package array;

public class ArrayLab3 {

	public static void main(String[] args) {

		double[] x= {1.1,2.0,1.2,1.4,0.5,6.0};
		double max = x[0];
		double min = x[0];	
		double sum = 0;
		double sd = x[0]-2.03;
		double sd1=sd*sd;
		double sd2=;
		
		
		for(double j :x) {
			if (j>max) {
				max=j;
			}
			if(j<min) {
				min=j;
			}
		}
		for (int i = 0; i < x.length; i++) {
			sum=sum+x[i];
		}

		
		for(int h=0;h<x.length;h++) {
			sd= x[h]-2.03;
			
		}
		
		
		/*for (int h=0; h<x.length;h++) {
			sd1=(sd+(x[(int)h]-2.03)**);
		}*/
		
		/*for (int h=0; h<x.length;h++) {
				for(int k=0;k<h;k++) {
					
				}
	}*/
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		System.out.println("Avg="+sum/x.length );
		System.out.println("標準差="+Math.sqrt(sd1/x.length));
		
	}

}
