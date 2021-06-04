package aggAss;

public class Order {
	private int orderId;
	private double totalPrice;
	private String status;
	private Food orderedfoods[];
	
	public Order(int orderId, Food[] orderedfoods) {
		this.orderId = orderId;
		this.orderedfoods = orderedfoods;
		this.status = "Ordered";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Food[] getOrderedfoods() {
		return orderedfoods;
	}

	public void setOrderedfoods(Food[] orderedfoods) {
		this.orderedfoods = orderedfoods;
	}
	
	public double calculateTotalPrice(String PaymentMode) {
		double amount=0;
		for(int i=0; i<this.orderedfoods.length; i++) {
			if(this.orderedfoods[i].getQuantityRequired() <= this.orderedfoods[i].getQuantityAvailable()) {
				amount = amount+(this.getOrderedfoods()[i].getQuantityRequired()*this.getOrderedfoods()[i].getUnitPrice());
				
			}
			// 0<2
			//2<=10
		}
		if(PaymentMode == "Paypal") {
			amount = amount-(amount*0.02); // discount of 2%
			return amount;
		}
		    return amount;
	}

}
