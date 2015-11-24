public class Player{

	private String name;
	private int jerseyNo;
	private int age;
	private int recruitmentYear;

	public Player(){

	}

	public Player(String name, int jerseyNo,int age,int recruitmentYear){
		this.name=name;
		this.jerseyNo=jerseyNo;
		this.age=age;
		this.recruitmentYear=recruitmentYear;
	}
	public void setName(String playerName){
		this.name=playerName;
	}

	public String getName(){
		return this.name;
	}

	public void setJerseyNo(int jeryseyNo){
		this.jerseyNo=jeryseyNo;

	}

	public int getJerseyNo(){
		return jerseyNo;
	}

	public void setAge(int age){
		this.age=age;
	}

	public int getAge(){
		return age;
	}


	public void setRecruitmentYear(int recruitmentYear){
		this.recruitmentYear=recruitmentYear;
	}

	public int getRecruitmentYear(){
		return recruitmentYear;
	}

		@Override
	public int hashCode(){
		return 31 * this.name.hashCode();

	}

	public boolean equals(Player playerObj){
		return this.name.equals(playerObj.getName())?(this.jerseyNo==playerObj.getJerseyNo())?true:false:false;
	}


	
}