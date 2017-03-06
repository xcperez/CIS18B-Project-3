
public class Carryout extends Pizza{

	//returns 0 because carryout has no extra charge.
	
	public Carryout(){
		
		description = "Carryout";
		
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
