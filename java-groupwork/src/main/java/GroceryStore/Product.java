package GroceryStore;

public class Product {
	
	//Fruits and Vegetables
	private String name;
	private double price;
	private Category category;
	
	private enum Category{
		Bakery,
		Dairy,
		Deli,
		Floral,
		Frozen,
		GeneralMechandise,
		HealthAndBeauty,
		MeatAndSeafood,
		Pet,
		Tobacco,
		Wine,
		Grocery
	}
}
