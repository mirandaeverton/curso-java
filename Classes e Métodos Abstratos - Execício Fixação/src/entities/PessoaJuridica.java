package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer employeesCount;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double annualRevenue, Integer employeesCount) {
		super(name, annualRevenue);
		this.employeesCount = employeesCount;
	}

	public Integer getEmployeesCount() {
		return employeesCount;
	}

	public void setEmployeesCount(Integer employeesCount) {
		this.employeesCount = employeesCount;
	}

	@Override
	public Double calculateTaxes() {
		if (employeesCount > 10) {
			return getAnnualRevenue() * 0.14;
		}
		
		return getAnnualRevenue() * 0.16;
	}

}
