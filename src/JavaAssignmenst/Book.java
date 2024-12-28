package JavaAssignmenst;

public class Book{
	
	int BookId;
	String BookName;
	double price;
	int quantity;
	
	public int getBookId() {
		return BookId;
	}

	public void setBookId(int BookId) {
		this.BookId = BookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String BookName) {
		this.BookName = BookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public void displayBookDetails() {
		
		System.out.println("BookId : " + getBookId() );
		System.out.println("BookName : " + getBookName());
		System.out.println("Price : " + getPrice());
		System.out.println("Quantity : " + getQuantity() );
	}

	public static void main(String[] args) {
		
		Book objBook= new Book();
		objBook.setBookId(100);
		objBook.setBookName("B112");
		objBook.setPrice(500);
		objBook.setQuantity(6);
		
		objBook.displayBookDetails();
		
		
	}

}
