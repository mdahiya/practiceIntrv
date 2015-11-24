public class MountainBike extends Bicycle{

	public void speedUp(){
		this.speed+=speed-2;

	}
	
	public void applyBrakes(int speed){
		this.speed-=speed+2;
	}

}
