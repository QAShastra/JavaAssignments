package JavaAssignmenst;

public class test_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product objproduct = new Product();
		objproduct.setProductId(101);
		objproduct.setProductName("test1");
		objproduct.setQuantity(4);
		objproduct.setPrice(230.49);
		
		System.out.println("Total Cost :" + objproduct.calculateTotalCost());
		
	}

}
