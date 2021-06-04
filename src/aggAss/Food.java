package aggAss;

//Placing the Order Details
public class Food {
	private String foodname;
	private String cuisine;
	private String foodtype;
	private int quantityAvailable;
	private double unitPrice;
	private int quantityRequired;

	public Food(String foodname, String cuisine, String foodtype, int quantityAvailable, double unitPrice,
			int quantityRequired) {
		this.foodname = foodname;
		this.cuisine = cuisine;
		this.foodtype = foodtype;
		this.quantityAvailable = quantityAvailable;
		this.quantityRequired = quantityRequired;

	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantityRequired() {
		return quantityRequired;
	}

	public void setQuantityRequired(int quantityRequired) {
		this.quantityRequired = quantityRequired;
	}

}
