public class RoadBike extends Bicycle{
	public void speedUp(){
		this.speed+=speed;

	}
	
	public void applyBrakes(int speed){
		this.speed-=speed;
	}

}