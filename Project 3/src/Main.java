import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[]args){
		
		DecimalFormat df = new DecimalFormat("#.00");
		Pizza pizza;
		
		System.out.println("Welcome to Pizza Place");
		
		pizza = CarryoutOrDelivery();
		pizza = crust(pizza);
		pizza = addToppings(pizza);
		
		System.out.println(pizza.getDescription() + ": \n$" + df.format(pizza.cost()));
		
		System.out.println("Thank you and come again!");
		scan.close();
	}

	public static Pizza CarryoutOrDelivery(){
		
		Pizza pizza;
		String choice;
		System.out.println("Will this order be a carryout or delivery?");
		choice = scan.next();
		
		while(!choice.equalsIgnoreCase("carryout") && !choice.equalsIgnoreCase("delivery")){
			
			System.out.println("That was not a valid input. Please enter Carryout or Delivery.");
			
			choice = scan.next();
			choice.toUpperCase();
		
		}
		
		if(choice.equalsIgnoreCase("carryout") ){
			
			pizza = new Carryout();
			
		}else {
			
			pizza = new Delivery();
			
		}
		return pizza;
		
	}
	
	public static Pizza crust(Pizza pizza){
		
		int crust;
		System.out.println("What kind of crust would you like?\n"
				+ "1) Thin\n"
				+ "2) Thick\n"
				+ "3) Stuffed\n");


		crust = scan.nextInt();
		while(crust != 1 && crust != 2 && crust != 3){

			System.out.println("That was not a valid input. Please "
					+ "enter 1, 2, or 3.");
			crust = scan.nextInt();

		}
		switch (crust) {

		case 1:
			pizza.crust = 1;
			pizza = new Crust(pizza);
			break;

		case 2:
			pizza.crust = 2;
			pizza = new Crust(pizza);
			break;
	
		case 3:
			pizza.crust = 3;
			pizza = new Crust(pizza);	
			break;

		}
		return pizza;
	}

	public static Pizza addToppings(Pizza pizza){
		
		int toppings;
		System.out.println("What kind of toppings would you like to add?\n"
				+ "1) Cheese\n"
				+ "2) Pepperoni\n"
				+ "3) Mushrooms\n"
				+ "4) Pineapples\n"
				+ "5) Sausage\n"
				+ "0) Exit\n");

		toppings = scan.nextInt();

		while(toppings != 0){

			while(toppings != 1 && toppings != 2 && toppings != 3 &&
					toppings != 4 && toppings != 5){
	
				System.out.println("That was not a topping option. Please enter 1-6");
				toppings = scan.nextInt();
	
			}
			switch (toppings){

				case 1:
					pizza = new Cheese(pizza);
					break;
				case 2:
					pizza = new Pepperoni(pizza);
					break;
				case 3:
					pizza = new Mushrooms(pizza);
					break;
				case 4:
					pizza = new Pineapple(pizza);
					break;
				case 5:
					pizza = new Sausage(pizza);
					break;
				case 0:
					break;
			}
			toppings = scan.nextInt();
		}
		
		return pizza;
	}
}
