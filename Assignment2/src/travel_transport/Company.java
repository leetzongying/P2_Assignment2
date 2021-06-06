package travel_transport;

import java.util.*;

public abstract class Company { //abstract class

	Scanner in = new Scanner(System.in);
	
	protected String company, name, contact, website;
	protected int yearEstablished;
	
	public Company(String c, String n, int y, String c1, String w) {
		this.company = c;
		this.name = n;
		this.yearEstablished = y;
		this.contact = c1;
		this.website = w;
	}

	public abstract void printInfo(); //abstract method 
	

}
