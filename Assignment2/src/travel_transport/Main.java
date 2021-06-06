package travel_transport;

import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to our Travel Agency!");
		

		System.out.println();
		
		System.out.println("Select yours to enter the page for registration.");
		System.out.println("1. Traveller \n2. Finance \n3. Marketing \n4. Package Information \n5. Employee Information");
		System.out.print("\nSelect\t\t\t\t: ");
		int option = in.nextInt();
		
        System.out.println();
		
		switch(option) {
		    
			case 1: 
				Customer c = new Customer("TY Adventure & Travel Agency", "Lee Tzong Ying", 2021, "+6011-20605128","www.tytravelagency.com.my");
				c.printInfo(); 
				switch(c.pkg){
				case 1: 
					c.printPackageOne(); 
					break;
				case 2: 
					c.printPackageTwo(); 
					break; 
				case 3: 
					c.printPackageThree();
					break; 
				default: 
					System.out.println("Invalid input!\nPlease type again.");
					System.exit(0);
				} 
				break;
			case 2:
				Finance f = new Finance("TY Adventure & Travel Agency", "Lee Tzong Ying", 2021, "+6011-20605128","www.tytravelagency.com.my");
				f.printInfo();
				break;
			case 3:
				Advertising_Marketting a = new Advertising_Marketting("TY Adventure & Travel Agency", "Lee Tzong Ying", 2021, "+6011-20605128","www.tytravelagency.com.my");
				a.printInfo();
				break;
			case 4:
				Product_Description p = new Product_Description("TY Adventure & Travel Agency", "Lee Tzong Ying", 2021, "+6011-20605128","www.tytravelagency.com.my");
				p.printInfo();
				break;
			case 5:
				Employee e = new Employee("TY Adventure & Travel Agency", "Lee Tzong Ying", 2021, "+6011-20605128","www.tytravelagency.com.my");
				e.printInfo();
				break;
			default:
				System.out.println("Invalid input!\nPlease type again.");
				System.exit(0);
	}

		in.close();
}
}
