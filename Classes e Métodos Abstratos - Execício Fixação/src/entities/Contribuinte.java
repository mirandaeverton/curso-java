package entities;

public abstract class Contribuinte {
	private String name;
	private Double annualRevenue;
	
	public Contribuinte() {
	}

	public Contribuinte(String name, Double annualRevenue) {
		this.name = name;
		this.annualRevenue = annualRevenue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualRevenue() {
		return annualRevenue;
	}

	public void setAnnualRevenue(Double anualRevenue) {
		this.annualRevenue = anualRevenue;
	}
	
	public abstract Double calculateTaxes();

}
