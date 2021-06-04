package aggAss;

public class Tester {

	public static void main(String[] args) {
		Food food1 = new Food("Pizza", "Italian", "Veg", 10, 8.0, 2);
		Food food2 = new Food("Pasta", "Italian", "Veg", 8, 6.0, 1);
		Food orderedFoods[] = new Food[] { food1, food2 };

		Order order = new Order(101, orderedFoods);
		Bill bill = new Bill("B5001", "Paypal");
		bill.generateBill(order);
		System.out.println("Order status: " + order.getStatus());

	}

}
