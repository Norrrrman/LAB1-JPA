package fr.efrei.LAB1JPA;

public class Van extends Vehicule {
	
	private double maxWeight;
	
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	
	public double getMaxWeight() {
		return maxWeight;
	}
	

	public Van(String platNumber, double maxWeight) {
		super(platNumber);
		this.maxWeight = maxWeight;
	}
	
	
}
