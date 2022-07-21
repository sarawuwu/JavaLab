package interFace;

import java.text.SimpleDateFormat;
import java.util.Date;
//型態 SimCard,Product,Expirable,Warrantable
public class SimCard extends Product implements Expirable,Warrantable {

		
	private int warranty;
	private Date expireDate;
	
	public SimCard(String name, int price, int warranty, Date expireDate) {
		super(name, price);
		this.warranty = warranty;
		this.expireDate = expireDate;
	}
	public int 保固天數() {
		return warranty;
	}
	@Override
	public Date 最後期限() {
		return expireDate;
	}
	
	@Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd"); //y:year,M:month(小寫m代表分),d:day HH:mm:ss
        description = description +",最後開卡日："+format.format(expireDate)+"保固使用時間:"+warranty+"天";
        return description;}
	
	
}
