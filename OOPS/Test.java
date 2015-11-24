

public class Test{

	public static void main(String[] args){
		System.out.println("Hello World!!");

		  int bitmask = 0x000F;
        int val = 0x2222;
         System.out.println(val);
         System.out.println(bitmask);
         
        // prints "2"
        System.out.println(val & bitmask);


		int number =100_111_23;
		Bicycle roadBicycle=new RoadBike();
		roadBicycle.printState();
		roadBicycle.speedUp(10);
		roadBicycle.setCadence(1);
		roadBicycle.setGear(5);
		roadBicycle.printState();

		

		Bicycle mountainBicyle=new MountainBike();
		mountainBicyle.applyBrakes(5);
		mountainBicyle.printState();


		Bicycle tandemBicyle=new TandemBike();
		tandemBicyle.applyBrakes(5);
		tandemBicyle.printState();



	}

}