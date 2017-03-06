
public class Pepperoni extends ExtraCharges{

	Pizza pizza;
	public Pepperoni(Pizza pizza){
		
		this.pizza = pizza;
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Pepperoni";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 1.25;
		
	}

}
