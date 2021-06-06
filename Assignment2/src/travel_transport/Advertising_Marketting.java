package travel_transport;

import java.util.*;

public class Advertising_Marketting extends Company{ //inheritance
	Scanner in = new Scanner(System.in);
	
	private String socialmedia, printmedia, description;
	private double prize;
	
	public Advertising_Marketting(String c, String n, int y, String c1, String w) { 
		super(c,n,y,c1,w);
		System.out.println(typeOfAdvertisement());
		System.out.println("Enter 1 to view online marketting, 2 for offline marketting");
		int choice;
		choice = in.nextInt();
		in.nextLine();
		
		if(choice == 1) {
			System.out.println("Enter social media name:");
			this.socialmedia = in.nextLine();
			setSocialMedia(socialmedia);
			this.description = onlineAdvertisement();
			setDescription(description);
		}
		else if(choice == 2) {
			System.out.println("Enter media name:");
			this.printmedia = in.nextLine();
			setPrintMedia(printmedia);
			System.out.println("Enter amount of prize:");
			this.prize = in.nextDouble();
			in.nextLine();
			setPrize(prize);
			this.description = offlineAdvertisement();
			setDescription(description);
		}
	}
	
	public String typeOfAdvertisement() {
		return "We have two types of advertisement."
				+ "\n1. Online advertisement on Social Media"
				+ "\n2. Offline advertisement on Printed Media";
	}
	
	public String onlineAdvertisement() {
	    return "====================ONLINE ADVERTISEMENT====================" +
		       "\nPosted on " + getSocialMedia() +
		       "\n********************GIVEAWAY EVENT******************" +
		       "\nOur company is helding a GIVEAWAY event!!!"
		       + "\nYou will have the chance to win one of our travel package ticket for free by following these 3 steps......"
				+ "\n1st Step\t: Like our page."
				+ "\n2nd Step\t: Like this post and share out this post in public."
				+ "\n3nd Step\t: Tag 3 friends in comment and state why you wanted to get this giveaway."
				+ "\nLucky winner will win the prize!!!"
				+ "\nThe lucky winner will be announced on 24 June 2021."
				+ "\nVisit our website now!!"
				+ "\nWebsite\t: " + super.website +
				"\nContact " + super.contact + " to inquire more about the promotion!";
	}
	
	public String offlineAdvertisement() {
		return "====================OFFLINE ADVERTISEMENT====================" +
		       "\nPosted on " + getPrintMedia() +
		       "\nAidilfitri festival season is Coming Soon!!!!"
				+ "\nJust come to our webiste and booking for your travel package in anywhere."
				+ "\nWe provide free cancellation in 30 days before departure and free lunch during travel."
				+ "\n***********PROMOTION***********"
				+ "\nYou will have the chance to get RM" + prize + " worth prize if you have spend over RM3000 cumulatively!!!" +
				"\nPrizes Included: \n1. Samsung Galaxy Note 3\n2. 4x Free Travel Ticket to Vietnam \n3. TY Travel Company Exclusive T-shirt \n4. Visit our website to view more!" 
				+ "\nThis promotion only valid until 1 August 2021."
				+ "\nHURRY UP!!! Pls dont miss this amazing promotion!!!"
				+ "\nVisit our website now!!"
				+ "\nWebsite\t: " + super.website +
				"\nContact " + super.contact + " to inquire more about the promotion!";
	}
	
	//encapsulation
	public void setSocialMedia(String sm) {
		this.socialmedia = sm;
	}
	public String getSocialMedia() {
		return this.socialmedia;
	}
	public void setPrintMedia(String pm) {
		this.printmedia = pm;
	}
	public String getPrintMedia() {
		return this.printmedia;
	}
	public void setDescription(String d) {
		this.description = d;
	}
	public String getDescription() {
		return this.description;
	}
	public void setPrize(double p) {
		this.prize = p;
	}
	public double getPrize() {
		return this.prize;
	}
	
	
	public void printInfo() { //polymorphism
		System.out.println(getDescription());
	}
}
