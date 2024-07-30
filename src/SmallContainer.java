
public class SmallContainer extends Container{
	
	SmallContainer() {
		this.setHeight(259);
		this.setWidth(243);
		this.setLength(606);
		this.setShippingCost(1000);
		this.setVolume(this.height * this.length * this.width);
	}


	@Override
	public void addItem(Item item) {
		// TODO to implement 
		shippingCostCalc(item);
	
	}


	private void shippingCostCalc(Item item) {
		double currentWeight = this.getWeight();
		currentWeight = currentWeight + item.weight;
		this.setWeight(currentWeight);
		if (currentWeight > 500.00) {
			this.setShippingCost(1200);
		}
	}

}


