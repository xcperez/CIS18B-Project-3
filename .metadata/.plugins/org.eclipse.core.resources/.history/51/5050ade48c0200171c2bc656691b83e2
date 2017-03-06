
public class Main {
	
	public static void main(String[]args){
		
		System.out.println("Welcome to Pizza Place");
		System.out.println("Will this order be a carryout or delivery?");
		
		Pizza pizza = new Delivery();
		
		
		pizza.size = 4;
		pizza = new Sizes(pizza);
		
		pizza.crust = 1;
		pizza = new Crust(pizza);
		pizza = new Pineapple(pizza);
		
		
		System.out.println(pizza.getDescription() + ", $" + pizza.cost());
		//System.out.println();
	}

	

}
