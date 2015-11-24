public class TandemBike extends Bicycle{
	public void speedUp(){
		this.speed+=speed-1;

	}
	
	public void applyBrakes(int speed){
		this.speed-=speed+1;
	}
}