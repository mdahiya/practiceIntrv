public class Bicycle{

int cadence;
int speed;
int gear;

	public Bicycle(){
		this.cadence=0;
		this.speed=0;
		this.gear=0;
	}

public void setCadence(int cadence){
	cadence=cadence;
}

public void speedUp(int speed){
	speed+=speed;
}

public void setGear(int gear){
	this.gear=gear;
}

public void applyBrakes(int speed){
	this.speed-=speed;
}

public void printState(){
	System.out.println("Bicycle state is:- \t cadence: "+this.cadence+"\t speed: "+ this.speed+"\t gear: "+this.gear);
}


}