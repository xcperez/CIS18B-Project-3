
public abstract class Pizza {
	
	String description = "Unknown";
	final int SMALL = 1;
	final int MEDIUM = 2;
	final int LARGE = 3;
	final int XLARGE = 4;
	final int THIN = 1;
	final int THICK = 2;
	final int STUFFED = 3;
	int crust = 0;
	int size = 0;
	
	public String getDescription(){
		
		return description;
		
	}
	
	public abstract double cost();
	
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
		
	}
	public int getCrust(){
		
		return crust;
	}

}
