package travel_transport;

import java.util.*;

public class Finance extends Employee{ //inheritance
	
	Scanner in = new Scanner(System.in);
	
	private double utilityFee, advertisementFee, prize, travelincome;
	private int employeeQuantity, customerQuantity;
	
	public Finance(String c, String n, int y, String c1, String w) {
		super(c,n,y,c1,w);
		System.out.println("Please enter the details for Finance: ");
		
		System.out.println("Utility Fee budgeted: RM");
		this.utilityFee = in.nextDouble();
		setUtilityFee(utilityFee);
		
		System.out.println("Advertisement Fee budgeted: RM");
		this.advertisementFee = in.nextDouble();
		setAdvertisement(advertisementFee);
		
		System.out.println("Prize budgeted: RM");
		this.prize = in.nextDouble();
		setPrize(prize);
		
		System.out.println("Employee Salary: RM" + super.salary);
		
		System.out.println("Quantity of Employee: ");
		this.employeeQuantity = in.nextInt();
		setEmployeeQuantity(employeeQuantity);
		
		System.out.println("Travel Income: RM ");
		this.travelincome = in.nextDouble();
		setTravelIncome(travelincome);
		
		System.out.println("Quantity of Customer: ");
		this.customerQuantity = in.nextInt();
		setCustomerQuantity(customerQuantity);
	}
	
	//encapsulation
	public void setUtilityFee(double u) {
		this.utilityFee = u;
	}
	public double getUtilityFee() {
		return this.utilityFee;
	}
	public void setAdvertisement(double a) {
		this.advertisementFee = a;
	}
	public double getAdvertisement() {
		return this.advertisementFee;
	}
	public void setPrize(double p) {
		this.prize = p;
	}
	public double getPrize() {
		return this.prize;
	}
	public void setEmployeeQuantity(int eq) {
		this.employeeQuantity = eq;
	}
	public int getEmployeeQuantity() {
		return this.employeeQuantity;
	}
	public void setTravelIncome(double ti) {
		this.travelincome = ti;
	}
	public double getTravelIncome() {
		return this.travelincome;
	}
	public void setCustomerQuantity(int cq) {
		this.customerQuantity = cq;
	}
	public int getCustomerQuantity() {
		return this.customerQuantity;
	}
	
	public double totalSalary() {
		return super.salary * this.employeeQuantity;
	}

	public double totalIncome() { 
		return this.travelincome * this.customerQuantity;
	}

	public double totalBudget() {
		return (totalSalary() + this.utilityFee + this.advertisementFee + this.prize);
	}

	public double calcProfit() {
		if(totalIncome() > totalBudget())
			System.out.println("\nMessage: We are now making profit!");
		else
			System.out.println("\nMessage: We are losing profit!");
		
		return totalIncome() - totalBudget();
		
	}
	
	public void printInfo() { //polymorphism
		System.out.println("Finance Details:");
		System.out.println("----------------");
		System.out.printf("Utility Fee: RM%.2f",getUtilityFee());
		System.out.printf("\nAdvertisement Fee: RM%.2f",getAdvertisement());
		System.out.printf("\nPrize promotion budgeted: RM%.2f", getPrize());
		System.out.printf("\nEmployee salary: RM%.2f", super.salary);
		System.out.println("\nQuantity of employee: " + getEmployeeQuantity());
		System.out.printf("Total Salary: RM%.2f", totalSalary());
		System.out.printf("\nTravel income: RM%.2f", getTravelIncome());
		System.out.println("\nQuantity of customers:" + getCustomerQuantity());
		System.out.printf("Total Income: RM%.2f", totalIncome());
		System.out.printf("\nTotal Budget: RM%.2f", totalBudget());
		System.out.printf("Total net profit: RM%.2f", calcProfit());
		
	}
	}


