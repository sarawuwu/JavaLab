package equals;

import java.util.Objects;

public class Employee {
	
	private String id;

	public Employee(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		//都是Emoloyee才要比
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj; 
			//因為object型態沒有id屬性可以比較，所以要強制轉型成Emoloyee
			//比 id,id一樣 return true
			if(this.id.equals(emp.id)) {
				return true;
			}else {
				return false;
			}
		}
		//其他的情況，例如Employee比Car,直接return false
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id); //利用官方工程師寫好的objects
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee "+ id + " GC!!!");
		//清除最後的資源，關閉檔案，關閉資料庫的連線 最後的機會!!但一般情況下極少用到，另有其他方式可以達到這個目的
	}
	
}
