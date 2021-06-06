package travel_transport;

import java.util.*;

public class Employee extends Company { //inheritance
   
	Scanner in = new Scanner(System.in);
	
	String name, position, ID;
	double salary;
	
	public Employee(String c, String n, int y, String c1, String w) {
		super(c,n,y,c1,w);
		System.out.println("Enter details of employee:");
		System.out.println("Name of employee:");
		this.name = in.nextLine();
		System.out.print("Position: ");
		this.position = in.nextLine();
		System.out.print("Employee ID: ");
		this.ID = in.nextLine();
		System.out.println("Salary(RM):");
		this.salary = in.nextDouble();	
		in.nextLine();
	}

    public void printInfo() { //polymorphism
    	System.out.println("Name of employee: " + name);
    	System.out.println("Position: " + position);
    	System.out.println("Employee ID: " + ID);
    	System.out.printf("Salary: RM%.2f" , salary);
    	System.out.println("\nContact no: " + super.contact);
    	System.out.println();
    }
}
