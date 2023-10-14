package com.simplilearn.grocery;

public class GroceryStoreApp {
	
	public static void main(String[] args) {
		
		GroceryStoreApp groceryStoreApp = new GroceryStoreApp();
		
		ProductInventoryService productInventoryService = groceryStoreApp.initializeProductInventory();
		ProductService productService = groceryStoreApp.initializeProduct();
		groceryStoreApp.loadShoppingCart(productInventoryService);
	}
	
	public ProductInventoryService  initializeProductInventory() {
		ProductInventoryService productInventoryService = new ProductInventoryService();
		ProductInventory fruitRedApple = new ProductInventory("11",10);
		ProductInventory fruitHoneyCrispApple = new ProductInventory("12", 10);
		ProductInventory fruitGrannySmithGreenApple = new ProductInventory("13", 10);
		ProductInventory fruitRedGalaApple = new ProductInventory("14", 10);
		ProductInventory fruitYellowBanana = new ProductInventory("15", 10);
		ProductInventory fruitYellowOrganicBanana = new ProductInventory("16", 10);
		ProductInventory fruitNavalOrange = new ProductInventory("17", 10);
		ProductInventory vegetableGreenBeans = new ProductInventory ("21", 10);
		ProductInventory vegetablePotatoesIdaho = new ProductInventory ("22", 10);
		ProductInventory vegetableRedOnion = new ProductInventory("23", 10);
		ProductInventory vegetableWhiteOnion = new ProductInventory("24", 10);
		ProductInventory meatChicken = new ProductInventory("31", 10);
		ProductInventory meatPork = new ProductInventory("32", 10);
		ProductInventory meatBeef = new ProductInventory("33", 10);
		
		productInventoryService.addProductInventory(fruitRedApple);
		productInventoryService.addProductInventory(fruitHoneyCrispApple);
		productInventoryService.addProductInventory(fruitGrannySmithGreenApple);
		productInventoryService.addProductInventory(fruitRedGalaApple);
		productInventoryService.addProductInventory(fruitYellowBanana);
		productInventoryService.addProductInventory(fruitYellowOrganicBanana);
		productInventoryService.addProductInventory(fruitNavalOrange);
		productInventoryService.addProductInventory(vegetableGreenBeans);
		productInventoryService.addProductInventory(vegetablePotatoesIdaho);
		productInventoryService.addProductInventory(vegetableRedOnion);
		productInventoryService.addProductInventory(vegetableWhiteOnion);
		productInventoryService.addProductInventory(meatChicken);
		productInventoryService.addProductInventory(meatPork);
		productInventoryService.addProductInventory(meatBeef);
		
		return productInventoryService;	
	}
	
	public ProductService initializeProduct() {
		ProductService productService = new ProductService();
		Product redApple = new Product("11", "Fruit Red Apple", 1.00);
		Product honeyCrispApple = new Product("12", "Fruit HoneyCrisp Apple", 1.00);
		Product grannySmithGreenApple = new Product("13", "Fruit GrannySmith Green Apple", 1.00);
		Product rGalaApple = new Product("14", "Fruit Red Gala Apple", 1.00);
		Product yellowBanana = new Product("15", "Fruit Yellow Banana", 1.00);
		Product yellowOrganicBanana = new Product("16", "Fruit Yellow Organic Apple", 1.00);
		Product navalOrange = new Product("17", "Fruit Novel Orange", 1.00);
		Product greenBeans = new Product ("21", "Vegetable Green Beans Raw", 0.50);
		Product potatoesIdaho = new Product ("22", "Idaho Vegetable Potatoes", 0.50);
		Product redOnion = new Product("23", "Red Onions", 0.50);
		Product whiteOnion = new Product("24", "White Onions", 0.50);
		Product chicken = new Product("31", "Chicken 1.0 lb", 2.00);
		Product pork = new Product("32", "Pork 1.0", 2.00);
		Product beef = new Product("33", "Beef", 2.00);
		
		productService.addProduct(redApple);
		productService.addProduct(chicken);
		productService.addProduct(redOnion);
		productService.addProduct(yellowBanana);
		productService.addProduct(whiteOnion);
		productService.addProduct(honeyCrispApple);
		productService.addProduct(grannySmithGreenApple);
		productService.addProduct(rGalaApple);
		productService.addProduct(yellowOrganicBanana);
		productService.addProduct(navalOrange);
		productService.addProduct(greenBeans);
		productService.addProduct(potatoesIdaho);
		productService.addProduct(pork);
		productService.addProduct(beef);
		
		return productService;
	}
	
	public void loadShoppingCart(ProductInventoryService service) {
		ShoppingCart cart = new ShoppingCart();
		service.addToShoppingCart(new Product ("15", "Fruit Yellow Banana",1.00 ),2, cart);
		System.out.println("*****************Ordered List in the Shopping Cart***************");
		for (Cart items : cart.getCartItems()) {
			System.out.println(items.getProduct() + " : $" + items.getTotalPrice());
		}
	}

}
