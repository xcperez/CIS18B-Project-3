
public class Pineapple extends ExtraCharges{

	Pizza pizza;
	
	public Pineapple(Pizza pizza){
		
		this.pizza = pizza;
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", Pineapple";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.25 + pizza.cost();
		
	}

}
