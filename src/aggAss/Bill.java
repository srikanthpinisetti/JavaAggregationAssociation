package aggAss;

//Generating bill using Order

public class Bill {
	private int counter;
	private String billId;
	private String paymentMode;

	public Bill(String billId, String paymentMode) {
		this.billId = billId;
		this.paymentMode = paymentMode;
	}

	public boolean generateBill(Order order) {
		System.out.println("Bill details \n******");
		System.out.println("Bill Id: " + this.getBillId());
		System.out.println("Items ordered: ");

		for (Food food : order.getOrderedfoods()) {
			System.out.println(food.getFoodname());
		}
		double payableAmount = order.calculateTotalPrice(this.getPaymentMode());
		System.out.println("Payable Amount : $" + (int) (payableAmount * 100) / 100.0);
		return true;

	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	

}
