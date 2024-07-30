
public abstract class Item {
	

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
	
	double weight;
	public void setWeight(double value) {
		this.weight = value;
	}
	public double getWeight() {
		return weight;
	}
	
	private int volume = 0;
	public void setVolume(int value) {
		this.volume = value;
	}
	public int getVolume() {
		return volume;
	}


}
