package JavaAssignmenst;

public class Product  {

	
	int productId; 
	String productName;
	double price;
	int quantity;
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

		public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
        } else {
            throw new IllegalArgumentException("The price must be greater than 0.");
        }
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		
		if (quantity >= 0) {
			this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("The quantity cannot be negative.");
        }
		
	}

	
	public double calculateTotalCost() {
		
		double total_Cost = price*quantity;
		return total_Cost;
	}  
	

}
