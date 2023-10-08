package GroceryStore;

import java.util.Queue;

public class CheckOut {
	Employee cashier;
	Customer customerIsCheckingOut;
	Queue<Customer> customersWaitingToCheckOut;
	private void CheckOut()
	{
		while(customersWaitingToCheckOut.isEmpty())
		{
			customerIsCheckingOut = customersWaitingToCheckOut.poll();
			CheckOutCurrentCustomer();
		}
	}
	private void CheckOutCurrentCustomer()
	{
		//Check out current Cusutomer
	}
}
