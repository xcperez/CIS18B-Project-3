
public class Crust extends ExtraCharges{

	Pizza pizza;
	
	public Crust(Pizza pizza){
		
		this.pizza = pizza;
		
	}
	public int getCrust(){
		
		return pizza.getCrust();
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		
		if(getCrust() == pizza.THIN){
			
			return pizza.getDescription() + ", Thin Crust";
			
		}else if (getCrust() == pizza.THICK){
			
			return pizza.getDescription() + ", Thick Crust";
			
		}else if(getCrust() == pizza.STUFFED){
			
			return pizza.getDescription() + ", Stuffed Crust";
			
		}
		return pizza.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		
		if(getCrust() == pizza.STUFFED){
			
			return 4 + pizza.cost();
			
		}
		return pizza.cost();
		
	}
	
	

}
