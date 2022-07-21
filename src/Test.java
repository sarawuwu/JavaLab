public class Test {
	
	private static int i = 1;
	public static void main(String argv[]){
		int i = 2;
		Test s = new Test(); 
    s.print();
	}
  //DO NOT CHANGE
	public static void print(){
		System.out.println(i); 
	}
}