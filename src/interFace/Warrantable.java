package interFace;
// 保固商品特性
public interface Warrantable {
	
	int MAX_WARRANTY = 365; //預設Public static final
	
	public int 保固天數();
	
	//Java8,介面有擴充可以有實作的方法,default(子類別可以override)
	default int 檢測費用() {
		return 500;
	}
	
	
	

}
