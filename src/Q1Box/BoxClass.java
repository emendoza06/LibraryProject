package Q1Box;

public class BoxClass {
	private int height; 
	private int length; 
	private int depth;
	private double cost = 1.33;
	private int surfaceArea;
	
	//Getters and setters
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	} 
	public void setsurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public int getsurfaceArea() {
		return surfaceArea;
	}
	public double getCost() {
		return cost;
		}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	//methods 
	public int  volume() { 
		return (length * depth* height); 
				
	}
	public int SA() {
		int surfaceArea = (2*length*depth) + (2 * length * height) + (2*depth*height);
		return surfaceArea;
	}
		 
		
	public double cost() { 
		return (cost * (2*length*depth) + (2 * length * height) + (2*depth*height) );
		
	}

}

