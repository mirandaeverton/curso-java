package entities;

public class PessoaFísica extends Contribuinte {

	private Double healthExpenses;
	
	public PessoaFísica() {
		super();
	}
	
	public PessoaFísica(String name, Double annualRevenue, Double healthExpenses) {
		super(name, annualRevenue);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double calculateTaxes() {
		if (getAnnualRevenue() > 20000.0 && healthExpenses > 0.0) {
			return getAnnualRevenue() * 0.25 - healthExpenses * 0.5;
		}
		
		if (getAnnualRevenue() > 20000.0) {
			return getAnnualRevenue() * 0.25;
		}
		
		if (getAnnualRevenue() < 20000.0 && healthExpenses > 0.0) {
			return getAnnualRevenue() * 0.15 - healthExpenses * 0.5;
		}
		
		return getAnnualRevenue() * 0.15;
	}

}
