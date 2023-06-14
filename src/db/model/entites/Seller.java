package db.model.entites;

import java.util.Date;
import java.util.Objects;

public class Seller {
	private Integer id;
	private String name;
	private String email;
	private double baseSalary;
	private Date birthDate;
	private Department department;
	
	public Seller(Integer id, String name, String email, double baseSalary, Date birthDate, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.baseSalary = baseSalary;
		this.birthDate = birthDate;
		this.department = department;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		baseSalary = baseSalary;
	}
	
	public Seller() {
		
	}
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id: " + id + ", name: " + name + ", email: " + email + ", salary: " + baseSalary +
						", birthDate: " + birthDate + ", department: " + department + "]";
	}
	
	
}
