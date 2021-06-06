package travel_transport;

//different implementation of payment for different travel packages

class PriceRateOne implements Payment{
	//calculate total price with no disc
	public double Price() {
		return 1200;
	}
	
	//calculate total price with discount
	public double totalPrice(double disc) {
		return 1200 * (1-disc);
	}
	

}

class PriceRateTwo implements Payment{
	public double Price() {
		return 1350;
	}
	
	//calculate total price with discount
	public double totalPrice(double disc) {
		return 1350 * (1-disc);
	}

	
}

class PriceRateThree implements Payment{
	public double Price() {
		return 1500;
	}
	
	//calculate total price with discount
	public double totalPrice(double disc) {
		return 1500 * (1-disc);
	}
	
}
