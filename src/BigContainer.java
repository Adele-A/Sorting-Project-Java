
public class BigContainer extends Container{

	BigContainer() {
		this.setHeight(259);
		this.setWidth(243);
		this.setLength(1201);
		this.setShippingCost(1800);
		this.setVolume(this.height * this.length * this.width);
	}

	@Override
	public void addItem(Item item) {
		// TODO to implement 
		
	}


}
