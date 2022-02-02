package ej1Colecciones;

import java.util.Objects;

public class Cliente {
	private String name;
	private String nAccout;
	private Double salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getnAccount() {
		return nAccout;
	}
	public void setnAccount(String nAccout) {
		this.nAccout = nAccout;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Cliente(String name, String nAccout, double salary) {
		super();
		this.name = name;
		this.nAccout = nAccout;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Cliente name=" + name + ", nAccout=" + nAccout + ", salary=" + salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nAccout);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nAccout, other.nAccout);
	}

	
	
	
	
}
