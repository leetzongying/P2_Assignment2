package travel_transport;

import java.util.*;

public class Customer extends Product_Description{ //inheritance

	Scanner in = new Scanner(System.in);
	
	private String customername, gender, phone;
	private int age, family;
	double newprice, disc;
	
	public Customer(String c, String n, int y, String c1, String w){ 
		super(c,n,y,c1,w);
		System.out.println("Enter name of customer:");
		this.customername = in.nextLine();
		setCustomerName(customername);
		System.out.println("Enter gender:");
		this.gender = in.nextLine();
		setGender(gender);
		System.out.println("Enter age of customer:");
		this.age = in.nextInt();
		setAgeCustomer(age);
		in.nextLine();
		System.out.println("Enter phone number:");
		this.phone = in.nextLine();
		setCustomerPhone(phone);
		System.out.println("Enter number of person travelled together with customer:");
		this.family = in.nextInt();
		setCustomerFollower(family);
		in.nextLine();
		
		if(super.pkg == 1) {
		Payment p1 = new PriceRateOne();
		if(this.family <= 4) {
			this.newprice = (p1.Price() * getCustomerFollower());
			System.out.printf("Total price paid: RM%.2f", newprice);
			System.out.println();
		}else if(this.family>4) {
			Discount d = new DiscountRate();
			this.disc = d.discountRate();
			double orgP = (p1.Price() * getCustomerFollower());
			this.newprice = (p1.totalPrice(disc)*getCustomerFollower());
			System.out.println("Discount given: " + disc + "%");
			System.out.printf("Original price paid: RM%.2f", orgP);
			System.out.printf("\nTotal price paid: RM%.2f", newprice);
			System.out.println();
		}
		}else if(super.pkg == 2) {
			Payment p1 = new PriceRateTwo();
			if(this.family <= 4) {
				this.newprice = (p1.Price() * getCustomerFollower());
				System.out.printf("Total price paid: RM%.2f", newprice);
				System.out.println();
			}else if(this.family>4) {
				Discount d = new DiscountRate();
				this.disc = d.discountRate();
				double orgP = (p1.Price() * getCustomerFollower());
				this.newprice = (p1.totalPrice(disc)*getCustomerFollower());
				System.out.println("Discount given: " + disc + "%");
				System.out.printf("Original price paid: RM%.2f", orgP);
				System.out.printf("\nTotal price paid: RM%.2f", newprice);
				System.out.println();
			}
		}else if(super.pkg == 3) {
			Payment p1 = new PriceRateThree();
			if(this.family <= 4) {
				this.newprice = (p1.Price() * getCustomerFollower());
				System.out.printf("Total price paid: RM%.2f", newprice);
				System.out.println();
			}else if(this.family>4) {
				Discount d = new DiscountRate();
				this.disc = d.discountRate();
				double orgP = (p1.Price() * getCustomerFollower());
				this.newprice = (p1.totalPrice(disc)*getCustomerFollower());
				System.out.println("Discount given: " + disc + "%");
				System.out.printf("Original price paid: RM%.2f", orgP);
				System.out.printf("\nTotal price paid: RM%.2f", newprice);
				System.out.println();
			}
		}
	}
	
	//encapsulation
	public void setCustomerName(String cname) {
		this.customername = cname;
	}
	public String getCustomerName() {
		return this.customername;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return this.gender;
	}
	public void setAgeCustomer(int age) {
		this.age = age;
	}
	public int getAgeCustomer() {
		return this.age;
	}
	public void setCustomerPhone(String phone) {
		this.phone = phone;
	}
	public String getCustomerPhone() {
		return this.phone;
	}
	public void setCustomerFollower(int f) {
		this.family = f;
	}
	public int getCustomerFollower() {
		return this.family;
	}

     public void printInfo() { //polymorphism
    	System.out.println("Customer Details");
    	System.out.println("-------------------------");
    	System.out.println("Name of customer: " + getCustomerName());
    	System.out.println("Gender of customer: " + getGender());
    	System.out.println("Age of customer: " + getAgeCustomer());
    	System.out.println("Contact no of customer: " + getCustomerPhone());
    	System.out.println("Number of followers of customer: " + getCustomerFollower());
    	System.out.println("-------------------------");
    }
}
