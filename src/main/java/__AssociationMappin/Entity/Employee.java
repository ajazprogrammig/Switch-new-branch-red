package __AssociationMappin.Entity;

import java.awt.font.GlyphVector;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer empId;
private String apmName;
private double ampSalary;

@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
private List<Address> addresses;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Integer empId, String apmName, double ampSalary) {
	super();
	this.empId = empId;
	this.apmName = apmName;
	this.ampSalary = ampSalary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getApmName() {
	return apmName;
}
public void setApmName(String apmName) {
	this.apmName = apmName;
}
public double getAmpSalary() {
	return ampSalary;
}
public void setAmpSalary(double ampSalary) {
	this.ampSalary = ampSalary;
}

public List<Address> getAddresses() {
	return addresses;
}
public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", apmName=" + apmName + ", ampSalary=" + ampSalary + "]";
}

}
