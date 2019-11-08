package fr.efrei.LAB1JPA;

public class Car extends Vehicule{
	
	private int numberOfSeats;
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	

	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	
	public Car(String platNumber, int numberOfSeats) {
		super(platNumber);
		this.numberOfSeats = numberOfSeats;
	}
}
