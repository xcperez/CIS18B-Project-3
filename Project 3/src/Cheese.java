
public class Cheese extends ExtraCharges{

	Pizza pizza;
	
	public Cheese(Pizza pizza){
		
		this.pizza = pizza;
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Cheese";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.25 + pizza.cost();
	}

}
