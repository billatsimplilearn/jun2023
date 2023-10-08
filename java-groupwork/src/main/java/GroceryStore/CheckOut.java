package GroceryStore;

import java.util.Queue;

public class CheckOut {
	private Employee cashier;
	private Customer customerIsCheckingOut;
	private Queue<Customer> customersWaitingToCheckOut;
	
	
	public void checkOut()
	{
		while(!customersWaitingToCheckOut.isEmpty())
		{
			customerIsCheckingOut = customersWaitingToCheckOut.poll();
			checkOutCurrentCustomer();
		}
	}
	private void checkOutCurrentCustomer()
	{
		//Check out current Cusutomer
	}
}
