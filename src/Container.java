
public abstract class Container {
	 
	private double weight = 0;
	public void setWeight(double value) {
		this.weight = value;
	}
	public double getWeight() {
		return weight;
	}
	
	int height;
	public void setHeight(int value) {
		this.height = value;
	}
	public int getHeight() {
		return height;
	}
	int width;
	public void setWidth(int value) {
		this.width = value;
	}
	public int getWidth() {
		return width;
	}
	int length;
	public void setLength(int value) {
		this.length = value;
	}
	public int getLength() {
		return length;
	}
	
	private int shippingCost;
	public void setShippingCost(int value) {
		this.shippingCost = value;
	}
	public int getShippingCost() {
		return shippingCost;
	}
	
	private int volume = 0;
	public void setVolume(int value) {
		this.volume = value;
	}
	public int getVolume() {
		return volume;
	}

	
	
	
	public abstract void addItem(Item item);

	

}
