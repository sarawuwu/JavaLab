package func;

public class TestPeople {

	public static void main(String[] args) {

		People p = new People();
		p.height = 1.7;
		p.weight = 65;
		double bmi = p.getBMI(); //shift+alt+l    類別名稱.屬性
		System.out.printf("BMI=%.1f,%s%n",bmi,bmi>People.overWeightBMI ? "過重":"正常");
		
		
		double bmi2 = People.BMI(80, 1.7);
		System.out.println("stctic BMI="+ bmi2);

		//靜態方法，在eclips會用斜體顯示；物件是用正體
		System.out.println(String.join("$", "1","2","3"));
	
	
	
	
	
	}

}
