
import java.util.Scanner;

public class BestShippingCalculation {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		ShippingLot shippingLot = new ShippingLot();

		
			try {
			
				System.out.println("Please input the number of items you wish to ship. ");
				System.out.println("Laptops: ");
				shippingLot.numLaptop = scanner.nextInt(); 
				System.out.println("Desktops: ");
				shippingLot.numDesktop = scanner.nextInt();
				System.out.println("Mouses: ");
				shippingLot.numMouse = scanner.nextInt(); 
				System.out.println("LCDscreens: ");
				shippingLot.numLCDscreen = scanner.nextInt(); 
			
			} catch(Exception e) {
				System.out.println("Error. Please only input an integer number.");
				System.out.println("Please restart the program.");
				System.exit(1);
			}
		
		shippingLot.VolumeCalc();
		
		BigContainer bigContainer = new BigContainer();
		
		SmallContainer smallContainer = new SmallContainer();

		
		int numBigContainers = shippingLot.totalVolume / bigContainer.getVolume();
		
		int remainderVolume =  shippingLot.totalVolume % bigContainer.getVolume();
		
		int numSmallContainers = remainderVolume / smallContainer.getVolume();
	
		if (remainderVolume % smallContainer.getVolume() != 0) {
			numSmallContainers++;
		}
		
		int numshippingFees = numBigContainers * bigContainer.getShippingCost() + numSmallContainers * smallContainer.getShippingCost();
		
		System.out.format("For the amount of items that you have inputted, you will need %d big containers and %d small containers.", numBigContainers, numSmallContainers);
		
		
		
		
//		
//		System.out.println(bigContainer.getShippingCost());
//		
//		System.out.println(smallContainer.getShippingCost());
//		
//		Desktop item1 = new Desktop(100, 150, 50, 20);
//		
//		smallContainer.addItem(item1);
//		
//		System.out.println(smallContainer.getShippingCost());
//		System.out.println(smallContainer.getWeight());
//
//		
//		
//		Laptop item2 = new Laptop(100, 150, 50, 2000);
//		
//		smallContainer.addItem(item2);
//		
//
//		System.out.println(smallContainer.getShippingCost());
//		System.out.println(smallContainer.getWeight());

		
	}

}
