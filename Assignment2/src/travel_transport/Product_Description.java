package travel_transport;

import java.util.*;

public class Product_Description extends Company { //inheritance

	Scanner in = new Scanner(System.in);
	
	protected int pkg;
	
	public Product_Description(String c, String n, int y, String c1, String w) {
		super(c,n,y,c1,w);
		System.out.println("Enter the number for travel package:");
		System.out.println("1. Johor Bahru to Penang Island Transfer\n2. Malacca to Kuantan Transfer\n3. Kuala Lumpur to Mersing Transfer");
		this.pkg = in.nextInt();
		in.nextLine();
		
	}
	
	public void printPackageOne() {
		System.out.println("Get the best out of the private city transfer plus tour at the best rate!");
		System.out.println("Visit the iconic building of Kuala Lumpur Petronas Twin Tower KLCC while having a private transfer from Johor Bahru to Penang Island for a total of 11 hours.");
		System.out.println("Sit back and relax, enjoy the seamless pleasant transfer with safe and smooth private transportation service with us.");
		System.out.println("This is the best budget personalized private chauffeur tour + transfer!");
	}
	
	public void printPackageTwo() {
		System.out.println("Get the best out of the private city transfer plus nice greenery view along the trip at the best rate!");
		System.out.println("Explore the local food and stop for a nature chilling waterfall while having a private transfer from Malacca to Cherating Clubmed or Kuantan for a total of 7 hours.");
		System.out.println("Sit back and relax, enjoy the seamless pleasant transfer with safe and smooth private transportation service with us.");
		System.out.println("This is the best budget personalized private chauffeur tour + transfer!");
	}
	
	public void printPackageThree() {
		System.out.println("Get the best out of the private city transfer plus tour at the best rate!");
		System.out.println("Visit the UNESCO Listed sites at the Historical Malacca while having a private transfer from Kuala Lumpur to Mersing for a total of 10 hours.");
		System.out.println("Sit back and relax, enjoy the seamless pleasant transfer with safe and smooth private transportation service with us.");
		System.out.println("This is the best budget personalized private chauffeur tour + transfer!");
	}
	
	public void printInfo() { //polymorphism
		System.out.println("Travel Package Details: ");
		System.out.println("============================================================");
		System.out.println("Travel Package Selected: " + this.pkg);
		System.out.println("Contact this number to inquire more details: " + super.contact);
		if(pkg == 1) {
			printPackageOne();
		}else if(pkg == 2) {
			printPackageTwo();
		}else if(pkg == 3) {
			printPackageThree();
		}
	}
}
