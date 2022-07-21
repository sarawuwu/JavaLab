package extend;

import java.text.SimpleDateFormat;
import java.util.Date; //utility, java.sql.Date

public class Food extends Product {


    private Date expireDate;

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd"); //y:year,M:month(小寫m代表分),d:day HH:mm:ss
        description = description +",到期日："+format.format(expireDate);
        return description;
    }
}
