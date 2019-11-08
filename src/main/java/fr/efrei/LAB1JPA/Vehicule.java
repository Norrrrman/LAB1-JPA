package fr.efrei.LAB1JPA;

public class Vehicule {
	
	private String platNumber;

	
	public Vehicule(String platNumber){
		this.platNumber = platNumber;
	}
	
	
	public void setPlatNumber(String platNumber) {
		this.platNumber = platNumber;
	}
	
	
	public String getPlatNumber() {
		return platNumber;
	}
	
}
