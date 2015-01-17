
public class TestEmployee {

	
	public static void main(String[] args) {
		Manager mpl=new Manager("Andey",3000);
		mpl.setK(199);
		System.out.println(mpl);
		WageEmployee empl=new WageEmployee("Ana",4000,100,200);
		System.out.println(empl);
		SalesPerson pempl=new SalesPerson("Alla",5000,50,250,1000,15);
		System.out.println(pempl);
	}

}
