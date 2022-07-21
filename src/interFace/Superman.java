package interFace;

//型態: 除了自己的Superman,也是Lawyer,Accountant
public class Superman implements Lawyer,Accountant {
	
	// 繼承來的這個抽象方法 Lawyer的訴訟 要實作!或是你上面要變成一個抽象方法
	public void 訴訟() {
	}
	public void 報稅() {
		
	}

	
	public static void main(String[] args) {
		
		Superman s = new Superman();
		s.訴訟();
		s.報稅();

	}

}
