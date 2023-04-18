package study10;

public class CustomerRun {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.comp();
		System.out.printf("\n");
		
		Buy buyer = customer;
		buyer.buy();
		//buyer.sell(); 접근불가능
		buyer.order();
		//buyer.comp(); 접근불가능
		System.out.printf("\n");
		
		Sell seller = customer;
		//seller.buy(); 접근불가능
		seller.sell();
		seller.order();
		//seller.comp(); 접근불가능
	}

}
