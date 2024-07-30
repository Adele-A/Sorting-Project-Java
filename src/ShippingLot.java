
public class ShippingLot {
	int numLaptop = 0;
	int numDesktop = 0;
	int numMouse = 0;
	int numLCDscreen = 0;
	int totalVolume = 0;
	
	
	public void VolumeCalc() {
		Laptop laptop = new Laptop();
		Desktop desktop = new Desktop();
		Mouse mouse = new Mouse();
		LCDscreen lcdScreen = new LCDscreen();
		int totalLaptopVol = this.numLaptop * laptop.getVolume();
		int totalDesktopVol = this.numDesktop * desktop.getVolume();
		int totalMouseVol = this.numMouse * mouse.getVolume();
		int totalLCDscreenVol = this.numLCDscreen * lcdScreen.getVolume();
		this.totalVolume = totalLaptopVol + totalDesktopVol + totalMouseVol + totalLCDscreenVol;
		
	}

}
