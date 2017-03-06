
public class Sizes extends ExtraCharges{

	Pizza pizza;
	
	public Sizes(Pizza pizza){
		
		this.pizza = pizza;
		
	}
	public int getSize(){
		
		return pizza.getSize();
		
	}
	@Override
	public String getDescription() {
		
		if(getSize() == pizza.SMALL){
			
			return pizza.getDescription() + ", Small";
					
		}else if (getSize() == pizza.MEDIUM){
			
			return pizza.getDescription() + ", Medium";
			
		}else if(getSize() == pizza.LARGE){
			
			return pizza.getDescription() + ", Large";
			
		}else if(getSize() == pizza.XLARGE){
			
			return pizza.getDescription() + ", Extra Large";
		}
		return pizza.getDescription();
		
		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = pizza.cost();
		
		if(getSize() == pizza.SMALL){
			
			cost += 10;
					
		}else if (getSize() == pizza.MEDIUM){
			
			cost += 14;
			
		}else if(getSize() == pizza.LARGE){
			
			cost += 18;
		}else if(getSize() == pizza.XLARGE){
			
			cost += 22;
		}
		return cost;
	}
	
	

}
