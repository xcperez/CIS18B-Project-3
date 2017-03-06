
public class Sausage extends ExtraCharges{

	Pizza pizza;
	public Sausage(Pizza pizza){
		
		this.pizza = pizza;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Sausage";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 1.25;
	}

}
