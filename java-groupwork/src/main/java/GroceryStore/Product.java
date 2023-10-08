package GroceryStore;

public class Product {
	
	//Fruits and Vegetables
	private String name;
	private float price;
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
