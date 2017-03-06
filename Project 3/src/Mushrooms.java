
public class Mushrooms extends ExtraCharges{

	Pizza pizza;
	public Mushrooms(Pizza pizza){
		
		this.pizza = pizza;
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Mushrooms";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 1.25;
	}

}
